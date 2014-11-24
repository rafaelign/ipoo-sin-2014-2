package Atividade4_0;


public class Servidor extends Funcionario
{
    protected int carga_horaria;
    protected String titulacao;
    
    public Servidor()
    {
        super();
        this.carga_horaria = 20;
        this.titulacao = "Secretário";
    }
    
    public Servidor(String nome, String endereco, String telefone, String email, int escritorio, double salario, Data admissao, int carga_horaria, String titulacao)
    {
        super(nome, endereco, telefone, email, escritorio, salario, admissao);
        if (carga_horaria == 20 || carga_horaria == 40) {
            this.carga_horaria = carga_horaria;
        }
        this.titulacao = titulacao;
    }
    
    public String toString()
    {
        return "Servidor - "+this.nome;
    }
}
