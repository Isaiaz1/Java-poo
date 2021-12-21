//import java.text.DecimalFormat;
package caixa;
import java.text.DecimalFormat;
/**
 *
 
 */
public class produto {
    private String nome;
    private double precototal;
     private double peso;
      private double precounitario;
      
      int tipo;
      
      //
private int quantidade;
      
      public produto(String nome,double precounitario,double peso,
              //
              int quantidade){
          this.nome = nome;
          this.precounitario = precounitario;
          this.peso = peso;
          //
          this.quantidade = quantidade;
      }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public double getPrecototal() {
        return (this.peso*this.precounitario);
                //precototal;
    }

    
    public void setPrecototal(double precototal) {
        this.precototal = precototal;
    }

    public double getPeso() {
        return peso;
    }

    
    public void setPeso(double peso) {
        if(peso <0){
        this.peso = 0;
        }else{
this.peso = peso;
        }
    }
   
    public double getPrecounitario() {
        return precounitario;
    }

    public void setPrecounitario(double precounitario) {
        if(precounitario<0){
            this.precounitario = 0;
        
                }else{
        this.precounitario = precounitario;
    }
    }
    public String getInfoProduto(){
        DecimalFormat decimalFormat = new
        DecimalFormat("0.00");
        return "produto " + this.nome + " \n preço unitario RS:  \n" 
                +decimalFormat.format( this.precounitario)+
                "\n peso "+decimalFormat.format(this.peso)+ "\n"+
                
                "\n total RS "+decimalFormat.format(this.precototal)+
                
                /////////
                
                "\n quantidade \n"+this.quantidade
                ;
    }

    /////////////////
    
    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

  
    public void setQuantidade(int quantidade) {
        if(quantidade>0){
        quantidade = (int) (precounitario*quantidade);   
        
        this.quantidade = quantidade;
    }else{
        this.quantidade = quantidade;
    }
}}
