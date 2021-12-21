package a02;


import A02.Pessoa;


/**
 *
 * @author Sala1
 */
public class Juridica extends Pessoa{
     private String CNPJ;

public Juridica(){
    super();
}
public Juridica(String nome,String CNPJ){
    super(nome);
    this.CNPJ = CNPJ;
    
    
}
public String getCNPJ(){
    return CNPJ;
}

}

