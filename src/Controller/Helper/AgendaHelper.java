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
public class AgendaHelper implements IHelper{
    
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
    public Paciente obterPaciente() {
       return (Paciente) view.getComboBoxPaciente().getSelectedItem();
    }
    
    
    public Vacina obterVacina() {
       return (Vacina) view.getComboBoxVacina().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getInputIValor().setText(valor+"");
    }

    @Override
    public Agendamento pegarModeloUsuario() {
        //TODO converta os atributos para string
       String idString  = view.getInputId().getText();  
       int id = Integer.parseInt(idString);
       
       Paciente paciente = obterPaciente();
       Vacina vacina = obterVacina();
       
       String valorString = view.getInputIValor().getText();
       float valor = Float.parseFloat(valorString);
       
       String data = view.getInputIData().getText();
       String hora = view.getInputIHora().getText();
       String dataHora = data + " " + hora;
       String observacao = view.getTextAreaObservacao().getText();
       
       Agendamento agendamento = new Agendamento(id,paciente,vacina,valor,dataHora,observacao);
       return agendamento;
       
       
    }

    @Override
    public void cleanScreen() {
        view.getInputId().setText("0");
        view.getInputIData().setText("");
        view.getInputIHora().setText("");
        view.getTextAreaObservacao().setText("");
    }

    
}
