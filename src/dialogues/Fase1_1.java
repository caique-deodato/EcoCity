package dialogues;
import actions.*;
import sys.*;

public class Fase1_1 extends TxtDialog{

    public Fase1_1(Interface frame){
        super(frame);
        texts = new String[]{
            "Em uma manhã ensolarada, Léo caminha pelas ruas de Eco City e sente um cheiro muito ruim, começa a seguir o odor e duas quadras abaixo de sua casa se depara com uma esquina cheia de lixo! o começo de um lixão se formando!",
            "Capitão lixo, como foi nomeado pelas crianças do bairro é um morador da cidade que  recolhe lixo pelas ruas para seu sustendo, porem não finaliza o trabalho e acumula tudo em frente a sua casa.",
            "Nos ajude a limpar e conscientizar capitão lixo!"};
        setTxtArea();
    }


    @Override
    public void EndOfText(Interface frame) {
        frame.ShowOptions(new Attack(frame), new Defense(frame));
    }

}