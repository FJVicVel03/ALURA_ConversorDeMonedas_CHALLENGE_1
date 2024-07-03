public class Historial {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidad;
    private double resultado;

    public Historial(String monedaBase, String monedaObjetivo, double cantidad, double resultado){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.cantidad = cantidad;
        this.resultado = resultado;
    }

    @Override
    public String toString(){
        return cantidad + " " + monedaBase + " a " + resultado + " " + monedaObjetivo;
    }
}
