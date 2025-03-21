package Personagem;
public class Mago extends Personagem {

    //Atributos adicionados 
    private  float mana;

// Chamando o construtor da classe Personagem
    public Mago(String nome,int vida, double forca, float mana) {
        super(nome,vida,forca);
        this.mana = mana;
    
    }

    // Gett e sett

    public float getMana() {
        return mana;
    }
    public void setMana(float mana){
        this.mana = mana;
    }

   // Sobrescrevendo o método exibir informaçoes para incluir a mana
    @Override
    public void exibirInfo() {
        super.exibirInfo();  
        System.out.println("Mana: " + mana); 
     }
}   