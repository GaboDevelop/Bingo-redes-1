// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 17/04/2012 11:41:47 p.m.
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   VentanaAcercade.java

package GUI;

import java.awt.Font;
import javax.swing.*;

public class VentanaAcercade extends JFrame
{

    public VentanaAcercade()
    {
        panelPrincipal = (JPanel)getContentPane();
        JPanel panelTitulo = new JPanel();
        JLabel titulo = new JLabel("Desarrolladores");
        titulo.setFont(new Font("Verdana", 1, 14));
        panelTitulo.add(titulo);
        JPanel panelnombres = new JPanel();
        JLabel nombres = new JLabel("Roger Villamarin ,  Andres Lara  y  Jorge Encina.");
        panelnombres.add(nombres);
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, 1));
        panelPrincipal.add(panelTitulo);
        panelPrincipal.add(panelnombres);
        setVisible(true);
        setBounds(0, 0, 300, 100);
        setLocationRelativeTo(null);
    }

    JPanel panelPrincipal;
}
