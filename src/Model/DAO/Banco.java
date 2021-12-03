/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Paciente;
import Model.Usuario;
import Model.Vacina;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Paciente> paciente;
    public static ArrayList<Vacina> vacina;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        paciente = new ArrayList<Paciente>();
        vacina = new ArrayList<Vacina>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "Marco", 'M', "09/05/1996", "30212121", "marcoantnovo@gmail.com", "521454123", "marco", "administrador");
        Usuario usuario2 = new Usuario(2, "estagiario", 'M', "09/05/1996", "30212122", "estagiario@unimed.com", "451244123", "estagiario", "funcionario");
      
        Paciente paciente1 = new Paciente(1, "Giorgia de Arrascaeta", 'M', "30/01/1995", "30212126", "arraxca@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Paciente paciente2 = new Paciente(2, "Maynara Borlot", 'F', "30/08/1998", "30212127", "maynara@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Paciente paciente3 = new Paciente(3, "Marco Antonio", 'M', "24/04/1997", "30212128", "marcoantnovo@gmail.com", "17816783752", "Rua José Pereira 32",  "29175230");
        Paciente paciente4 = new Paciente(4, "Antonio Lopim", 'M', "20/08/1995", "30212130", "antoniol@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Paciente paciente5 = new Paciente(5, "José", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Paciente paciente6 = new Paciente(6, "João Augusto", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Paciente paciente7 = new Paciente(7, "Karol Vieira", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Paciente paciente8 = new Paciente(8, "Anna Julia", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Paciente paciente9 = new Paciente(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Paciente paciente10 = new Paciente(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Vacina vacina1 = new Vacina(1, "Hexavalente", 139);
        Vacina vacina2 = new Vacina(2, "Rotavírus", 150);
        Vacina vacina3 = new Vacina(3, "Febre Amarela", 153);
        Vacina vacina4 = new Vacina(4, "Febre Tifoide", 200);
        Vacina vacina5 = new Vacina(5, "Dengue", 70);
        Vacina vacina6 = new Vacina(6, "Pfizer", 0);
        Vacina vacina7 = new Vacina(7, "CoronaVac", 0);

//        Agendamento agendamento1 = new Agendamento(1, paciente2, vacina2, 30, "14/07/2018 09:30");
//        Agendamento agendamento2 = new Agendamento(2, paciente3, vacina4, 40, "14/07/2018 10:00");
//        Agendamento agendamento3 = new Agendamento(3, paciente4, vacina5, 18, "14/07/2018 10:30");
//        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        paciente.add(paciente1);
        paciente.add(paciente2);
        paciente.add(paciente3);
        paciente.add(paciente4);
        paciente.add(paciente5);
        paciente.add(paciente6);
        paciente.add(paciente7);
        paciente.add(paciente8);
        paciente.add(paciente9);
        paciente.add(paciente10);
        
        vacina.add(vacina1);
        vacina.add(vacina2);
        vacina.add(vacina3);
        vacina.add(vacina4);
        vacina.add(vacina5);
        vacina.add(vacina6);
        vacina.add(vacina7);
        
//        agendamento.add(agendamento1);
//        agendamento.add(agendamento2);
//        agendamento.add(agendamento3);
//        
    }
    
    
}
