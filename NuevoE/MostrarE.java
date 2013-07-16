/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevoE;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class MostrarE {
     public static void main(String[] args) throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingresar limite");
        int salir = Integer.parseInt(lectura1.readLine());
                 
         
              
        Empleado2 e1 = new Empleado2();
        e1.setNombres("Carlos");
        e1.setApellidos("Saca");
        e1.setsHoras(10);
        e1.setSueldo();
         System.out.println("empleado: "+e1.getNombres()+ "  "+e1.getApellidos());
         System.out.println("Sueldo: "+e1.getSueldo());
        
    }
    
}
