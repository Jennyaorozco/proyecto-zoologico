
package zoologico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.Date;
import zoologico.arraysgestion.Gestion;

/**
 *@author Juan Santa
 * @author Andrea O
 */

public class DeptoLogistica {
    
    private Gestion gestion;

    public DeptoLogistica() {
        
        gestion=new Gestion();
    }
    
    private static void ingresarAnimalSalvaje() {
        AnimalSalvaje as = new AnimalSalvaje("1", 1, "León", "10/02/1984");
        //gestion.nuevoAnimal(as);
        System.out.println("Bienvenido" + as.toString());
    }

     public void ingresarAnimalDomestico(int codigo, String nombre, String fechaNacimiento, String uso) {
        AnimalDomestico ad = new AnimalDomestico(codigo,nombre,fechaNacimiento,uso);
        gestion.nuevoAnimal(ad);
        System.out.println("Bienvenido" + ad.toString());
    }
     
     private static void ingresarAnimalDomestico() {
        AnimalDomestico ad = new AnimalDomestico(2, "loro", "01/03/2020","Adopcion");
        //gestion.nuevoAnimal(ad);
        System.out.println("Bienvenido" + ad.toString());
    }
     
      private static void ingresarCliente() {
        Cliente cliente = new Cliente(1, "Federico", 35);
        //gestion.nuevoCliente(cliente);
        System.out.println("Bienvenido" + cliente.toString());
    }
      
     private static void venderBoleta() {
        Boleta boleta = new  Boleta(4, new Date(2023,03,12), 5000);
        //gestion.nuevaBoleta(boleta);
        System.out.println("Venta Realizada: " + boleta.toString());
    }
     
      private static void venderPlan() {
        Plan plan = new  Plan("5", "Cita con Animales de la Granja", new Time (13,00,00), "De Camino a Instalacion de los Mamiferos", 25000);
        //gestion.nuevoPlan(plan);
        System.out.println("Plan Vendido: " + plan.toString());
    }
      
    public static void admonZoo() {
        System.out.println("Que desea hacer: "); 
        System.out.println("1. Ingresar Animal Salvaje");
        System.out.println("2. Ingresar Animal Domestico");
        System.out.println("3. Registrar Cliente");
        System.out.println("4. Vender Boleta");
        System.out.println("5. Vender Plan");
        int opcion = leerInt("Ingrese su opción: "); System.out.println(opcion);
        if (opcion == 1) {
            ingresarAnimalSalvaje();
        }
        else if (opcion == 2){
            ingresarAnimalDomestico();
        }
        else if (opcion == 3){
            ingresarCliente();
        }
        
        else if (opcion == 4){
            venderBoleta();
        }
        
        else if (opcion == 5){
            venderPlan();
        }
        
    }

    private static int leerInt(String string) {
        int sdato = 0;
        
        System.out.print(string);
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            sdato = Integer.parseInt(flujoE.readLine());
        } catch (IOException e) {
            System.err.println("Error al ingresar el dato " + e.getMessage());
        }
        return sdato;
    }
}
