package GUI;

import javax.swing.JPanel;

public class panelAbajo extends JPanel
{

    public panelAbajo(panelBalotas p)
    {
        pb = p;
        add(pb);
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
}
