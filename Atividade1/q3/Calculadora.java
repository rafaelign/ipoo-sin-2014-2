package Atividade1.q3;


public class Calculadora
{
    private float cotacao;
    private float resultado;
    
    public Calculadora() {
        this.cotacao = 2;
    }
    
    public void definirCotacao(float cotacao) {
        this.cotacao = cotacao;
    }

    public float retornarCotacao() {
        return this.cotacao;
    }

    public void definirResultado(float cotacao) {
        this.cotacao = cotacao;
    }

    public float retornarResultado() {
        return this.cotacao;
    }
    
    public float somar(float x, float y){
        return (x + y);
    }
    
    public float subtrair(float x, float y) {
        return (x - y);
    }
    
    public float multiplicar(float x, float y) {
        return (x * y);
    }

    public float dividir(float dividendo, float divisor) {
        return (dividendo / divisor);
    }
    
    public void calcular(float x) {
        this.definirResultado(this.multiplicar(x, this.retornarCotacao()));
    }
    
    public void calcular(char op, float x, float y) {
        if (op == '+') {
            // somar
            this.definirResultado(this.somar(x, y));
        } else if (op == '-') {
            // subtrair
            this.definirResultado(this.subtrair(x, y));
        } else if (op == '*') {
            // multiplicar
            this.definirResultado(this.multiplicar(x, y));
        } else if (op == '/') {
            // dividir
            this.definirResultado(this.dividir(x, y));
        }
    }
}
