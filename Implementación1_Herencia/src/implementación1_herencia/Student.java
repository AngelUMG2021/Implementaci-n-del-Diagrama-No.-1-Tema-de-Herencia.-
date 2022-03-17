/*
 * Implementación del Diagrama No. 1, Tema de Herencia.  
 * Clase Student.
 * Clase Hija o Subclase. 
 */
package implementación1_herencia;

/**
 *
 * @author  L.A. 
 */
public class Student extends Person{//Student: Estudiante.
    //Atributos o Variables Distancia. 
    String program;//Programa.
    int year;//Año.
    double fee;//Tarifa.

    public Student(String program, int year, double fee, String name, String address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
        System.out.println ("Q100.00."); 
    }

    //toString: Imprime los datos en pantalla.
    //El método toString() en Java, como su propio nombre indica, se utiliza para convertir a String 
    //(es decir, a una cadena de texto) cualquier objeto Java. 
    @Override
    public String toString() {
        return "Student{" + "program=" + program + ", year=" + year + ", fee=" + fee + '}';
    }
}
