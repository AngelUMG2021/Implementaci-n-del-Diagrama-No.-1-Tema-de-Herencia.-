/*
 * Implementación del Diagrama No. 1, Tema de Herencia.  
 */
package implementación1_herencia;

/**
 *
 * @author L.A.
 */
public class Implementación1_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
     Person persona = new Person (" Carlos Ramiro", " Zona Dos, Ciudad La Nueva Era");
     System.out.println (persona.toString()); 
        
        
     Student Individuo = new Student (" Curso de Matemáticas", 2022, 100.00, "Carlos Ramiro", "Zona Dos, Ciudad La Nueva Era");
     System.out.println (Individuo.toString()); 
     

     Staff Datos = new Staff (" Colegio San Juanito del Sur", 100.00, "Carlos Ramiro", "Zona Dos, Ciudad La Nueva Era");
     System.out.println (Datos.toString()); 
    }
}
