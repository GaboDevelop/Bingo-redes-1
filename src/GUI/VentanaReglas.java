
package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaReglas extends JFrame
{

    public VentanaReglas()
    {
        panelPrincipal = (JPanel)getContentPane();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, 1));
        JTextArea reglas = new JTextArea("\n- En cada juego de Bingo existe un anunciante o pizarra \n"
                + "  donde se indican  los n\372meros  de  las bolas que van \n  saliendo \n\n- Para efectos"
                + " del proyecto se deberan correr maximo 4 \n jugadores y por cada jugador un maximo de 2 cartones."
                + "\n\n- Cada cartón cuenta con una numeración, que para el \n presente proyecto , será identificado "
                + "con las letras del “abcdario”\n en general Cartón  “A”, “B”, …, “Z”.  que en caso que algún o\n jugador"
                + " o varios cante “Bingo” deberá  ser verificado\n como cartón ganador. Cabe destacar que pueden existir\n"
                + " varios cartones ganadores en un Bingo.\n\n - Existen muchas formas de ganar en el bingo"
                + "\n\n - Cada cartón es único y tiene 24 números aleatorios que van\n desde 1 hasta 75.\n" 
                + "•	La columna \"B\" se utiliza para los números 1 a 15;\n " 
                + "•	La columna \"I\" varía de 16 a 30; \n" 
                + "•	\"N\" de 31 a 45; \n" 
                + "•	\"G\" de 46 a 60; \n" 
                + "•	\"O\" de 61 a 75.  "
                + "\n\n- El  juego  termina  cuando uno  o  m\341s jugadores canten \n  \"BINGO\" al "
                + " completar  el Cart\363n o alguna de las figuras \n  mencionadas. Al  cantar \"BINGO\",  el  juego  se  detiene \n  "
                + "inmediatamente  y  se  verifican los n\372meros y la figura. \n  Si hay un ganador, se le otorga el premio."
                + " Si hay m\341s de \n  un  ganador, el  premio se divide entre los ganadores en \n  partes iguales.");
        
        
        reglas.setFont(new Font("Verdana", 1, 12));
        JPanel panelTitulo = new JPanel();
        JLabel titulo = new JLabel("Reglas del Bingo");
        titulo.setFont(new Font("Verdana", 1, 12));
        panelTitulo.add(titulo);
        JPanel panelBoton = new JPanel();
        JButton boton = new JButton("Aceptar");
        boton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                dispose();
            }

        }
);
        panelBoton.add(boton);
        panelPrincipal.add(panelTitulo);
        panelPrincipal.add(reglas);
        panelPrincipal.add(panelBoton);
        setVisible(true);
        setBounds(0, 0, 400, 600);
        setLocationRelativeTo(null);
    }

    JPanel panelPrincipal;
}
