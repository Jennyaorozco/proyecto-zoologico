package zoologico;

import java.util.Date;

/**
 *
 * @author Andrea O
 */
public class AnimalAdopcion extends AnimalDomestico {
 
    private Cliente cliente;
    private Date fechaInicio;

    public AnimalAdopcion() {
    }

    public AnimalAdopcion(Cliente cliente, Date fechaInicio, String uso, int codigo, String nombre, String fechaNacimiento) {
        super(codigo, nombre, fechaNacimiento,uso);
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
    }

    public AnimalAdopcion(Cliente cliente, Date fechaInicio) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "AnimalAdopcion{" + "cliente=" + cliente + ", fechaInicio=" + fechaInicio + '}';
    }
    
  }
