package GUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panelGanador extends JPanel
{

    public panelGanador()
    {
        imagen = new ImageIcon(getClass().getResource("../Imagenes/Logobingo.jpg"));
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g)
    {
        g.drawImage(imagen.getImage(), 0, 0, this);
    }

    ImageIcon imagen;
}
