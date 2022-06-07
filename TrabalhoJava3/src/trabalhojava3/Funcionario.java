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
public class Funcionario extends Pessoa {
    private double salario;
    private int cargaHoraria;
    private Cargo cargo;
    private Supervisor supervisor;
    
    
    public Funcionario() { 
        super(); 
        cargo = new Cargo();
        supervisor = new Supervisor();
    }

    public Funcionario(int id, String nome, String email,double salario, int cargaHoraria, Cargo cargo, Supervisor supervisor) {
        super(id, nome, email);
        this.salario = salario;
        this.cargaHoraria =cargaHoraria;
        this.cargo = cargo;
        this.supervisor = supervisor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
    
    
}
