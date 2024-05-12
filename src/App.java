import sys.*;
import dialogues.*;

public class App {
    public static void main(String[] args) throws Exception {
        Interface tela = new Interface();  //Cria uma interface

        tela.ShowImage("img/cidade.jpeg");  //Metodo da interface para exibir imagem na parte superior
        tela.ShowNarrative(new Intro1(tela));   //Metodo da interface para exibir texto com botao de prosseguir
    }
}
