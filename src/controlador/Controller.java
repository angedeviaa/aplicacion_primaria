/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.AprendeSumar;
/**
 *
 * @author josez
 */
public class Controller {
    AprendeSumar as = new AprendeSumar();
    
    public int generarNumeros(){
        return as.generarNumero();
    }

    public int generarAsignador(){
        int numero =(int) Math.floor(Math.random()*4);
        return  numero; 
    }
    
}
