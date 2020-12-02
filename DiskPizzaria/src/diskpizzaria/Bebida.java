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

public class Bebida {
    private String nome;
    private String produto;
    private String pessoaParaContato;
    private String CGC;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String telefone;
    private Integer preco;
    private Integer estoque;
    private Integer id;
    
    public void setDistribuidoraCardapio(String Nome, Integer Id, String Produto,
            String PessoaParaContato, String cgc, String InscricaoEstadual,
            String InscricaoMunicipal,String Telefone,
            Integer Preco, Integer Estoque){
        
        nome = Nome;
        produto = Produto;
        pessoaParaContato = PessoaParaContato;
        CGC = cgc;
        inscricaoEstadual = InscricaoEstadual;
        inscricaoMunicipal = InscricaoMunicipal;
        telefone = Telefone;
        preco = Preco;
        estoque = Estoque;
        id = Id;
    }
    
    public void setDistribuidora(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantidade em estoque");
        estoque = teclado.nextInt();
        produto = teclado.nextLine();
        
        System.out.println("Qual o nome do produto? ");
        produto = teclado.nextLine();
        
        System.out.println("Qual o preco do produto? ");
        preco = teclado.nextInt();
        nome = teclado.nextLine();
        
        System.out.println("Qual o nome da Distribuidora? ");
        nome = teclado.nextLine();
        
        System.out.println("Qual o telefone para contato? ");
        telefone = teclado.nextLine();
        
        System.out.println("Qual o nome da Pessoa Para Contato? ");
        pessoaParaContato = teclado.nextLine();
        
        System.out.println("Qual o CGC? ");
        CGC = teclado.nextLine();
        
        System.out.println("Qual a inscrição Estadual? ");
        inscricaoEstadual = teclado.nextLine();
        
        System.out.println("Qual a inscrição Municipal? ");
        inscricaoMunicipal = teclado.nextLine();
    }
    
    public void getDistribuidora()
    {
        System.out.println("A distribuidora " + nome);
        System.out.println("Vende " + produto);
        System.out.println("A R$ " + preco );
        System.out.println("Possuimos " + estoque + " produtos em estoque");
        System.out.println("Telefone para contato: " + telefone);
        System.out.println("Pessoa para contato: " + pessoaParaContato);
        System.out.println("CGC :" + CGC);
        System.out.println("inscriçao Estadual:"+ inscricaoEstadual);
        System.out.println("inscriçao Municipal:"+ inscricaoMunicipal);
        System.out.println("");
    }
    
    public Integer getEstoque(){
        return estoque;
    }
    
    public String getProduto(){
        return produto;
    }
    
    public Integer getPreco(){
        return preco;
    }
    public Integer getId(){
        return id;
    }
    public void Compra()
    {
        estoque -= 1;
    }
}
