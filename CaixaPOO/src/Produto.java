import java.text.DecimalFormat;

public class Produto {
	
	private String nome;
	private double precoTotal;
	private double peso;
	private double precoUnitario;
	
	//Construtor
	public Produto(String nome, double precoUnitario, double peso) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.peso = peso;
	}
	
	//Encapsulamento
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrecoTotal() {
		return (this.peso * this.precoUnitario);
	}
	
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso < 0) {
			this.peso = 0;
		}else {
			this.peso = peso;
		}
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public void setPrecoUnitario(double precoUnitario){
		if(precoUnitario < 0 ) {
			this.precoUnitario = 0;
		}else {
			this.precoUnitario = precoUnitario;
		}
	}
	
	public String getInfoProduto() {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		return "Produto: " 			 + this.nome 								+ "\n" +
			   "Preco Unitario: R$ " + decimalFormat.format(this.precoUnitario) + "\n" +
			   "Peso: " 			 + decimalFormat.format(this.peso) 			+ "\n" +
			   "Total: R$ " 		 + decimalFormat.format(this.precoTotal);
	}
	

}
