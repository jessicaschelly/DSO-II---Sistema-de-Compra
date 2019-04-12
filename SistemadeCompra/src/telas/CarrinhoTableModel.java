/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controladores.ControladorCarrinho;
import entidades.Carrinho;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jsouza
 */
public class CarrinhoTableModel extends AbstractTableModel {
 private final Carrinho carrinho = new Carrinho();
 private final ControladorCarrinho controladorCarrinho = new ControladorCarrinho();
    @Override 
    public int getRowCount() {
      return carrinho.getTotalDeProdutos();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
 @Override
    public String getColumnName(int col) { 
       String [] a = {"Código","Produto","Preço"};
      return a[col]; 
   } 

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}

