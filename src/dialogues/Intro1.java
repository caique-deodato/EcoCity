package dialogues;
import sys.*;

public class Intro1 extends TxtDialog{

    public Intro1(Interface frame){
        super(frame);
        texts = new String[]{
            "Bem vindo a Eco-City,uma cidade conhecida por se situar próxima de uma floresta e conviver em harmonia com ela, porém tudo isso está em risco!!.",
            "Seu céu já não é mais tão limpo, lixos são encontrados pela rua e atos de vandalismo começam a se popularizar."};
        setTxtArea();
    }


    @Override
    public void EndOfText(Interface frame) {
        frame.ShowImage("img/leo.jpg");
        frame.ShowNarrative(new Intro2(frame));
    }

}