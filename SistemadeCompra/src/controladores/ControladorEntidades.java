/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Funcionario;
import entidades.Produto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsouza
 */
public class ControladorEntidades extends Controlador {

    public final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public final ArrayList<Produto> produtos = new ArrayList<>();
   
    private static ControladorEntidades instance;

    public static ControladorEntidades getInstance() {
        if (instance == null) {
            instance = new ControladorEntidades();
        }
        return instance;
    }
    public ControladorEntidades() {
        /* Adicionar funcionários */
        funcionarios.add(new Funcionario("Frank", "123"));
        funcionarios.add(new Funcionario("Jéssica", "321"));
        funcionarios.add(new Funcionario("Henrique", "111"));
        
        produtos.add(new Produto("Abacaxi Pérola AV 1un", "1234", 5.99));
        produtos.add(new Produto("Água de Coco", "1235", 7.99));
        produtos.add(new Produto("Bombom Lacta Minions", "1236", 11.95));
        produtos.add(new Produto("Sopinha Nestlé Frango", "1237", 5.83));
        produtos.add(new Produto("Suco KAPO 200ml", "1238", 2.14));
        produtos.add(new Produto("Bolacha Bono Recheada", "1239", 2.78));
        produtos.add(new Produto("Refrigerante cocacola café", "1240", 1.89));
        produtos.add(new Produto("Nescau achocolatado", "1241", 7.99));
    }
    
    
    public Funcionario getFuncionarioById(String id) {
        return funcionarios.stream()
                .filter(func -> func.getID().equals(id))
                .findFirst().orElse(null);
    }
      public Produto getProdutoByCod(String id) {
        return produtos.stream()
                .filter(prod -> prod.getCodigo().equals(id))
                .findFirst().orElse(null);
    }


 
    
  
}
    

