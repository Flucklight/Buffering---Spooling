import java.util.ArrayList;
import java.util.Random;

public class TablaProcesos {

    private ArrayList<Proceso> procesos;
    private Random random;

    public TablaProcesos() {
        procesos = new ArrayList<>();
        random = new Random();
        random.setSeed(10);
        for (int i = 0; i < 10; i++) {
            procesos.add(new Proceso(random.nextGaussian() + 2, (random.nextGaussian() * 2) + 4));
        }
    }

    public Proceso KeyPresed(int indice) {
        return procesos.get(indice);
    }

    @Override
    public String toString() {
        return "Proceso 0 -> " + procesos.get(0).toString() + "\n"
             + "Proceso 1 -> " + procesos.get(1).toString() + "\n"
             + "Proceso 2 -> " + procesos.get(2).toString() + "\n"
             + "Proceso 3 -> " + procesos.get(3).toString() + "\n"
             + "Proceso 4 -> " + procesos.get(4).toString() + "\n"
             + "Proceso 5 -> " + procesos.get(5).toString() + "\n"
             + "Proceso 6 -> " + procesos.get(6).toString() + "\n"
             + "Proceso 7 -> " + procesos.get(7).toString() + "\n"
             + "Proceso 8 -> " + procesos.get(8).toString() + "\n"
             + "Proceso 9 -> " + procesos.get(9).toString() + "\n";
    }
}
