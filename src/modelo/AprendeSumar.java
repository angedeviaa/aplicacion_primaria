/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author josez
 */
public class AprendeSumar {
    /**
     * Genera un numero entero en un rango de 0 a 999
     * @return Entero de 0 a 999
     */
    public int generarNumero(){
        int numero =(int) Math.floor(Math.random()*1000);
        return  numero;
    }
    
}
