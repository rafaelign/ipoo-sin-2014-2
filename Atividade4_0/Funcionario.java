package Atividade4_0;


public class Funcionario extends Pessoa
{
    protected int escritorio;
    protected double salario;
    protected Data admissao;
    
    public Funcionario()
    {
        super();
        this.escritorio = 0;
        this.salario = 0;
        this.admissao = new Data();
    }
    
    public Funcionario(String nome, String endereco, String telefone, String email, int escritorio, double salario, Data admissao)
    {
        super(nome, endereco, telefone, email);
        this.escritorio = escritorio;
        this.salario = salario;
        this.admissao = admissao;
    }
    
    public String toString()
    {
        return "Funcionario - "+this.nome;
    }
}
