
package caixa;

/**
 *
 * @author Sala1
 */
public class Cliente {
    private String nome;
    private String cpf;
    //construtor
    public Cliente(String nome,String cpf){
      this.nome = nome;
      this.cpf = cpf;
    }
    //encapsulamento
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
