/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadormain;

import java.util.Scanner;

/**
 *
 * @author Sala1
 */
public class Elevadormain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         elevador elevador1 = new elevador();
        elevador1.setTotalandares(8);
      
        elevador1.setCapacidade(5);
       
        elevador1.setNpessoas(0);
      elevador1.setAndaratual(0);
     
        
       // elevador1.inicializa();
    
        
        
        
        Scanner entrada = new Scanner(System.in);
        
        
  System.out.println("1 = inicializa , 2 = Entra ,3 =sai,4=sobe,5= desce");
  int num = entrada.nextInt();
  switch (num) {
     case 1:
         elevador1.inicializa();
     
       break;
     case 2:
         elevador1.entra();
       
       break;
     case 3:
       elevador1.sai();
       break;
     case 4:
       elevador1.sobe();
       break;
     case 5:
         elevador1.desce();
         break;
     default:
       System.out.println("Número inválido");
        
        
  }}}
        
        
        
        
        
        // TODO code application logic here

    
    

