package fases;
import sys.*;
import dialogues.*;

public class Fase1 {
   
    public Fase1(Interface frame){
        frame.ShowImage("img/caminhao.jpeg");
        frame.ShowNarrative(new Fase1_1(frame));
    }

}
