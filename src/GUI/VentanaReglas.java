// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 17/04/2012 11:42:30 p.m.
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   VentanaReglas.java

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
        JTextArea reglas = new JTextArea("\n- En cada juego de Bingo existe un anunciante o pizarra \n  donde se indican  los n\372meros  de  las balotas que van \n  saliendo y tambi\351n el modelo o patr\363n de juego.\n\n- Es  muy  importante  prestarle  atenci\363n  al  modelo  de \n  juego. Un modelo de juego es una figura que tienes que \n  completar para ganar.\n\n- Los  modelos  m\341s  sencillos  son  aquellos  que  est\341n \n  compuestos por l\355neas rectas en una de las direcciones: \n  horizontal, vertical o diagonal.\n\n- Los n\372meros  de  las  balotas que salen  son  anunciados \n  r\341pidamente. Por  lo  general  no  pasan  m\341s  de  los 10 \n  segundos entre uno y otro, lo cual obliga a los jugadores \n  a prestar mucha atenci\363n a las balotas que van saliendo. \n  Debes  estar  siempre  atento  y  marcarlos r\341pidamente \n  y con buena precisi\363n en tus Cartones.\n\n- El  juego  termina  cuando uno  o  m\341s jugadores canten \n  \"BINGO\" al  completar  el Cart\363n o alguna de las figuras \n  mencionadas. Al  cantar \"BINGO\",  el  juego  se  detiene \n  inmediatamente  y  se  verifican los n\372meros y la figura. \n  Si hay un ganador, se le otorga el premio. Si hay m\341s de \n  un  ganador, el  premio se divide entre los ganadores en \n  partes iguales.");
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
