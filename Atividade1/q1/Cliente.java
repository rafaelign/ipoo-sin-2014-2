package Atividade1.q1;


public class Cliente
{
    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    
    public Cliente(String nome, String cpf, String rg, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento= dataNascimento;
    }
    
    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento= "";
    }
    
    public Cliente() {
        this.nome = "";
        this.cpf = "";
        this.rg= "";
        this.dataNascimento= "";
    }
}