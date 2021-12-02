/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import static Model.DAO.Banco.paciente;
import Model.DAO.PacienteDAO;
import Model.DAO.VacinaDAO;
import Model.Paciente;
import Model.Vacina;
import View.agenda;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class AgendaController {
    private final agenda view;
    private final AgendaHelper helper;

    public AgendaController(agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
    
        // Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
                
        // Exibir esta em View
        helper.preencherTabela(agendamentos); 
    }
    
    public void atualizaPaciente(){
        
        //Buscar Clientes do banco de dados
        PacienteDAO pacienteDAO = new PacienteDAO();
        ArrayList<Paciente> pacientes = pacienteDAO.selectAll();
        
        //Exibir Clentes no combobox cliente
        helper.preencherPacientes(pacientes);
    }
    
    public void atualizaVacina(){
        //Buscar Clientes do banco de dados
        VacinaDAO vacinaDAO = new VacinaDAO();
        ArrayList<Vacina> vacinas = vacinaDAO.selectAll();
        
        //Exibir Clentes no combobox cliente
        helper.preencherVacinas(vacinas);
     }
    public void atualizaValor() {
        Vacina vacina = helper.obterVacina();
        helper.setarValor(vacina.getValor());
    }
    public void agendar(){
        Agendamento agendamento = helper.pegarModeloUsuario();
        new AgendamentoDAO().insert(agendamento);
        atualizaTabela();
        helper.cleanScreen();
    }
    }
