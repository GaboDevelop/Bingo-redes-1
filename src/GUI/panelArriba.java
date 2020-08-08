package GUI;

import clases.HiloVerificador;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class panelArriba extends JPanel
{

    public panelArriba(panelBalotas pbalotas)
    {
        cartones = new ArrayList();
        t = new Thread[6];
        hilos = new HiloVerificador[6];
        ncartones = 1;
        pb = pbalotas;
        setBackground(Color.gray);
        setLayout(new GridLayout(2, 3, 10, 10));
        for(int i = 0; i < 6; i++)
        {
            carton c = new carton((new StringBuilder()).append(i + 1).toString());
            c.setVisible(false);
            cartones.add(c);
            add((Component)cartones.get(i));
        }

    }

    public void crearCartones()
    {
        for(int i = 0; i < ncartones; i++)
        {
            ((carton)cartones.get(i)).setVisible(true);
            hilos[i] = new HiloVerificador((carton)cartones.get(i), pb, this);
            t[i] = new Thread(hilos[i]);
        }

    }

    public void eliminarCartones()
    {
        for(int i = 0; i < ncartones; i++)
            ((carton)cartones.get(i)).setVisible(false);

    }

    public int getNcartones()
    {
        return ncartones;
    }

    public void setNcartones(int ncartones)
    {
        this.ncartones = ncartones;
    }

    public Thread[] getT()
    {
        return t;
    }

    public void setT(Thread t[])
    {
        this.t = t;
    }

    public panelBalotas getPb()
    {
        return pb;
    }

    public void setPb(panelBalotas pb)
    {
        this.pb = pb;
    }

    ArrayList cartones;
    Thread t[];
    HiloVerificador hilos[];
    panelBalotas pb;
    int ncartones;
}
