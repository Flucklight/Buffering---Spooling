import java.util.ArrayList;

public class Buffer {

    private ArrayList<Proceso> fila;

    public Buffer() {
        this.fila = new ArrayList<>();
    }

    public void AñadirProceso(Proceso proceso) {
        fila.add(fila.size(), proceso);
        System.out.println("Se añadio un proceso");
        state();
    }

    public void AñadirProceso(Proceso proceso, int index) {
        fila.add(index, proceso);
        System.out.println("Se añadio un proceso");
        state();
    }

    public Proceso mandarProcesar() {
        if (!fila.isEmpty()) {
            return fila.remove(fila.size() - 1);
        } else {
            return null;
        }
    }

    public void state() {
        System.out.println("Buffer {");
        for (Proceso p : fila) {
            System.out.println(p.toString());
        }
        System.out.println("}");
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
}
