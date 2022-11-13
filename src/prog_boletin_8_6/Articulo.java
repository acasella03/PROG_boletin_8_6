package prog_boletin_8_6;

public class Articulo {

    private String nombreArticulo;
    private float ventasAnuales;

    public Articulo() {

    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public float getVentasAnuales() {
        return ventasAnuales;
    }

    public void setVentasAnuales(float ventasAnuales) {
        this.ventasAnuales = ventasAnuales;
    }

    public String tipoArticulo() {
        String tipo;
        if (ventasAnuales <= 100) {
            tipo = "bajo";
        } else if (ventasAnuales <= 500) {
            tipo = "medio";
        } else if (ventasAnuales <= 1000) {
            tipo = "alto";
        } else {
            tipo = "primera necesidad";
        }
        return tipo;
    }
}
