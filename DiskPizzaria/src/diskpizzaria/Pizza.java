/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskpizzaria;
import java.util.Scanner;

/**
 * @author Felipe Baz Mitsuishi
 */

public class Pizza {
    private Integer id_pizza;
    private String queijo;
    private String alho;
    private String tomate;
    private String pepperoni;
    private String calabresa;
    private String frango;
    private String chocolate;
    private String morango;
    private Integer preco;
    
    final Integer valorqueijo = 10;
    final private Integer valoralho = 5;
    final private Integer valortomate = 5;
    final private Integer valorpepperoni = 15;
    final private Integer valorcalabresa = 15;
    final private Integer valorfrango = 20;
    final private Integer valorchocolate = 10;
    final private Integer valormorango = 10;
    
    public void setIngredientesCardapio(Integer id, String Queijo,
            String Alho, String Tomate,String Pepperoni, String Calabresa,
            String Frango, String Chocolate, String Morango){
        
        id_pizza = id;
        queijo = Queijo;
        alho = Alho;
        tomate = Tomate;
        pepperoni = Pepperoni;
        calabresa =  Calabresa;
        frango = Frango;
        chocolate = Chocolate;
        morango = Morango;
    }
    
    public void setIngredientes(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tem queijo? [Sim ou Não]");
        queijo = teclado.nextLine();
        System.out.println("Tem alho? [Sim ou Não]");
        alho = teclado.nextLine();
        System.out.println("Tem tomate? [Sim ou Não]");
        tomate = teclado.nextLine();
        System.out.println("Tem pepperoni? [Sim ou Não]");
        pepperoni = teclado.nextLine();
        System.out.println("Tem calabresa? [Sim ou Não]");
        calabresa = teclado.nextLine();
        System.out.println("Tem frango? [Sim ou Não]");
        frango = teclado.nextLine();
        System.out.println("Tem chocolate? [Sim ou Não]");
        chocolate = teclado.nextLine();
        System.out.println("Tem morango? [Sim ou Não]");
        morango = teclado.nextLine();
        System.out.println("");
    }
    
    public void getIngredientes(){
        if("Sim".equals(queijo)){
            System.out.println("Tem queijo");
        }else{
            System.out.println("Não Tem queijo");
        }
        
        if("Sim".equals(alho)){
            System.out.println("Tem alho");
        }else{
            System.out.println("Não Tem alho");
        }
        
        if("Sim".equals(tomate)){
            System.out.println("Tem tomate");
        }else{
            System.out.println("Não Tem tomate");
        }
        
        if("Sim".equals(pepperoni)){
            System.out.println("Tem pepperoni");
        }else{
            System.out.println("Não Tem pepperoni");
        }
        
        if("Sim".equals(calabresa)){
            System.out.println("Tem calabresa");
        }else{
            System.out.println("Não Tem calabresa");
        }
        
        if("Sim".equals(frango)){
            System.out.println("Tem frango");
        }else{
            System.out.println("Não Tem frango");
        }
        
        if("Sim".equals(chocolate)){
            System.out.println("Tem chocolate");
        }else{
            System.out.println("Não Tem chocolate");
        }
        
        if("Sim".equals(morango)){
            System.out.println("Tem morango");
        }else{
            System.out.println("Não Tem morango");
        }
        System.out.println("");
    }
    
    public Integer getId_pizza(){
        return id_pizza;
    }
    
    public Integer getPreco(){
        
        int valor = 0;
        
        if("Sim".equals(queijo)){
            valor += valorqueijo;
        }
        
        if("Sim".equals(alho)){
            valor += valoralho;
        }
        
        if("Sim".equals(tomate)){
            valor += valortomate;
        }
        
        if("Sim".equals(pepperoni)){
            valor += valorpepperoni;
        }
        
        if("Sim".equals(calabresa)){
            valor += valorcalabresa;
        }
        
        if("Sim".equals(frango)){
            valor += valorfrango;
        }
        
        if("Sim".equals(chocolate)){
            valor += valorchocolate;
        }
        
        if("Sim".equals(morango)){
            valor += valormorango;
        }
        preco = valor;
        
        return preco;
    }
}

