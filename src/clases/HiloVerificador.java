package clases;

import GUI.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HiloVerificador
    implements Runnable
{

    public HiloVerificador(carton carton, panelBalotas p, panelArriba parriba)
    {
        sw = true;
        matsw = new boolean[5][5];
        c = carton;
        pb = p;
        pa = parriba;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
                matsw[i][j] = false;

        }

    }

    public void run()
    {
        while(sw) 
        {
            if(verificarNumero())
            {
                c.getCasillas()[posi + 1][posj].setBackground(Color.GREEN);
                matsw[posi][posj] = true;
            }
            if(verificarGanador())
            {
                sw = false;
                pa.getPb().getT().stop();
                VentanaGanador vg = new VentanaGanador(c);
                vg.setLocationRelativeTo(null);
            }
        }
    }

    public boolean verificarGanador()
    {
        boolean s = false;
        int cont = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
                if(matsw[i][j])
                    cont++;

        }

        if(cont == 24)
            s = true;
        else
            s = false;
        return s;
    }

    public boolean verificarNumero()
    {
        boolean siesta = false;
        for(int i = 0; i < c.getNumeros().length; i++)
        {
            for(int j = 0; j < c.getNumeros()[0].length; j++)
                if(!pb.getNumero().getText().equalsIgnoreCase(""))
                {
                    int n = Integer.parseInt(pb.getNumero().getText());
                    if(n == c.getNumeros()[i][j])
                    {
                        siesta = true;
                        posi = i;
                        posj = j;
                    }
                }

        }

        return siesta;
    }

    public panelBalotas getPb()
    {
        return pb;
    }

    public void setPb(panelBalotas pb)
    {
        this.pb = pb;
    }

    panelBalotas pb;
    carton c;
    boolean sw;
    int posi;
    int posj;
    boolean matsw[][];
    panelArriba pa;
}
