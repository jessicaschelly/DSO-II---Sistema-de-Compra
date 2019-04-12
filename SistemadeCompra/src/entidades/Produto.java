/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jsouza
 */
public class Produto {
    String nome;
    String codigo;
    double preco;
    String image;
    public Produto(String nome, String codigo, double preco, String image){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Object getCodigo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getPrecoString() {
        return String.format("%.2f", new Double(preco));
        
    }
}

