/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

/**
 * @author Felipe Baz Mitsuishi
 */
public class RetanguloClasse {
    private int base;
    private int altura;
    
    public int area(){
        return (base*altura);
    }
    
    public int perimetro(){
        return (base+altura);
    }
    
    public int relaçãoBaseAltura(){
        return (base/altura);
    }
    
    public boolean EQuadrado(){
        if(base == altura){
            return true;
        }else{
            return false;
        }
    }
    
    public void getDimensoes(){
        System.out.println("");
        System.out.println("A base é " + base);
        System.out.println("A altura é " + altura);
        System.out.println("");
    }
    
    public void setBase(int Base){
        base = Base;
    }
    
    public void setAltura(int Altura){
        altura = Altura;
    }
    
}
