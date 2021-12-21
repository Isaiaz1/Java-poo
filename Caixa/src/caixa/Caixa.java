/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa;

/**
 *
 * @author Sala1
 */
public class Caixa {
    private final Cliente cliente;
            private final Carrinho carrinho;

public Caixa(String Nomecliente,String Cpfcliente,Carrinho carrinho){
    this.cliente = new Cliente(Nomecliente,Cpfcliente);
    this.carrinho = carrinho;
}
public String dadosCompra(){
    String saida = "";
    saida += "Cliente "+ cliente.getNome()+ "\n \n"+
             "Cpf "+ cliente.getCpf()+ "\n \n"+
             "\n                CARRINHO  \n" +
    carrinho.listarProdutos();
    return saida;
}
}
