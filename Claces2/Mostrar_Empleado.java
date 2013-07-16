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
public class Mostrar_Empleado {
     public static void main(String[] args) throws IOException {
        Empleado e1 = new Empleado();
        e1.setNombres("Carlos");
        e1.setApellidos("Saca");
        e1.setsHoras(10);
        e1.setSueldo();
         System.out.println("empleado: "+e1.getNombres()+ "  "+e1.getApellidos());
         System.out.println("Sueldo: "+e1.getSueldo());
         
    }
    
}
