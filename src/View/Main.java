/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import Model.Paciente;
import Model.Pessoa;
import Model.Usuario;
import Model.Vacina;

/**
 *
 * @author marco.araujo@etaure.srv
 */
public class Main {
    
    public static void main(String[] args) {
        
        Vacina vacina = new Vacina( 1, "corona", 0);
         
         Paciente paciente = new Paciente(1, "Marco", "Rua josé fodase","29175230");
         System.out.println(paciente.getNome());
         
         Usuario usuario = new Usuario(1, "Médico", "1232141234");
         System.out.println(usuario);
         
    }
    
}
