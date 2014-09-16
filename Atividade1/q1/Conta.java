package Atividade1.q1;

public class Conta
{
    private int numero;
    private int agencia;
    private float saldo;
    private String senha;
    private Cliente titular;

    public Conta()
    {
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0;
        this.senha = "";
        this.titular = new Cliente();
    }

    public Conta(int numero, int agencia, String senha, Cliente titular)
    {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
        this.senha = senha;
        this.titular = titular;
    }
    
    public void adicionarSaldo(float valor) {
        this.saldo = (this.consultarSaldo() + valor);
    }

    public void removerSaldo(float valor) {
        this.saldo = (this.consultarSaldo() - valor);
    }
    
    public float consultarSaldo() {
        return this.saldo;
    }
}
