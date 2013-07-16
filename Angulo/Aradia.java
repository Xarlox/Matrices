/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Angulo;

/**
 *
 * @author Usuario
 */
public class Aradia {

    int angulo;
    int radianes;
    int seno;
    int coseno;

    public void setAngulo(int x) {
        angulo = x;
    }

    public void setRadianes(int x) {
        radianes = x;
    }

    public void setSeno() {
        seno = (int) (double) Math.sin(radianes);

    }

    public void setCoseno() {
        coseno = (int) (double) Math.cos(radianes);

    }

    public int getAngulo() {

        return angulo;
    }

    public double getSeno() {
        return seno;

    }

    public double getCoseno() {
        return seno;

    }
    public double getRadianes(){
        return radianes;
    }
    
}
