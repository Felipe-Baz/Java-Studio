/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author fbazm
 */
public class TiposPrimitivos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int:
        int idade = 3;
        int idade2 = (int) 3;
        Integer idade3 = new Integer(3);
        //char:
        char letra = 'G';
        char letra2 = (char) 'G';
        Character letra3 = new Character('G');
        String frase = new String("Ola, mundo!!");
        //bool:
        boolean casada = false;
        boolean casada2 = (boolean) false;
        Boolean casada3 = new Boolean(false);
        //float:
        float nota = 8.5f;
        float nota2 = (float) 8.5;
        Float nota3 = new Float(8.5);
        
        System.out.printf("A nota é %d\n", idade);
        System.out.printf("A nota é %d\n", idade2);
        System.out.printf("A nota é %d\n", idade3);
        
        System.out.printf("A nota é %c\n", letra);
        System.out.printf("A nota é %c\n", letra2);
        System.out.printf("A nota é %c\n", letra3);
        
        System.out.printf("A nota é %b\n", casada);
        System.out.printf("A nota é %b\n", casada2);
        System.out.printf("A nota é %b\n", casada3);
        
        System.out.printf("A nota é %.2f\n", nota);
        System.out.printf("A nota é %.2f\n", nota2);
        System.out.printf("A nota é %.2f\n", nota3);
        
        System.out.println("Recebimento de infos pelo usuario!");
        
        Scanner teclado = new Scanner(System.in);
        String nomeT = teclado.nextLine();
        float notaT = teclado.nextFloat();
        System.out.format("Anota do %s é de %.1f\n",nomeT, notaT);
    }
}
