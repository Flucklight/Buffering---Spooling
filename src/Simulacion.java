import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Simulacion extends Thread {

    protected static TablaProcesos tabla;
    protected static Buffer buffer;
    protected static CPU cpu;

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

}
