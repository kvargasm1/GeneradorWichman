/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorwichman;

/**
 *
 * @author RetailAdmin
 */
public class Utilidades {
    
    public double calculaX(double semillaX){
        
        double semilla = (171*semillaX)%30269;
        return semilla;
        
    }
    public double calculaY(double semillaY){
        
        double semilla = (172 * semillaY)%30307;
        return semilla;
        
    }
    public double calculaZ(double semillaZ){
        
        double semilla = (173 * semillaZ)%30323;
        return semilla;
        
    }
    
}
