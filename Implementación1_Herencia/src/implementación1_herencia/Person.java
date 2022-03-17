/*
 * Implementación del Diagrama No. 1, Tema de Herencia. 
 * Clase Person. 
 * Clase Padre o Superclase. 
 */
package implementación1_herencia;

/**
 *
 * @author  L.A.
 */
public class Person { //Person: Persona
    //Atributos o Variables Distancia.
    String name;//Nombre.
    String address; //Dirección.

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //toString: Imprime los datos en pantalla.
    //El método toString() en Java, como su propio nombre indica, se utiliza para convertir a String 
    //(es decir, a una cadena de texto) cualquier objeto Java.

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + '}';
    } 
}
