package Services;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * @author Marco Antonio
 */
public class Email {

    static final String nomeEmail = "vaccineschedulefaesa@gmail.com";
    static final String senhaEmail = "vacina123";
    private String assunto;
    private String mensagem;
    private String destinatario;

    public Email(String assunto, String mensagem, String destinatario) {
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    /**
     * Função para enviar o e-mail ao destinatário.
     */
    public void enviar() {
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSslSmtpPort("587");
        email.setAuthenticator(new DefaultAuthenticator(nomeEmail, senhaEmail));
        email.setSSLOnConnect(true);
        try {
            email.setFrom(nomeEmail);
            email.setSubject(this.assunto);
            email.setMsg(this.mensagem);
            email.addTo(this.destinatario);
             System.out.println("Enviando email para :" + this.destinatario);
            email.setDebug(true);
            email.send();
         

        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
