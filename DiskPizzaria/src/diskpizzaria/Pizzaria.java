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

public class Pizzaria {
    Cadastro cadastro = new Cadastro();
    
    private void Pedido(){
        Scanner teclado = new Scanner(System.in);
        Integer id;
        Integer id_buscado = 0;
        String cond;
        int custo = 0;
        
        //cria cardapio
        Pizza Queijo = new Pizza();
        Queijo.setIngredientesCardapio(1, "Sim", "Não", "Não", "Não",
                "Não", "Não", "Não", "Não");
        
        Pizza AlhoETomate = new Pizza();
        AlhoETomate.setIngredientesCardapio(2, "Sim", "Sim", "Sim", "Não",
                "Não", "Não", "Não", "Não");
        
        Pizza Frango = new Pizza();
        Frango.setIngredientesCardapio(3, "Não", "Não", "Não", "Não",
                "Não", "Sim", "Não", "Não");
        
        Pizza Pepperoni = new Pizza();
        Pepperoni.setIngredientesCardapio(4, "Sim", "Não", "Não", "Sim",
                "Não", "Não", "Não", "Não");
            
        Pizza Chocolate = new Pizza();
        Chocolate.setIngredientesCardapio(5, "Não", "Não", "Não", "Não",
                "Não", "Não", "Sim", "Sim");
        
        //mostra cardapio
        Pizza[] Cardapio = new Pizza[5];
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("      Cardapio");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        
        id = Queijo.getId_pizza();
        System.out.println("pizza de queijo id: " + id);
        System.out.println("");
        System.out.println("Ingredientes:");
        System.out.println("");
        Queijo.getIngredientes();
        Cardapio[0] = Queijo;
        
        id = AlhoETomate.getId_pizza();
        System.out.println("pizza de Alho e Tomate id: " + id);
        System.out.println("");
        System.out.println("Ingredientes:");
        System.out.println("");
        AlhoETomate.getIngredientes();
        Cardapio[1] = AlhoETomate;
        
        id = Frango.getId_pizza();
        System.out.println("pizza de Frango id: " + id);
        System.out.println("");
        System.out.println("Ingredientes:");
        System.out.println("");
        Frango.getIngredientes();
        Cardapio[2] = Frango;
        
        id = Pepperoni.getId_pizza();
        System.out.println("pizza de Pepperoni id: " + id);
        System.out.println("");
        System.out.println("Ingredientes:");
        System.out.println("");
        Pepperoni.getIngredientes();
        Cardapio[3] = Pepperoni;
        
        id = Chocolate.getId_pizza();
        System.out.println("pizza de Chocolate id: " + id);
        System.out.println("");
        System.out.println("Ingredientes:");
        System.out.println("");
        Chocolate.getIngredientes();
        Cardapio[4] = Chocolate;
        
        int numPizzas;
        System.out.printf("Informe um número de pizzas desejadas: ");
        System.out.println("");
        numPizzas = teclado.nextInt();
        cond = teclado.nextLine();
        
        Pizza[] pedido = new Pizza[numPizzas];
        
        for(int i = 0; i < numPizzas; i++)
        {
            System.out.println("é uma pizza do cardapio? [Sim ou Não]");
            cond = teclado.nextLine();
            
            if("Sim".equals(cond)){
                System.out.println("Ta no cardapio!!");
                System.out.println("Informe o id da Pizza");
                id_buscado = teclado.nextInt();
                cond = teclado.nextLine();
                pedido[i] = Cardapio[id_buscado-1];
                System.out.println("");
                System.out.println("Sua pizza possui:");
                System.out.println("");
                System.out.println("e custa : R$ " + Cardapio[id_buscado-1].getPreco());
                pedido[i].getIngredientes();
                custo += Cardapio[id_buscado-1].getPreco();
            }else{
                System.out.println("Crie uma pizza:");
                Pizza pizza = new Pizza();
                pizza.setIngredientes();
                System.out.println("Sua pizza possui:");
                pizza.getIngredientes();
                pedido[i] = pizza;
                System.out.println("e custa : R$ " + Cardapio[id_buscado-1].getPreco());
                custo += Cardapio[id_buscado-1].getPreco();
            }
        }
        
        
        
        
        Bebida bebida = new Bebida();
        int numBebidas;
        System.out.printf("Informe um número de Bebidas desejadas: ");
        System.out.println("");
        numBebidas = teclado.nextInt();
        Bebida[] pedido_bebidas = new Bebida[numBebidas];
        
        //cria as bebidas do cardapio 
        //mostra cardapio
        Bebida[] bebidas_cardapio = new Bebida[2];
        
        Bebida coca = new Bebida();
        coca.setDistribuidoraCardapio("Coca Cola Brasil", 1, "Coca Cola", "Rogerio", "26.65", "388.108.598.269", "000000001", "(11) 99145-1123", 5, 20);
        bebidas_cardapio[0] = coca;
        
        Bebida pepsi = new Bebida();
        pepsi.setDistribuidoraCardapio("pepsi Brasil", 2, "Pepsi", "Cristiano", "25.67", "383.108.698.269", "000001001", "(11) 99145-9876", 5, 25);
        bebidas_cardapio[1] = pepsi;
        
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("      Cardapio");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        System.out.println(" [" + bebidas_cardapio[0].getId() + "] " + bebidas_cardapio[0].getProduto() + " .......... R$ " + bebidas_cardapio[0].getPreco());
        System.out.println("");
        System.out.println(" [" + bebidas_cardapio[1].getId() + "] " + bebidas_cardapio[1].getProduto() + " .............. R$ " + bebidas_cardapio[1].getPreco());
        
        for(int i = 0; i < numBebidas; i++)
        {
            System.out.println("Informe o id da Bebida: ");
            id_buscado = teclado.nextInt();
            cond = teclado.nextLine();
            pedido_bebidas[i] = bebidas_cardapio[id_buscado-1];
            bebidas_cardapio[id_buscado-1].Compra();
            custo += bebidas_cardapio[id_buscado-1].getPreco();
            System.out.println("");
            
            if(bebidas_cardapio[id_buscado-1].getEstoque() < 4)
            {
                System.out.println("Estoque baixo de " + bebidas_cardapio[id_buscado-1].getProduto());
                System.out.println("");
                System.out.println("Informações da Distribuidora:");
                System.out.println("");
                bebidas_cardapio[id_buscado-1].getDistribuidora();
                
            }
        }
        
        
        //revisão
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Seu Pedido Custou: R$ " + custo);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.println("");
        
    }
    
    public void diskPizza(String Telefone)
    {
        
        String telefone = cadastro.getTelefone();
        if(telefone == null ? Telefone != null : !telefone.equals(Telefone)){
            System.out.println("Não cadastrado");
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Informe seu nome:");
            String Nome = teclado.nextLine();
            System.out.println("Informe seu CPF");
            String Cpf = teclado.nextLine();
            
            cadastro.cadastra(Nome, Telefone, Cpf);
            Pedido();
        }else{
            System.out.println("já cadastrado");
            Pedido();
        }
    }
}
