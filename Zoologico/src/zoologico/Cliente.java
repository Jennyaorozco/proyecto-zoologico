
package zoologico;

/**
 * @author Juan C. Santa
 * @author Andrea O
 */
public class Cliente {
    private int id;
    private String name;
    private int age;

    public Cliente() {
    }

    public Cliente(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
}
