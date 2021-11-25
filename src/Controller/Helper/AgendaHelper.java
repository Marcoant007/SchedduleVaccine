/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import View.agenda;
import java.util.ArrayList;
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
       
       // Percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                // Campos da tabela em agenda 
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
}
