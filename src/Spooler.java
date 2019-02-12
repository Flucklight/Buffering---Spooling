import java.util.ArrayList;

public class Spooler extends Thread {
    private Proceso proceso;
    private ArrayList<Proceso> lista;
    private Buffer buffer;

    public Spooler() {
        this.lista = new ArrayList<>();
        this.buffer = new Buffer();
    }

    public void add(Proceso proceso) {
        this.lista.add(proceso);
    }

    public Buffer getBuffer() {
        return buffer;
    }

    @Override
    public String toString() {
        return "Spooler { " +
                "proceso = " + proceso +
                ", buffer = " + buffer.toString() +
                " }";
    }

    @Override
    public void run() {
        while (true) {
            if (!lista.isEmpty()) {
                proceso = lista.get(0);
                if (!buffer.isEmpty()) {
                    for (int i = 0; i < buffer.size(); i++) {
                        if (proceso.getPrioridad() >= buffer.get(i).getPrioridad() && proceso != null) {
                            buffer.AñadirProceso(proceso , i);
                            proceso = null;
                        }
                    }
                }
            }
        }
    }
}
