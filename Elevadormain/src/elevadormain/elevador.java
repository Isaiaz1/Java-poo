
package elevadormain;

public class elevador {
    private int totalandares;
    private int capacidade;
    private int npessoas;
    private int andaratual;
    
    //int um = 1;
  //  andar atual (térreo = 0), 
    //total de andares no prédio (desconsiderando o térreo), 
//capacidade do elevador e quantas pessoas estão presentes nele
    
    
    void inicializa() {
		System.out.println("totalandares: " + this.getTotalandares() +
		"\ncapacidade: " + this.getCapacidade() +
		"\nandar atual "+this.getAndaratual()+
		"\npessoas: " + this.getNpessoas() 
	        );
	}
        elevador(){
            
        }
 void entra() {
     System.out.println("entra " + npessoas+1);
     
 }
 
  void sai() {
       System.out.println("sai " + (npessoas - 1));
  }
   void sobe() {
        System.out.println("sobe " + andaratual+1);
   }
    void desce() {
         System.out.println("desce " +( andaratual-1));
    }
    /**
     * @return the totalandares
     */
    public int getTotalandares() {
        return totalandares;
    }

    /**
     * @param totalandares the totalandares to set
     */
    public void setTotalandares(int totalandares) {
        this.totalandares = totalandares;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the npessoas
     */
    public int getNpessoas() {
        return npessoas;
    }

    /**
     * @param npessoas the npessoas to set
     */
    public void setNpessoas(int npessoas) {
        this.npessoas = npessoas;
    }

    /**
     * @return the andaratual
     */
    public int getAndaratual() {
        return andaratual;
    }

    /**
     * @param andaratual the andaratual to set
     */
    public void setAndaratual(int andaratual) {
        this.andaratual = andaratual;
    }
}
  
