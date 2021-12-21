/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa;

import javax.swing.JOptionPane;
/**
 *
 * @author Sala1
 */
public class Caixamain {

//    modificaçoes
//           usuario valor produto unitario
//quantidade de produtos
    public static void main(String[] args) {
       Carrinho carrinho = new Carrinho();
       Caixa caixa;
       int opcao = 0;
       String nome,nomeCliente,cpf;
       
       double preco;
       double peso;
               int quantidade;
       JOptionPane.showMessageDialog(null, "bem vindo ao mercadoo ");
       
       do{
           nome =JOptionPane.showInputDialog("Informe o nome do produto ");
    preco = Double.parseDouble(JOptionPane.showInputDialog("escreva o preço por unidade "));
       peso =Double.parseDouble(JOptionPane.showInputDialog("informe o peso total em kilos  "));
         quantidade = Integer.parseInt(JOptionPane.showInputDialog("informe quantas unidades quer "));
         
     opcao =Integer.parseInt(JOptionPane.showInputDialog(" adicionar mais produtos 1 - sim 0 - nao"));
     
      carrinho.Colocarproduto(nome,preco,peso,quantidade);
       }while(opcao !=0);
       nomeCliente =JOptionPane.showInputDialog("escreva o nome do cliente");
       cpf =JOptionPane.showInputDialog("informe cpf do cliente");
        caixa = new Caixa(nomeCliente,cpf,carrinho);
        
        JOptionPane.showMessageDialog(null, caixa.dadosCompra(),"resultados da compra",1);
        
    }
    
}
