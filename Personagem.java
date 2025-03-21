//Super classe Personagem.java
package Personagem;
public class Personagem{
    private String nome;
    private int vida;
    private float forca;

    //Construtor da classe Personagem

    public Personagem(String nome, int vida, float forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }
    // Getts e setts

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
        
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public float getForca(){
        return forca;
    }
    public void setForca(float forca){
        this.forca = forca;
    }
    // Metodo exibindo informaçoes que pode ser usado pelas subclasses
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
    }
}
