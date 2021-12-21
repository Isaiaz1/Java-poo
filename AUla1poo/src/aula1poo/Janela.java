/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1poo;

/**
 *
 * @author Sala1
 */

public class Janela {
	
	private int largura, altura;
	private boolean aberta;
	private String cor, material;
	
	void imprimir() {
		System.out.println("Altura: " + this.getAltura() +
		"\nLargura: " + this.getLargura() +
		"\nMateria: " + this.getMaterial() +
		"\nCor: " + this.getCor() +
	        "\nAberta: " + this.isAberta());
	}
        Janela(){
            
        }
Janela(int largura,int altura,boolean aberta,String cor,String material){
    //objeto        parametro
    this.largura = largura;
    this.altura = altura;
    this.cor = cor;
    this.aberta = aberta;
    this.material = material;
    
    
}
    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the aberta
     */
    public boolean isAberta() {
        return aberta;
    }

    /**
     * @param aberta the aberta to set
     */
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}

