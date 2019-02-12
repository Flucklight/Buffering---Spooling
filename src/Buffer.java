import java.util.ArrayList;

public class Buffer {

    private ArrayList<Proceso> fila;

    public Buffer() {
        fila = new ArrayList<>();
    }

    public void AñadirProceso(Proceso proceso) {
        fila.add(fila.size(), proceso);
    }

    public void AñadirProceso(Proceso proceso, int index) {
        fila.add(index, proceso);
    }

    public Proceso MandarProcesador(boolean procesando) {
        if (!procesando && !fila.isEmpty()) {
            return fila.remove(0);
        } else {
            return null;
        }
    }


    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }

    public Proceso get(int index) {
        return fila.get(index);
    }

    @Override
    public String toString() {
        return "Buffer { " +
                "fila = " + fila.size() +
                " }";
    }
}
