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
        
          try {

            Produto produto1 = ControladorProduto.getInstance().cadastra("Banana", "1234", "2,99");
            Produto produto2 = ControladorProduto.getInstance().cadastra("Fralda", "1235", "9,99");
            Produto produto3 = ControladorProduto.getInstance().cadastra("Leite", "1236", "3,56");
            Produto produto4 = ControladorProduto.getInstance().cadastra("Shampoo", "1237", "6,50");
            
        } catch (Exception ex) {
            Logger.getLogger(ControladorEntidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Funcionario getFuncionarioById(String id) {
        return funcionarios.stream()
                .filter(func -> func.getID().equals(id))
                .findFirst().orElse(null);
    }
    
 
    
  
}
    

