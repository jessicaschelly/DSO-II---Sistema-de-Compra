/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import telas.CarrinhoTableModel;
import entidades.Funcionario;
import entidades.Produto;

public interface IMainFrame {

    void exibeTelaPrincipal();
    void exibeTelaCompra();
    void exibeTelaFuncionario(Funcionario funcionario);
    void exibeTelaPagamento();
    void exibeTelaCarrinho();
}
