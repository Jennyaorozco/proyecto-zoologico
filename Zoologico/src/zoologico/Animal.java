
package zoologico;

/**
 *
 * @author Andrea O
 */
public class Animal {
    private int codigo;
    private String nombre;
    private String  fechaNacimiento;
            

    public Animal() {
    }
    

    public Animal(int codigo, String nombre, String fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
   }
