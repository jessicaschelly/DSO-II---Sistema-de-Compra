/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecompra;

import controladores.ControladorEntidades;
import telas.MainFrame;

/**
 *
 * @author jsouza
 */
public class SistemadeCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorEntidades.getInstance();
        MainFrame mf = new MainFrame();
         mf.setLocation(0, 100);
        mf.setVisible(true);
        mf.exibeTelaPrincipal();
      
    }
    
}
