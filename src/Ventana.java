import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ventana extends JFrame implements KeyListener {

    private static TablaProcesos tabla;
    private static Spooler spooler;
    private static Buffer buffer;
    private static CPU cpu;

    public Ventana() throws HeadlessException {
        super("Buffering - Spooling");
        this.addKeyListener(this);
        tabla = new TablaProcesos();
        buffer = new Buffer();
        spooler = new Spooler(buffer);
        cpu = new CPU(buffer);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_0 :
                spooler.spooling(tabla.KeyPresed(0));
                Thread h0 = new Thread(spooler);
                h0.start();
                break;
            case KeyEvent.VK_1 :
                spooler.spooling(tabla.KeyPresed(1));
                Thread h1 = new Thread(spooler);
                h1.start();
                break;
            case KeyEvent.VK_2 :
                spooler.spooling(tabla.KeyPresed(2));
                Thread h2 = new Thread(spooler);
                h2.start();
                break;
            case KeyEvent.VK_3 :
                spooler.spooling(tabla.KeyPresed(3));
                Thread h3 = new Thread(spooler);
                h3.start();
                break;
            case KeyEvent.VK_4 :
                spooler.spooling(tabla.KeyPresed(4));
                Thread h4 = new Thread(spooler);
                h4.start();
                break;
            case KeyEvent.VK_5 :
                spooler.spooling(tabla.KeyPresed(5));
                Thread h5 = new Thread(spooler);
                h5.start();
                break;
            case KeyEvent.VK_6 :
                spooler.spooling(tabla.KeyPresed(6));
                Thread h6 = new Thread(spooler);
                h6.start();
                break;
            case KeyEvent.VK_7 :
                spooler.spooling(tabla.KeyPresed(7));
                Thread h7 = new Thread(spooler);
                h7.start();
                break;
            case KeyEvent.VK_8 :
                spooler.spooling(tabla.KeyPresed(8));
                Thread h8 = new Thread(spooler);
                h8.start();
                break;
            case KeyEvent.VK_9 :
                spooler.spooling(tabla.KeyPresed(9));
                Thread h9 = new Thread(spooler);
                h9.start();
                break;
            case KeyEvent.VK_SPACE :
                System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
