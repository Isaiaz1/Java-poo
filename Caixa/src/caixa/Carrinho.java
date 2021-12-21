
//import java util.ArrayList;

package caixa;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrinho {
    private final ArrayList <produto> produtoSelecionado;
    private double peso = 0.0;
     private double totalPagar =0.0;
         private final double desconto =0.0;
              
              
              public Carrinho(){
                  produtoSelecionado = new ArrayList();
                  
                  
              }
         public void Colocarproduto(String nomeProduto,double precoProduto 
         ,double pesoProduto,int quantidadeProduto ){
         produto produto1 = new produto(nomeProduto, precoProduto,pesoProduto,quantidadeProduto);
         produtoSelecionado.add(produto1);
         this.peso += pesoProduto;
         this.totalPagar += precoProduto*
                 //
                 quantidadeProduto;
         
         
        // this.
              }
              public String listarProdutos(){
                  Iterator iteratorProdutos = produtoSelecionado.iterator();
                  produto produto2;
                  String saida = "";
                  while(iteratorProdutos.hasNext()){
                      produto2 = (produto)iteratorProdutos.next();
                      saida += produto2.getInfoProduto();
                  }
                  saida += "\n peso total: "+ this.peso+"\n";
                  saida += "\n preco total: "+ this.totalPagar +"\n";
                               //   saida += "\nproduto: "+ this.nome;
                                 
                  return saida;
                  
              }
              
}
