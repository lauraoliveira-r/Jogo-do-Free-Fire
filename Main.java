package Personagem;
import Personagem.Guerreiro;
import Personagem.Mago;
public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro= new Guerreiro("Varian Wrynn", 3000,10000,"Shalamayne");
    Mago mago = new Mago("Khadgar",1000,10000,3000);

        //Exibindo informaçoes dos personagens 
        guerreiro.exibirInfo();
        System.out.println();
        mago.exibirInfo();
    }
}
