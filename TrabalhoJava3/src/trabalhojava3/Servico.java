/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava3;

import java.util.ArrayList;

/**
 *
 * @author 20186036
 */
public class Servico {
    private int id;
    private String descricao;
    private ArrayList<Funcionario> funcionarios;

    public Servico(){ funcionarios = new ArrayList();}
    
    public Servico(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        funcionarios = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public boolean removeFuncionario(Funcionario funcionario){
       return funcionarios.remove(funcionario);     
    }
}
