import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ventana extends JFrame implements KeyListener {
    private Simulacion simulacion;
    private JPanel panelPrincipal;

    public Ventana() {
        super("Buffering - Spooling");
        this.addKeyListener(this);
        this.add(panelPrincipal);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(0));
                break;
            case KeyEvent.VK_1 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(1));
                break;
            case KeyEvent.VK_2 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(2));
                break;
            case KeyEvent.VK_3 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(3));
                break;
            case KeyEvent.VK_4 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(4));
                break;
            case KeyEvent.VK_5 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(5));
                break;
            case KeyEvent.VK_6 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(6));
                break;
            case KeyEvent.VK_7 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(7));
                break;
            case KeyEvent.VK_8 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(8));
                break;
            case KeyEvent.VK_9 :
                simulacion.buffer.AñadirProceso(simulacion.tabla.KeyPresed(9));
                break;
            case KeyEvent.VK_SPACE :
                simulacion.stop();
                System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
