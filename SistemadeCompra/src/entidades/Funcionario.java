/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Funcionario {

   public String nome;
    public String ID;

    public Funcionario(String nome, String ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public String getID() {
        return ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
