
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JApplet
{
    JPanel panelPrincipal;
    panelAbajo panelAbajo;
    panelArriba panelArriba;
    panelBalotas pb;
    JMenuItem ncartones;
    JMenuItem comenzar;
    boolean swsihaycarton;
    boolean partidaCreada;
   
    
    public VentanaPrincipal()
    {
        panelPrincipal = (JPanel)getContentPane();
        partidaCreada = false;
        swsihaycarton = false;
    }

    public void init()
    {
        colocarMenu();
        JSplitPane p = new JSplitPane();
        p.setDividerLocation(630);
        p.setOrientation(0);
        pb = new panelBalotas();
        panelAbajo = new panelAbajo(pb);
        panelArriba = new panelArriba(pb);
        p.setLeftComponent(panelArriba);
        p.setRightComponent(panelAbajo);
        panelPrincipal.add(p);
        setVisible(true);
    }

    private void colocarMenu()
    {
        JMenuBar barra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu ayuda = new JMenu("Ayuda");
        //ACA HAY QUE VERIFICAR SI YA HAY UNA PARTIDA CREADA CON UNA VARIABLE DE ESTA CLASE
        if(partidaCreada){
            ncartones = new JMenuItem("Unirse a Partida");
        }else{
            ncartones = new JMenuItem("Crear Partida");
        }
        ncartones.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                try
                {
                    
                   
                    //for(nc = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Jugadores:")); nc > 6 || nc < 1; nc = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Jugadores:")));
                   
                    if(!partidaCreada){
                        VentanaPrincipal.this.panelArriba.eliminarCartones();
                        ncartones.setText("Unirse a Partida");
                        partidaCreada = true;
                    }
                    int nc;
                    swsihaycarton = true;
                    VentanaPrincipal.this.panelArriba.setNcartones(1);
                    VentanaPrincipal.this.panelArriba.crearCartones();
                    VentanaPrincipal.this.panelArriba.updateUI();
                }
                catch(NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(null, "Error, digite un numero valido, maximo 4.");
                }
            }
        }
);
        comenzar = new JMenuItem("Comenzar");
        comenzar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                if(swsihaycarton)
                {
                    VentanaPrincipal.this.panelAbajo.getPb().getT().start();
                    for(int i = 0; i < VentanaPrincipal.this.panelArriba.getNcartones(); i++)
                        VentanaPrincipal.this.panelArriba.getT()[i].start();

                    ncartones.setEnabled(false);
                    comenzar.setEnabled(false);
                } else
                {
                    JOptionPane.showMessageDialog(null, "Debe primero crear el numero de Jugadores.");
                }
            }
        }
);        
        JMenuItem salir = new JMenuItem("Salir");
        salir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        }
);
        JMenuItem reglas = new JMenuItem("Reglas del Juego");
        reglas.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                VentanaReglas vr = new VentanaReglas();
                vr.setLocationRelativeTo(null);
            }

        }
);
        JMenuItem acercade = new JMenuItem("Acerca de ");
        acercade.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                VentanaAcercade va = new VentanaAcercade();
                va.setLocationRelativeTo(null);
            }

        }
);
        archivo.add(ncartones);
        archivo.add(comenzar);
        archivo.add(salir);
        ayuda.add(reglas);
        ayuda.add(acercade);
        barra.add(archivo);
        barra.add(ayuda);
        setJMenuBar(barra);
    }

   
}