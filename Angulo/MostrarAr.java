/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Angulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class MostrarAr {

    public static void main(String[] args) throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingresar el Angulo: ");
        int angulo = Integer.parseInt(lectura1.readLine());        
        Aradia e1 = new Aradia();
        e1.setAngulo(angulo);  
        e1.setRadianes((int) ((angulo*Math.PI)/180));
        e1.setSeno();
        e1.setCoseno();
        System.out.println("El seno del angulo: " + e1.getAngulo() + " es:  " + e1.getSeno());
        System.out.println("El coseno del Angulo: " + e1.getAngulo() + " es: " + e1.getCoseno());       

    }
}