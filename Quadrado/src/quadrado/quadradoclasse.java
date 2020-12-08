/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado;

/**
 * @author Felipe Baz Mitsuishi
 */
public class quadradoclasse {
    private double lado;

    quadradoclasse(double Lado) {
        lado = Lado;
    }
    
    public void setLado(int Lado){
        lado = Lado;
    }
    
    public double area(){
        return lado*lado;
    }
    
}
