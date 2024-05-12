package actions;
import java.awt.Button;
import java.awt.Color;
import sys.*;

public class Botao extends Button{        //Classe principal para os botões
    
    public Botao(Interface frame){
        setLabel("Botão Padrão");     //Define o texto do interior do botão
        setBackground(Color.BLACK);         //Define cor de fundo do botão
        setForeground(Color.WHITE);         //Define a cor do texto do botão
        addActionListener(e -> Action(frame));   //Adiciona a função de "ler" o clique, e executa o metodo Action() após o clique
    }

    public void Action(Interface frame){
        System.out.println("Este é um botão padrão!");
    }

}
