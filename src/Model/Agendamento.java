/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marco
 */
public class Agendamento {
    
    private int id;
    private Paciente paciente;
    private Vacina vacina;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(int id, Paciente paciente, Vacina vacina, float valor, String data) {
        this.id = id;
        this.paciente = paciente;
        this.vacina = vacina;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Agendamento(int id, Paciente paciente, Vacina vacina, float valor, String data, String observacao) {
        this(id,paciente,vacina,valor,data);
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDataFormatada() {
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
    public String getHoraFormatada() {
        return new SimpleDateFormat("HH:mm").format(data);   
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
