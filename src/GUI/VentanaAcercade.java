
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
        JLabel nombres = new JLabel("Luis Aloisi y Gabriel Ortega");
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
