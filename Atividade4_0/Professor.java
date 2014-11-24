package Atividade4_0;


public class Professor extends Funcionario
{
    protected double horas_aula;
    protected double horas_pesquisa;
    
    public Professor()
    {
        super();
        this.horas_aula = 0;
        this.horas_pesquisa = 0;
    }
    
    public Professor(String nome, String endereco, String telefone, String email, int escritorio, double salario, Data admissao, double horas_aula, double horas_pesquisa)
    {
        super(nome, endereco, telefone, email, escritorio, salario, admissao);
        this.horas_aula = horas_aula;
        this.horas_pesquisa = horas_pesquisa;
    }
    
    public String toString()
    {
        return "Professor - "+this.nome;
    }
}
