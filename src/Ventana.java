import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ventana extends JFrame implements KeyListener {

    private static Simulacion simulacion;

    public Ventana() throws HeadlessException {
        super("Buffering - Spooling");
        this.addKeyListener(this);
        simulacion = new Simulacion();
        simulacion.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_0 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(0));
                break;
            case KeyEvent.VK_1 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(1));
                break;
            case KeyEvent.VK_2 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(2));
                break;
            case KeyEvent.VK_3 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(3));
                break;
            case KeyEvent.VK_4 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(4));
                break;
            case KeyEvent.VK_5 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(5));
                break;
            case KeyEvent.VK_6 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(6));
                break;
            case KeyEvent.VK_7 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(7));
                break;
            case KeyEvent.VK_8 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(8));
                break;
            case KeyEvent.VK_9 :
                simulacion.spooler.add(simulacion.tabla.KeyPresed(9));
                break;
            case KeyEvent.VK_SPACE :
                System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
