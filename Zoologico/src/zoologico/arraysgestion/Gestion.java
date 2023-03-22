
package zoologico.arraysgestion;

import java.util.ArrayList;
import zoologico.Animal;
import zoologico.Boleta;
import zoologico.Cliente;
import zoologico.Plan;

/**
 *
 * @author Andrea O
 */
public class Gestion {
    
    private ArrayList <Boleta> boletas;
    private ArrayList <Cliente> clientes;
    private ArrayList <Animal> animales;
    private ArrayList <Plan> planes;
    

    public Gestion() {
        this.boletas = new ArrayList();
        this.clientes = new ArrayList();
        this.animales = new ArrayList();
        this.planes = new ArrayList();
        
    }
    public void nuevaBoleta(Boleta boleta){
        boletas.add(boleta);
    }
    public void nuevoCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void nuevoAnimal(Animal animal){
        animales.add(animal);
    }
    public void nuevoPlan(Plan plan){
        planes.add(plan);
    }
    public ArrayList <Animal> getAnimal(){
        return animales;
    }
}
