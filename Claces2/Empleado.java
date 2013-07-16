/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Claces2;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Empleado {

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

    public void setHoras(int x) throws IOException {
        horasTrabajadas = x;

    }

    public void setsHoras(int x) {
        sueldoHoras = x;
    }

    public void setSueldo() {
        sueldo = horasTrabajadas * 10;
        
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
