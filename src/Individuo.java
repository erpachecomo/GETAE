/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ernesto
 */
public class Individuo {
    int valoresCaracteristicas[];
    int grupo;
    String nombre;
    public Individuo(String nombre, int numeroCaracteristicas){
        this.nombre = nombre;
        grupo = 0;
        valoresCaracteristicas = new int[numeroCaracteristicas];
    }
}
