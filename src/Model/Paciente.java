/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Pessoa;

import java.util.Date;

/**
 *
 * @author marco.araujo@etaure.srv
 */
public class Paciente extends Pessoa  {
  
    private String endereco;
    private String cep;

    public Paciente(String endereco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String cpf) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf); //super vai herdar tudo de pessoas;
        this.endereco = endereco;
        this.cep = cep;
    }

    public Paciente( int id, String nome ,String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
