public class CPU implements Runnable {

    private Proceso proceso;
    private Thread hilo;
    private Buffer buffer;
    private boolean procesando;

    public CPU(Buffer b) {
        procesando = false;
        buffer = b;
        hilo = new Thread(this);
        hilo.setPriority(3);
        hilo.start();
    }

    public void procesar() {
        this.proceso = buffer.mandarProcesar();
        if (proceso != null) {
            procesando = true;
        }
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(toString());
            if (procesando) {
                proceso.setTiempoEjecucion();
                try {
                    hilo.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (proceso.getTiempoEjecucion() <= 0) {
                    proceso = null;
                    procesando = false;
                }
            } else {
                procesar();
            }
        }
    }

    @Override
    public String toString() {
        if (!procesando) {
            return "CPU{En espera de un proceso}";
        } else {
            return "CPU { " +
                    "proceso = " + proceso.toString() +
                    ", procesando = " + procesando +
                    " }";
        }
    }
}