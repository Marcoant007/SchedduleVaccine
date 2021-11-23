/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.login;

/**
 *
 * @author marco
 */
public class LoginController {

        private final login view;
    
    public LoginController(login view) {
        this.view = view;
    }
    
    public void  enterTheSystem(){
        
    }
    
    public void Tasks(){
        System.out.println("Busca no banco de dados");
        this.view.openMessage("Tarefa executada ");
    }
    
    
    
}
