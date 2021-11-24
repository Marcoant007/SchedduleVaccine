/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.login;
import View.menuHome;

/**
 *
 * @author marco
 */
public class LoginController {
        private LoginHelper helper;
        private final login view;
    
    public LoginController(login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void  enterTheSystem(){
       Usuario user = helper.pegarModeloUsuario();
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado  = usuarioDAO.selectPorNomeESenha(user);
       
       if(usuarioAutenticado != null){
           menuHome menu = new menuHome();
           menu.setVisible(true);
           this.view.dispose();
       }else {
           view.openMessage("Usuário e senha inválido");
       }
    }
    
    public void tasks(){
        System.out.println("Busca no banco de dados");
        this.view.openMessage("Tarefa executada ");
    }
    
    
    
}
