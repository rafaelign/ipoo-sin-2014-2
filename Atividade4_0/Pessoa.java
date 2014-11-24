package Atividade4_0;


public class Pessoa
{
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;
    
    public Pessoa()
    {
        this.nome = "-";
        this.endereco = "-";
        this.telefone = "-";
        this.email = "-";
    }
    
    public Pessoa(String nome, String endereco, String telefone, String email)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String toString()
    {
        return "Pessoa - "+this.nome;
    }
}
