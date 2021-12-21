import java.util.ArrayList;
import java.util.Iterator;

public class Carrinho {
	
	private ArrayList<Produto> produtosSelecionados;
	private double peso = 0.0;
	private double totalPagar = 0.0;
	private double desconto = 0.0;
	
	public Carrinho() {
		produtosSelecionados = new ArrayList();
	}
	
	public void adicionarProduto(String nomeProduto, double precoProduto, double pesoProduto) {
		Produto produto = new Produto(nomeProduto, precoProduto, pesoProduto);
		produtosSelecionados.add(produto);
		
		this.peso += pesoProduto;
		this.totalPagar += precoProduto;
	}
	
	public String listarProdutos() {
		Iterator iteratorProdutos = produtosSelecionados.iterator();
		return "";
	}
	
	
	

}
