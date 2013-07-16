/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevoE;

/**
 *
 * @author Usuario
 */
public class Empleado2 {

    String nombres;
    String apellidos;
    int horasTrabajadas=12;
    int sueldoHoras;
    int sueldo;

    public void setNombres(String x) {
        nombres = x;
    }

    public void setApellidos(String x) {

        apellidos = x;
    }

    public void setHoras(int x) {
        horasTrabajadas = x;

    }

    public void setsHoras(int x) {
        sueldoHoras = x;
    }

    public void setSueldo() {
        sueldo = horasTrabajadas * sueldoHoras;
        
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getHoras() {
        return horasTrabajadas;
    }

    public int getSueldo() {
        return sueldo;

    }
}
