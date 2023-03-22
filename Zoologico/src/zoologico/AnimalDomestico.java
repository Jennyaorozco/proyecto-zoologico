
package zoologico;



/**
 *
 * @author Andrea O
 */
public class AnimalDomestico extends Animal {
    private String uso; 
    
    public AnimalDomestico() {
    }

    public AnimalDomestico(int codigo, String nombre, String fechaNacimiento, String uso) {
        super(codigo, nombre, fechaNacimiento);
        this.uso = uso;
    }
    

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
   
    @Override
    public String toString() {
        return "AnimalesDomesticos{" + "uso=" + uso + '}';
    }
    
    
}
