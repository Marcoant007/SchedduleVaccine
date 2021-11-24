/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Vacina;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class VacinaDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     */
    public void insert(Vacina vacina){
        Banco.vacina.add(vacina);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servico
     * @return 
     */
    public boolean update(Vacina vacina){
        
        for (int i = 0; i < Banco.vacina.size(); i++) {
            if(idSaoIguais(Banco.vacina.get(i),vacina)){
                Banco.vacina.set(i, vacina);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    public boolean delete(Vacina vacina){
        for (Vacina servicoLista : Banco.vacina) {
            if(idSaoIguais(servicoLista,vacina)){
                Banco.vacina.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Vacina> selectAll(){
        return Banco.vacina;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Vacina vacina, Vacina vacinaAComparar) {
        return vacina.getId() ==  vacinaAComparar.getId();
    }
    
}
