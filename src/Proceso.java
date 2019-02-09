public class Proceso {

    private double prioridad;
    private double tiempoEjecucion;

    public Proceso(double prioridad, double tiempoEjecucion) {
        this.prioridad = prioridad;
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public double getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion() {
        this.tiempoEjecucion--;
    }

    @Override
    public String toString() {
        return  "Prioridad = " + prioridad +
                ", Tiempo de Ejecucion = " + tiempoEjecucion;
    }
}
