package dialogues;

import sys.Interface;
import javax.swing.JTextArea;
import java.awt.*;
import actions.Attack;
import actions.Botao;
import actions.Defense;

public class TxtDialog extends Botao{

    protected int textNum = 0;
    protected JTextArea txtArea = new JTextArea();
    protected String[] texts = new String[1];

    public TxtDialog(Interface frame){
        super(frame);    //comando necessário para herdar o metodo construtor da classe botao
        
        setPreferredSize(new Dimension(50, 155));  //Define o tamanho do botão de prosseguir
        setLabel("-->");  //Define o texto do botão
    }

    public void setTxtArea(){
        //Definição dos parametros da area de texto
        txtArea.setEditable(false);
        txtArea.setLineWrap(true);
        txtArea.setAlignmentY(CENTER_ALIGNMENT);
        txtArea.setAlignmentX(CENTER_ALIGNMENT);
        txtArea.setBackground(Color.BLACK);
        txtArea.setForeground(Color.WHITE);
        txtArea.setFont(new Font("Arial", Font.PLAIN, 14));
        txtArea.setPreferredSize(new Dimension(500, 100));
        txtArea.setText(texts[textNum]);  //Define o texto da TextArea para o indice atual da array de strings
    }

    public JTextArea Txts(){
        return this.txtArea;   //Retorna a area de texto
    }

    @Override public void Action(Interface frame){   //Define a ação do botão
        textNum = textNum + 1;               //Acrescenta/troca de texto a cada clique
        if (textNum < texts.length){
            txtArea.setText(texts[textNum]);
        }
        else{
            EndOfText(frame);          //Caso a lista de textos tenha acabado (final da array), executa o EndOfText
        }
    }

    public void EndOfText(Interface frame){    //Define o que é executado quando o texto acaba
        System.out.println("Texto encerrado!");
        frame.ShowImage("img/cidade.jpeg");
        //Metodo para exibir botões na parte inferior do painel
        frame.ShowOptions(new Attack(frame), new Defense(frame), new Botao(frame), new Attack(frame));
    } 
}
