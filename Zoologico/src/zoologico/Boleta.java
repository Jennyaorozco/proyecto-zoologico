
package zoologico;

import java.util.Date;

/**
 *
 * @author Andrea O
 */
public class Boleta {
    
    private int id;
    private Date fecha;
    private double  precio;

    public Boleta() {
    }

    public Boleta(int id, Date fecha, double precio) {
        this.id = id;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "BoleteriaAbonos{" + "id=" + id + ", fecha=" + fecha + ", precio=" + precio + '}';
    }
    
    
}
