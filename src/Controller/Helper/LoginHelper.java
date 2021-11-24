/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import View.login;

/**
 *
 * @author marco
 */
public class LoginHelper {

    private final login view;

    public LoginHelper(login view) {
        this.view = view;
    }

    public Usuario pegarModeloUsuario() {
        String nome = view.getInputUsuario().getText();
        String senha = view.getInputSenha().getText();

        Usuario user = new Usuario(1, nome, senha);
        return user;
    }

    public void setarModeloUsuario(Usuario user){
        String nome = user.getNome();
        String senha = user.getSenha();
        
        view.getInputUsuario().setText(nome);
        view.getInputSenha().setText(senha);
    }
    
    public void cleanScreen(){
        view.getInputUsuario().setText("");
        view.getInputSenha().setText("");
    }

}
