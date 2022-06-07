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
public class Pessoa {
    private int id;
    private String nome;
    private String email;
    
    public Pessoa(){}
    public Pessoa(int id, String pessoa, String email) {
        this.id = id;
        this.nome = pessoa;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setPessoa(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
