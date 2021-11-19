/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Vacina;

/**
 *
 * @author marco.araujo@etaure.srv
 */
public class Main {
    
    public static void main(String[] args) {
        String nome =  "Marco";
        System.err.println(nome);
        
        Vacina vacina = new Vacina( 1, "corona", 0);
        System.out.println(vacina.getDescricao());
         System.out.println(vacina.getValor());
    }
    
}
