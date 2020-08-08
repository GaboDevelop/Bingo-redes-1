package clases;

import GUI.panelBalotas;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class GeneradorBalotas
    implements Runnable
{

    public GeneradorBalotas(panelBalotas p)
    {
        j = new int[5];
        numeros = new ArrayList();
        sw = false;
        pb = p;
        for(int i = 0; i < 5; i++)
            j[i] = -1;

    }

    public void run()
    {
        try
        {
            while(true) 
            {
                if(numeros.size() <= 75)
                {
                    int n;
                    for(n = (int)(Math.random() * 75D) + 1; numeros.contains(Integer.valueOf(n)); n = (int)(Math.random() * 75D) + 1);
                    pb.getNumero().setText((new StringBuilder()).append(n).toString());
                    if(n <= 15)
                    {
                        i = 0;
                        j[i]++;
                        pb.getModelo().setValueAt(Integer.valueOf(n), j[i], i);
                        pb.getLetra().setText("B ");
                    } else
                    if(n > 15 && n <= 30)
                    {
                        i = 1;
                        j[i]++;
                        pb.getModelo().setValueAt(Integer.valueOf(n), j[i], i);
                        pb.getLetra().setText("I ");
                    } else
                    if(n > 30 && n <= 45)
                    {
                        i = 2;
                        j[i]++;
                        pb.getModelo().setValueAt(Integer.valueOf(n), j[i], i);
                        pb.getLetra().setText("N ");
                    } else
                    if(n > 45 && n <= 60)
                    {
                        i = 3;
                        j[i]++;
                        pb.getModelo().setValueAt(Integer.valueOf(n), j[i], i);
                        pb.getLetra().setText("G ");
                    } else
                    {
                        i = 4;
                        j[i]++;
                        pb.getModelo().setValueAt(Integer.valueOf(n), j[i], i);
                        pb.getLetra().setText("O ");
                    }
                    numeros.add(Integer.valueOf(n));
                } else
                {
                    pb.getT().stop();
                }
                Thread.sleep(2000L);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public boolean isSw()
    {
        return sw;
    }

    public void setSw(boolean sw)
    {
        this.sw = sw;
    }

    panelBalotas pb;
    int i;
    int j[];
    ArrayList numeros;
    boolean sw;
}
