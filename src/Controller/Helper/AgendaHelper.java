/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Paciente;
import Model.Vacina;
import View.agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class AgendaHelper {
    
    private final agenda view;

    public AgendaHelper(agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel =  (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getPaciente().getNome(),
                agendamento.getVacina().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencherPacientes(ArrayList<Paciente> pacientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxPaciente().getModel();
        
        for (Paciente paciente : pacientes){
            comboBoxModel.addElement(paciente);
        }
    }

    public void preencherVacinas(ArrayList<Vacina> vacinas) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxVacina().getModel();
        
        for (Vacina vacina : vacinas){
            comboBoxModel.addElement(vacina);
        }
        
    }

    public Vacina obterVacina() {
       return (Vacina) view.getComboBoxVacina().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getInputIValor().setText(valor+"");
    }

    
}
