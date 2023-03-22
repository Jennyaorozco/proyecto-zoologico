
package zoologico;

import java.sql.Time;



/**
 *
 * @author Andrea O
 */
public class Plan {
    
    private String codigo;
    private String descripcion;
    private Time horaInicio;
    private String ubicacion;
    private double  costo;

    public Plan() {
    }

    public Plan(String codigo, String descripcion, Time horaInicio, String ubicacion, double costo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.horaInicio = horaInicio;
        this.ubicacion = ubicacion;
        this.costo = costo;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.descripcion = nombre;
    }

    @Override
    public String toString() {
        return "Planes{" + "codigo=" + codigo + ", nombre=" + descripcion + ", costo=" + costo + '}';
    }
    
          
}
