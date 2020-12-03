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

public class Gerenciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizzaria pizzaria = new Pizzaria();
        Scanner teclado = new Scanner(System.in);
        Cadastro[] Gerenciador = new Cadastro[90];
        int numCadastros = 0;
        int cadastrado = 0; //condicional: se = 0, não cadastrado.
        while(true)
        {
            System.out.println("Informe seu telefone");
            String telefone = teclado.nextLine();   
            System.out.println("");
            
            
            for(int i = 0; i < numCadastros; i++){
                if(Gerenciador[i].getTelefone().equals(telefone))
                {
                    System.out.println("já cadastrado");
                    cadastrado = 1;
                    pizzaria.Pedido();
                    numCadastros++;
                }
            }
            
            if(cadastrado == 0)
            {
                System.out.println("Não cadastrado");
                Cadastro cadastroAtual = new Cadastro();
                
                System.out.println("Informe seu nome:");
                String Nome = teclado.nextLine();
                System.out.println("Informe seu CPF");
                String Cpf = teclado.nextLine();
                
                cadastroAtual.cadastra(Nome, telefone, Cpf);
                Gerenciador[numCadastros] = cadastroAtual;
                numCadastros++;
                pizzaria.Pedido();
            }
            
            
            System.out.println("");
            
            System.out.println("Encerrar? [Sim ou Não]");
            String condicao = teclado.nextLine(); 
            if("Sim".equals(condicao))
                break;
        }
    }
}
