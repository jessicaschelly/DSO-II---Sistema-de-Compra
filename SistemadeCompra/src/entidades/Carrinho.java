/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import controladores.ControladorProduto;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author jsouza
 */

public class Carrinho {

List<Produto> produtosComprados = new ArrayList<Produto>();
     private static Carrinho instance;
    public static Carrinho getInstance() {
     
        if (instance == null) {
            instance = new Carrinho();
        }
        return instance;
    }

    public void setItens(List<Produto> itens) {
        this.produtosComprados = itens;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
  private Double total = 0.00;

    public List<Produto> getItens() {
        return produtosComprados;
    }

    public Double getTotal() {
        return total;
    }

    public Integer getTotalDeProdutos() {
    return produtosComprados.size();
  }
    
   
  
    
}
