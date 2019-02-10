import java.util.ArrayDeque;

public class Buffer {

    private ArrayDeque<Proceso> fila;

    public Buffer() {
        fila = new ArrayDeque<>();
    }

    public void AñadirProceso(Proceso proceso) {
        fila.addLast(proceso);
    }

    public Proceso MandarProcesador(boolean procesando) {
        if (!procesando && !fila.isEmpty()) {
            return fila.removeFirst();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Buffer{" +
                "Hay " + fila.size() +
                " en fila";
    }
}
