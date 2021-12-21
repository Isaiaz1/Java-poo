
package aula1poo;
//MAIN
/**
 *
 * @author Sala1
 */
public class AUla1poo {

   
    public static void main(String[] args) {
     //   Janela janela = new Janela(10,4,true,"verde","aço");
      
        Janela janela = new Janela();
        janela.setAltura(10);
       // janela.altura =10;
      //  janela.largura = 4;
        janela.setLargura(4);
       // janela.aberta = true;
        janela.setAberta(true);
       janela.setCor("azul");
       janela.setMaterial("aço");
              //  janela.material ="madeira";
     //   janela.cor = "azul";
        
        janela.imprimir();
    }
    
}
