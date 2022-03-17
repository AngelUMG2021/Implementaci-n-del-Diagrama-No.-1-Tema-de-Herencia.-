/*
 * Implementación del Diagrama No. 1, Tema de Herencia. 
 * Clase Staff.
 * Clase Hija o Subclase. 
 */
package implementación1_herencia;

/**
 *
 * @author  L.A. 
 */
public class Staff extends Person{
    //Atributos o Variables Distancia. 
    String school;//Escuela.
    double pay;//Pagar. 

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay; 
    }

    @Override
    public String toString() {
        return "Staff{" + "school=" + school + ", pay=" + pay + '}';
    }
}
