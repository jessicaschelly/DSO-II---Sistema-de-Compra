/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entidades.Funcionario;
import interfaces.IMainFrame;
import java.awt.BorderLayout;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author jsouza
 */
public class MainFrame extends javax.swing.JFrame implements IMainFrame {

    /**
     * Creates new form MainFrame2
     */
    public MainFrame() {
        initComponents(); 
        setTitle("Supermercado Magia");

        setLocationRelativeTo(null);
        setSize(1020,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void exibeTelaPrincipal() {
       TelaPrincipal tf = new TelaPrincipal();
        setContentPane(tf);

        validate();
    }
    public void exibeTelaCompra() {
       TelaCompra tf = new TelaCompra();
        setContentPane(tf);

        validate();
    }
    
    Funcionario funcionarioLogado;
    
    public void exibeTelaFuncionario(Funcionario funcionario) {
        funcionarioLogado = funcionario;
        TelaFuncionario tf = new TelaFuncionario(funcionario);
        setContentPane(tf);

        validate();
    }
    
      public void exibeTelaCarrinho() {
       TelaCarrinho tf = new TelaCarrinho();
        setContentPane(tf);

        validate();
    }
       public void exibeTelaPagamento() {
       TelaPagamento tf = new TelaPagamento();
        setContentPane(tf);

        validate();
    }
        public void exibeTelaNotaFiscal() {
       TelaNotaFiscal tf = new TelaNotaFiscal();
        setContentPane(tf);

        validate();
    }

   
    }


 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

