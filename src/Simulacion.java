public class Simulacion extends Thread {

    protected TablaProcesos tabla;
    protected Spooler spooler;
    protected CPU cpu;

    public Simulacion() {
        tabla = new TablaProcesos();
        cpu = new CPU();
        spooler = new Spooler();
        cpu.start();
        spooler.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(cpu.toString());
            System.out.println(spooler.toString());
            System.out.println(tabla.toString());
            cpu.Procesar(spooler.getBuffer().MandarProcesador(cpu.isProcesando()));
        }
    }
}
