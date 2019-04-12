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
        Produto produto1 = ControladorProduto.getInstance().cadastra("Abacaxi Pérola AV 1un", "1234", 5.99, "resources/abacaxi.jpg");
        Produto produto2 = ControladorProduto.getInstance().cadastra("Água de Coco", "1235", 7.99, "resources/aguacoco.jpeg");
        Produto produto3 = ControladorProduto.getInstance().cadastra("Bombom Lacta Minions", "1236", 11.99,"resources/bombom.jpeg");
        Produto produto4 = ControladorProduto.getInstance().cadastra("Sopinha Nestlé Frango", "1237", 5.83 ,"resources/sopinha.jpeg");
        Produto produto5 = ControladorProduto.getInstance().cadastra("Suco KAPO 200ml", "1238", 2.14,"resources/kapo.jpeg");
        Produto produto6 = ControladorProduto.getInstance().cadastra("Bolacha Bono Recheada", "1239", 2.78,"resources/bono.jpeg");
        Produto produto7 = ControladorProduto.getInstance().cadastra("Ovo de páscoa Kinder", "1240", 52.89,"resources/kinder.jpg");
        Produto produto8 = ControladorProduto.getInstance().cadastra("Nescau achocolatado", "1241", 7.99,"resources/nescau.jpeg");
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
    

