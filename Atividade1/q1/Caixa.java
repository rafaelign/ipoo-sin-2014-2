package Atividade1.q1;



public class Caixa
{
    private Conta conta;
    private int qtdeCedulas10;
    private int qtdeCedulas20;
    private int qtdeCedulas50;
    private boolean contaAutenticada;
    
    public Caixa() {
        this.conta = new Conta();
        this.qtdeCedulas10 = 0;
        this.qtdeCedulas20 = 0;
        this.qtdeCedulas50 = 0;
        this.contaAutenticada = false;
    }
    
    public Caixa(int qtdeCedulas10, int qtdeCedulas20, int qtdeCedulas50) {
        this.conta = new Conta();
        this.qtdeCedulas10 = qtdeCedulas10;
        this.qtdeCedulas20 = qtdeCedulas20;
        this.qtdeCedulas50 = qtdeCedulas50;
        this.contaAutenticada = false;
    }

    public boolean depositar() {
        return true;
    }
    public boolean sacar() {
        return true;
    }
    public float consultar() {
        return 0;
    }
    public boolean autenticar() {
        return true;
    }
}