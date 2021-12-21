/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a02;

/**
 *
 * @author Sala1
 */
public class A02 {

    /**
 
     */
    public static void main(String[] args) {
        Fisica pessoafisica = new Fisica("mario","1235");
        System.out.println(pessoafisica.getNome());
         System.out.println(pessoafisica.getCPF());
        
          Juridica pessoajuri = new Juridica("Maria","112436");
        System.out.println(pessoajuri.getNome());
         System.out.println(pessoajuri.getCNPJ());
    }
    
}
