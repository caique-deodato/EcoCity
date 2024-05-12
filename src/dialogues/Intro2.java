package dialogues;
import fases.*;
import sys.*;

public class Intro2 extends TxtDialog{

    public Intro2(Interface frame){
        super(frame);
        texts = new String[]{
            "Leo, é um jovem ativista ambiental que vive na metrópole de Eco-City. Ele percebe que a poluição está aumentando e decide investigar."};
        setTxtArea();
    }


    @Override
    public void EndOfText(Interface frame) {
        Fase1 fase = new Fase1(frame);
    }

}