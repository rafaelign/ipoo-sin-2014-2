package Prova20131_1;


public class ContaCorrente
{
    private String nome;
    private double saldo;
    private String nConta;
    
    public ContaCorrente()
    {
        this.nome = "Nome";
        this.saldo = 0.00;
        this.nConta = "XXXX-x";
    }

    public ContaCorrente(String nome, double saldo, String nConta)
    {
        this.nome = nome;
        this.saldo = saldo;
        this.nConta = nConta;
    }

    public String informaNome()
    {
        return this.nome;
    }
    
    public double informaSaldo()
    {
        return this.saldo;
    }
    
    public String informaNConta()
    {
        return this.nConta;
    }
}
