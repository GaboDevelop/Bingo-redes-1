package GUI;

import clases.GeneradorBalotas;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class panelBalotas extends JPanel
{

    public panelBalotas()
    {
        setLayout(new GridLayout(0, 2));
        JPanel panelnumero = new JPanel();
        panelnumero.setLayout(new BoxLayout(panelnumero, 0));
        numero = new JLabel("Buena suerte!");
        letra = new JLabel();
        panelnumero.add(letra);
        panelnumero.add(numero);
        numero.setHorizontalAlignment(0);
        numero.setFont(new Font("Verdana", 1, 80));
        letra.setHorizontalAlignment(0);
        letra.setFont(new Font("Verdana", 1, 80));
        add(panelnumero);
        GeneradorBalotas gb = new GeneradorBalotas(this);
        t = new Thread(gb);
        String letras[] = {
            "B", "I", "N", "G", "O"
        };
        Object datos[][] = new Object[5][15];
        modelo = new DefaultTableModel(datos, letras);
        modelo.setNumRows(15);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        tabla.setAlignmentX(0.5F);
        add(scroll);
    }

    public JLabel getNumero()
    {
        return numero;
    }

    public void setNumero(JLabel numero)
    {
        this.numero = numero;
    }

    public DefaultTableModel getModelo()
    {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo)
    {
        this.modelo = modelo;
    }

    public Thread getT()
    {
        return t;
    }

    public void setT(Thread t)
    {
        this.t = t;
    }

    public JLabel getLetra()
    {
        return letra;
    }

    public void setLetra(JLabel letra)
    {
        this.letra = letra;
    }

    JLabel numero;
    JLabel letra;
    DefaultTableModel modelo;
    Thread t;
}
