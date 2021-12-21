package a02;


import A02.Pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sala1
 */
public class Fisica extends Pessoa{
    private String CPF;
    
    public Fisica(String nome){
        super();
    }
    public Fisica(String nome,String CPF){
        super(nome);
        this.CPF = CPF;
    }
    public String getCPF(){
    return CPF;
    }
        
    }

