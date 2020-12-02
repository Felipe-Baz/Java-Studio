/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskpizzaria;

/**
 *
 * @author Felipe Baz Mitsuishi
 */

public class Cadastro {
    //cadastro
    private String nome;
    private String telefone;
    private String cpf;
    
    private void setNome(String n)
    {
        nome = n;
    }
    private void setTelefone(String t)
    {
        telefone = t;
    }
    private void setCpf(String c)
    {
        cpf = c;
    }
    
    public String getNome()
    {
        return nome;
    }
    public String getTelefone()
    {
        return telefone;
    }
    public String getCpf()
    {
        return cpf;
    }
    
    public void cadastra(String Nome, String Telefone, String Cpf){
        setNome(Nome);
        setTelefone(Telefone);
        setCpf(Cpf);
    }
}
