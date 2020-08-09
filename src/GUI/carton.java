package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class carton extends JPanel
{

    public carton(String nom)
    {
        nombre = nom;
        JPanel p = new JPanel();
        p.setBackground(Color.yellow);
        p.setLayout(new GridLayout(6, 6));
        casillas = new JPanel[6][5];
        numeros = new int[5][5];
        colocarPalabraBingo(p);
        colocarNumeroJugador(p);
        Vnumeros = new ArrayList();
        for(int i = 2; i < casillas.length; i++)
        {
            for(int j = 0; j < casillas[0].length; j++)
            {
                int n;
                for(n = 15 * j + (int)(Math.random() * 15D) + 1; Vnumeros.contains(Integer.valueOf(n)); n = 15 * j + (int)(Math.random() * 15D) + 1);
                casillas[i][j] = new JPanel();
                casillas[i][j].setLayout(new BorderLayout());
                if(i == 3 && j == 2)
                {
                    casillas[i][j].add(new JLabel(" "));
                    casillas[i][j].setBorder(new LineBorder(Color.BLACK, 1));
                    numeros[i - 1][j] = 0;
                } else
                {
                    numeros[i - 1][j] = n;
                    JLabel l = new JLabel((new StringBuilder()).append(n).toString());
                    l.setHorizontalAlignment(0);
                    casillas[i][j].add(l);
                    casillas[i][j].setBorder(new LineBorder(Color.BLACK, 1));
                }
                casillas[i][j].setEnabled(false);
                p.add(casillas[i][j]);
                Vnumeros.add(Integer.valueOf(n));
            }

        }

        p.setPreferredSize(new Dimension(150, 150));
        add(p);
        setBackground(Color.gray);
    }

    private void colocarPalabraBingo(JPanel p)
    {
        String v[] = {
            "B", "I", "N", "G", "O"
        };
        for(int i = 0; i < 5; i++)
        {
            casillas[0][i] = new JPanel();
            casillas[0][i].setLayout(new BorderLayout());
            casillas[0][i].setBackground(Color.yellow);
            JLabel b = new JLabel(v[i]);
            b.setHorizontalAlignment(0);
            casillas[0][i].setBorder(new LineBorder(Color.yellow, 1));
            casillas[0][i].add(b);
            p.add(casillas[0][i]);
        }

    }
    
    private void colocarNumeroJugador(JPanel p)
    {
        String v[] = {
            "T", "U", "Y", "O", "-"
        };
        for(int i = 0; i < 5; i++)
        {
            casillas[1][i] = new JPanel();
            casillas[1][i].setLayout(new BorderLayout());
            casillas[1][i].setBackground(Color.green);
            JLabel b = new JLabel(v[i]);
            b.setHorizontalAlignment(0);
            casillas[1][i].setBorder(new LineBorder(Color.green, 1));
            casillas[1][i].add(b);
            p.add(casillas[1][i]);
        }

    }

    public JPanel[][] getCasillas()
    {
        return casillas;
    }

    public void setCasillas(JPanel casillas[][])
    {
        this.casillas = casillas;
    }

    public int[][] getNumeros()
    {
        return numeros;
    }

    public void setNumeros(int numeros[][])
    {
        this.numeros = numeros;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    JPanel casillas[][];
    int numeros[][];
    ArrayList Vnumeros;
    String nombre;
}
