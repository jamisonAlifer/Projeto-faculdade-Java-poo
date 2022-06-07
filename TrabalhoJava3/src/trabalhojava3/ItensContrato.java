/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava3;

/**
 *
 * @author 20186036
 */
public class ItensContrato {
    private String dataFim;
    private double valor;
    private Servico servico;
    
    public ItensContrato(){ servico = new Servico();}
    public ItensContrato(String dataFim, double valor, Servico servico) {
        this.dataFim = dataFim;
        this.valor = valor;
        this.servico = servico;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }   

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
}
