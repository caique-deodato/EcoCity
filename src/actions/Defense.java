package actions;
import sys.*;

public class Defense extends Botao{
    
    public Defense(Interface frame){
        super(frame);
        setLabel("Defender");  //Define o texto do botão
    }
    
    @Override public void Action(Interface frame){   //Define a ação do botão
        System.out.println("Esta foi uma defesa");
    }
}
