/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskpizzaria;
import java.util.Scanner;

/**
 *
 * @author Felipe Baz Mitsuishi
 */

public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizzaria pizzaria = new Pizzaria();
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Informe seu telefone");
        String telefone = teclado.nextLine();   
        System.out.println("");
        pizzaria.diskPizza(telefone);
        
    }
    
}
