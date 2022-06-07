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
public class Cliente extends Pessoa {
    private double divida;

    public Cliente() {super(); }

    public Cliente(int id, String nome, String email, double divida) {
        super(id, nome, email);
        this.divida = divida;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
    
    
}
