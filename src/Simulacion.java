import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Simulacion extends Thread implements KeyListener {

    private TablaProcesos tabla;
    private Buffer buffer;
    private CPU cpu;

    public Simulacion() {
        tabla = new TablaProcesos();
        buffer = new Buffer();
        cpu = new CPU();
        cpu.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(cpu.toString());
            System.out.println(buffer.toString());
            System.out.println(tabla.toString());
            cpu.Procesar(buffer.MandarProcesador(cpu.isProcesando()));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_0 :
                buffer.AñadirProceso(tabla.KeyPresed(0));
                break;
            case KeyEvent.VK_1 :
                buffer.AñadirProceso(tabla.KeyPresed(1));
                break;
            case KeyEvent.VK_2 :
                buffer.AñadirProceso(tabla.KeyPresed(2));
                break;
            case KeyEvent.VK_3 :
                buffer.AñadirProceso(tabla.KeyPresed(3));
                break;
            case KeyEvent.VK_4 :
                buffer.AñadirProceso(tabla.KeyPresed(4));
                break;
            case KeyEvent.VK_5 :
                buffer.AñadirProceso(tabla.KeyPresed(5));
                break;
            case KeyEvent.VK_6 :
                buffer.AñadirProceso(tabla.KeyPresed(6));
                break;
            case KeyEvent.VK_7 :
                buffer.AñadirProceso(tabla.KeyPresed(7));
                break;
            case KeyEvent.VK_8 :
                buffer.AñadirProceso(tabla.KeyPresed(8));
                break;
            case KeyEvent.VK_9 :
                buffer.AñadirProceso(tabla.KeyPresed(9));
                break;
            case KeyEvent.VK_SPACE :
                this.stop();
                System.exit(0);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
