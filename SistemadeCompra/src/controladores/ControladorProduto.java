/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Produto;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jsouza
 */
public class ControladorProduto extends Controlador {

    public final ArrayList<Produto> produtos = new ArrayList<>();
    private static ControladorProduto instance;

    public static ControladorProduto getInstance() {
        if (instance == null) {
            instance = new ControladorProduto();
        }
        return instance;
    }
    
    public Produto cadastra(String nome, String codigo, String preco) throws CampoVazioException, EntidadeNotFoundException, CadastroRepetidoException {
        verificaCampoVazio(nome, "Nome");
        verificaCampoVazio(codigo, "Codigo");
        verificaCampoVazio(preco, "Preço");
        
        int codigoInt = Integer.parseInt(codigo);
        double precoDouble = Double.parseDouble(preco);
        
        
        if (getProdutoByName(nome) != null) {
            throw new CadastroRepetidoException("Erro: Produto com nome '" + nome + "' já cadastrado.");
        }
          
        Produto produto = new Produto(nome, codigoInt, precoDouble);
        produtos.add(produto);
        return produto;
    }
    
      public Produto getProdutoByName(String nome) {
        return produtos.stream()
                .filter(filme -> filme.getNome().equals(nome))
                .findFirst().orElse(null);
    }
      
        public String[] nomesProdutos() {
        List<String> names = produtos.stream().map(x -> x.getNome()).collect(Collectors.toList());
        return names.toArray(new String[0]);
    }






}



