public class CPU extends Thread{

    private Proceso proceso;
    private boolean procesando;

    public CPU() {
        procesando = false;
    }

    public void Procesar(Proceso proceso) {
        if (proceso != null) {
            this.proceso = proceso;
            procesando = true;
        }
    }

    public boolean isProcesando() {
        return procesando;
    }

    @Override
    public void run() {
        while (true) {
            if (procesando) {
                proceso.setTiempoEjecucion();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (proceso.getTiempoEjecucion() == 0) {
                    proceso = null;
                    procesando = false;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (proceso == null) {
            return "CPU{En espera de un proceso}";
        } else {
            return "CPU { " +
                    "proceso = " + proceso.toString() +
                    ", procesando = " + procesando +
                    " }";
        }
    }
}
