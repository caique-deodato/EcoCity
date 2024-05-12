package sys;

import javax.swing.*;
import dialogues.*;
import java.awt.*;

public class Interface extends JFrame{
    JFrame frame = new JFrame();
    JPanel panelTop = new JPanel();
    JPanel panelBot = new JPanel();
    JPanel panelText = new JPanel();

    public Interface() {
        
        frame.setSize(600,500);  //Define o tamanho da janela
        frame.setTitle("Eco City");   //Da o titulo para a janela
        frame.setLocationRelativeTo(null);  //Centraliza a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Finaliza a aplicação quando fechar a janela

        //Painel superior
        panelTop.setLayout(new FlowLayout(FlowLayout.CENTER,10 , 5));  //Define o layout do painel
        panelTop.setBackground(Color.GRAY);  //Define a cor do painel
        panelTop.setPreferredSize(new Dimension(600, 300));

        //Painel inferior
        panelBot.setBackground(Color.BLACK);  //Define a cor do painel
        panelBot.setPreferredSize(new Dimension(600, 162));
    }

    private void render(JPanel top, JPanel bot){
        frame.add(panelTop, BorderLayout.NORTH);   //adiciona o painelTop na parte superior (norte) do frame
        frame.add(panelBot, BorderLayout.SOUTH);   //adiciona o painelBot na parte superior (norte) do frame
        frame.setVisible(true);                  //Exibe o frame
    }


    public void ShowOptions(Button btn1) {
        panelBot.setLayout(new GridLayout(0, 1, 5, 5));  //Define o layout do painel
        panelBot.removeAll();        //remove todos os componentes da parte de baixo do frame
        panelBot.add(btn1);          //adiciona o botão ao painel inferior
        frame.setVisible(true);  //Deixa a janela visivel
    }

    //Sobrecarga do metodo acima
    public void ShowOptions(Button btn1, Button btn2) {
        panelBot.setLayout(new GridLayout(0, 2, 5, 5));  //Define o layout do painel
        panelBot.removeAll();
        panelBot.add(btn1);
        panelBot.add(btn2);
        frame.setVisible(true);  //Deixa a janela visivel
    }

    public void ShowOptions(Button btn1, Button btn2, Button btn3) {
        panelBot.setLayout(new GridLayout(0, 3, 5, 5));  //Define o layout do painel
        panelBot.removeAll();
        panelBot.add(btn1);
        panelBot.add(btn2);
        panelBot.add(btn3);
        frame.setVisible(true);  //Deixa a janela visivel
    }

    public void ShowOptions(Button btn1, Button btn2, Button btn3, Button btn4) {
        panelBot.setLayout(new GridLayout(0, 2, 5, 5));  //Define o layout do painel
        panelBot.removeAll();
        panelBot.add(btn1);
        panelBot.add(btn2);
        panelBot.add(btn3);
        panelBot.add(btn4);
        frame.setVisible(true);  //Deixa a janela visivel
    }

    public void ShowOptions(Button btn1, Button btn2, Button btn3, Button btn4, Button btn5) {
        panelBot.setLayout(new GridLayout(0, 2, 5, 5));  //Define o layout do painel
        panelBot.removeAll();
        panelBot.add(btn1);
        panelBot.add(btn2);
        panelBot.add(btn3);
        panelBot.add(btn4);
        panelBot.add(btn5);
        frame.setVisible(true);  //Deixa a janela visivel
    }

    public void ShowOptions(Button btn1, Button btn2, Button btn3, Button btn4, Button btn5, Button btn6) {
        panelBot.setLayout(new GridLayout(0, 2, 5, 5));  //Define o layout do painel
        panelBot.removeAll();
        panelBot.add(btn1);
        panelBot.add(btn2);
        panelBot.add(btn3);
        panelBot.add(btn4);
        panelBot.add(btn5);
        panelBot.add(btn6);
        frame.setVisible(true);  //Deixa a janela visivel
    }
    


    public void ShowNarrative(TxtDialog dialog){   //Metodo que recebe um TxtDialog, classe criada para controlar textos
        panelBot.removeAll();       //Remove itens anteriores do painel inferior
        panelBot.add(dialog.Txts());        //Adiciona o texto contido no objeto TxtDialog ao painel inferior
        panelBot.add(dialog);               //Adiciona o botão de prosseguir ao painel inferior
        render(panelTop, panelText);        //Adiciona os paineis ao frame
    }

    public void ShowImage(String url){
        panelTop.removeAll();              //Remove todos os componentes do painel acima
        JLabel pic = new JLabel();          //Cria uma label
        pic.setIcon(new ImageIcon(url));    //Adiciona um icone ao label (imagem alvo)
        panelTop.add(pic);                  //adiciona a label / imagem ao painel superior
        frame.setVisible(true);  //Deixa o frame visivel
    }
    
}
