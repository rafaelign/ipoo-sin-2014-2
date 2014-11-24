package Atividade4_0;


public class Estudante extends Pessoa
{
    protected String graduacao;
    
    public Estudante()
    {
        super();
        this.graduacao = "-";
    }
    
    public Estudante(String nome, String endereco, String telefone, String email, String graduacao)
    {
        super(nome, endereco, telefone, email);
        if (!graduacao.equalsIgnoreCase("bixo") && !graduacao.equalsIgnoreCase("veterano") && !graduacao.equalsIgnoreCase("quase graduado")) {
            graduacao = "-";
        }
        this.graduacao = graduacao;
    }
    
    public String toString()
    {
        return "Estudante - "+this.nome;
    }
}
