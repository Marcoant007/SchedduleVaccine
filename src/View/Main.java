/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import Model.Agendamento;
import Model.Paciente;
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
         
         Usuario usuario = new Usuario(1, "Médico", "1232141234");
         
         Agendamento agendamento = new Agendamento(1, paciente, vacina, 0, "27/02/2022 09:30" );
         System.out.println(agendamento.getPaciente().getNome());
         
    }
    
}
