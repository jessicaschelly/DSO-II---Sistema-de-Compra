/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Carrinho;
import entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jsouza
 */
public class ControladorCarrinho {

    Carrinho carrinho;
    private static ControladorCarrinho instance;
    List<Produto> produtosComprados = new ArrayList<Produto>();
    List<Produto> produtosCompradosRelatorio = new ArrayList<Produto>(produtosComprados);

    private Double total = 0.0;
    private Double totalRelatorio = 0.0;

    public static ControladorCarrinho getInstance() {
        if (instance == null) {

            instance = new ControladorCarrinho();
        }
        return instance;
    }

    public void adiciona(Produto produto) {
        produtosComprados.add(produto);
        total += produto.getPreco();
    }

    public void remove(int indiceItem) {
        Produto removido = produtosComprados.remove(indiceItem);
        total -= removido.getPreco();
    }

    public List<Produto> getRelatorio() {
        produtosComprados = produtosCompradosRelatorio;
        return produtosCompradosRelatorio;
    }

    public String[] nomesProdutos() {
        List<String> names = produtosComprados.stream().map(x -> x.getNome()).collect(Collectors.toList());
        return names.toArray(new String[0]);
    }

    public String[] CodNomePrecoProdutos() {
        List<String> names = produtosComprados.stream().map(x -> x.getCodigo() + " " + x.getNome() + "    R$: " + x.getPreco()).collect(Collectors.toList());
        return names.toArray(new String[0]);
    }

    public String[] CodNomePrecoProdutosRelatorio() {
        List<String> names = produtosCompradosRelatorio.stream().map(x -> x.getCodigo() + " " + x.getNome() + "    R$: " + x.getPreco()).collect(Collectors.toList());
        return names.toArray(new String[0]);
    }

    public String getTotal() {
         return String.format("%.2f", new Double(total));
    }
  public String getTotalRelatorio() {
         double soma = 0;
         for(Produto produto : produtosCompradosRelatorio){
             soma += produto.getPreco();
         }
                 return String.format("%.2f", new Double(soma));
    }
    public double getTotalDouble() {
        return total;
    }
    
    public void transformaListRelatorio(){ 
            produtosCompradosRelatorio.addAll(produtosComprados);
    }
    

    public List<Produto> clearItens() {
        produtosComprados.clear();
        total = 0.0;
        return produtosComprados;
    }

}
