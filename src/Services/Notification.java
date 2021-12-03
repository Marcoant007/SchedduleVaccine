/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Agendamento;

/**
 *
 * @author marco
 */
public class Notification {
    public void NotificarAgendamentoPorEmail(Agendamento agendamento){
        String emailPaciente = agendamento.getPaciente().getEmail();
        String emailCorpo = formarEmail(agendamento);
        String destinatario = emailPaciente;
        
        Email email = new Email("Agendamento Realizado ", emailCorpo, destinatario);
        email.enviar();
        
    }

    private String formarEmail(Agendamento agendamento) {
        String paciente = agendamento.getPaciente().getNome();
        String vacina = agendamento.getVacina().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valorVacina = agendamento.getValor();
        
        String body = "Olá  " +  paciente +  "tudo bem ?  \n" + "Seu atendimento será realizado na data :  " + dataAgendamento + "no horário previsto de: " + horaAgendamento + "." + "Vacina: " + vacina  + "valor : " + valorVacina; 
        
        return body;
    }
    
}
