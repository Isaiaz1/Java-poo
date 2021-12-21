package A02;
/**
 *
 * @author Sala1
 */
public abstract class Pessoa {
    protected String nome;
    protected Pessoa(){
        this.nome = " sem nome";
    }
     protected Pessoa(String nome){
         this.nome = nome;
     }
     public String getNome(){
         return nome;
     }
     
}
