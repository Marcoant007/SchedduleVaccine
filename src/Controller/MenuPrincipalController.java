/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.agenda;
import View.menuHome;

/**
 *
 * @author marco
 */
public class MenuPrincipalController {
        private final menuHome view;

    public MenuPrincipalController(menuHome view) {
        this.view = view;
    }
    
    public  void  navegarParaAgenda(){
        agenda agendaobj = new agenda();
        agendaobj.setVisible(true);
    }
        
        
}
