public class Spooler implements Runnable {
    private Proceso proceso;
    private Buffer buffer;

    public Spooler(Buffer buffer) {
        this.buffer = buffer;
    }

    public void spooling(Proceso proceso) {
        this.proceso = proceso;
    }

    @Override
    public void run() {
        if (buffer.isEmpty()) {
            buffer.AñadirProceso(proceso);
        } else {
            for (int i = 0; i < buffer.size(); i++) {
                if (buffer.get(i).getPrioridad() >= proceso.getPrioridad()) {
                    buffer.AñadirProceso(proceso , i);
                    break;
                }
            }
        }
    }
}
