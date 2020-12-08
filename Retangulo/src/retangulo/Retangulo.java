/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

/**
 * @author fbazm
 */
public class Retangulo {
    public static void main(String[] args) {
        RetanguloClasse retangulo = new RetanguloClasse();
        
        retangulo.setAltura(2);
        retangulo.setBase(3);
        
        System.out.println("A area do retangulo é: " + retangulo.area());
        System.out.println("O perimetro do triangulo é: " + retangulo.perimetro());
        System.out.println("Relação Base Altura: " + retangulo.relaçãoBaseAltura());
        System.out.println("É quadrado? " + retangulo.EQuadrado());
        retangulo.getDimensoes();
        
        System.out.println("=================");
        System.out.println("");
        
        retangulo.setAltura(4);
        retangulo.setBase(4);
        
        System.out.println("A area do retangulo é: " + retangulo.area());
        System.out.println("O perimetro do triangulo é: " + retangulo.perimetro());
        System.out.println("Relação Base Altura: " + retangulo.relaçãoBaseAltura());
        System.out.println("É quadrado? " + retangulo.EQuadrado());
        retangulo.getDimensoes();
        
    }
}
