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
public class Contrato {
    private int id;
    private String dataInicio;
    private double valorMensal;
    private Cliente cliente;
    private Supervisor supervisor;
    private ArrayList<ItensContrato> itens;
    
    public Contrato(){ 
        itens = new ArrayList();
        supervisor = new Supervisor();
        cliente = new Cliente();
    }
    public Contrato(int id, String dataInicio, double valorMensal, Cliente cliente, Supervisor supervisor) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.valorMensal = valorMensal;
        this.cliente = cliente;
        this.supervisor = supervisor;
        this.itens = new ArrayList();  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public ArrayList<ItensContrato> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItensContrato> itens) {
        this.itens = itens;
    }
     public void addItensContrato(ItensContrato itens){
        this.itens.add(itens);
    }
    public boolean removeItensContrato(ItensContrato itens){
       return this.itens.remove(itens);     
    }
}
