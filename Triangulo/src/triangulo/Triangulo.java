/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 * @author Felipe Baz Mitsuishi
 */
public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int base;
    private int altura;
    
    Triangulo(){
        ladoA = 3;
        ladoB = 4;
        altura = 4;
        base = 5;
    }
    
    Triangulo(int A, int B, int Base, int Altura){
        ladoA = A;
        ladoB = B;
        altura = Altura;
        base = Base;
    }
    
    public int area(int Altura){
        return ((base*altura)/2);
    }
    
    public void mostra(){
        System.out.println("");
        System.out.println("O Lado A tem valor de: " + ladoA );
        System.out.println("O Lado B tem valor de: " + ladoB);
        System.out.println("A Base do triangulo: " + base);
        System.out.println("A altura do triangulo: " + altura);
    }
    
    public int getLadoA(){
        return ladoA;
    }
    
    public int getLadoB(){
        return ladoB;
    }
    
    public int getBase(){
        return base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setLadoA(int A){
        ladoA = A;
    }
    
    public void setLadoB(int B){
        ladoB = B;
    }
    
    public void setBase(int Base){
        base = Base;
    }
    
    public void setAltura(int Altura){
        altura = Altura;
    }

}
