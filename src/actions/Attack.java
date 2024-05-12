package actions;

import sys.*;

public class Attack extends Botao{
    
    public Attack(Interface frame){
        super(frame);
        setLabel("Atacar");  //Define o texto do botão
    }
    
    @Override public void Action(Interface frame){   //Define a ação do botão
        System.out.println("Este foi um ataque");
    }
}
