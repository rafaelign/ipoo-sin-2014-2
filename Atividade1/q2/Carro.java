package Atividade1.q2;

public class Carro
{
    private float capacidadeTanque;
    private float gasAtual;
    private float consumoMedio;

    /**
     * Constructor for objects of class Carro
     */
    public Carro()
    {
        this.capacidadeTanque = 45;
        this.gasAtual = 0;
        this.consumoMedio = 12;
    }
    
    public Carro(float capacidade)
    {
        this.capacidadeTanque = capacidade;
        this.gasAtual = 0;
        this.consumoMedio = 12;
    }

    public Carro(float capacidade, float consumo)
    {
        this.capacidadeTanque = capacidade;
        this.gasAtual = 0;
        this.consumoMedio = consumo;
    }

    public void abastece(int litrosGas) {
        if (this.informaGas() < this.capacidadeTanque) {
            float qtdeAbastecer = (litrosGas + this.informaGas());
            if (qtdeAbastecer < this.capacidadeTanque) {
                this.gasAtual = qtdeAbastecer;
            } else {
                this.gasAtual = this.capacidadeTanque;
            }
        }
    }
    
    public float informaGas() {
        return this.gasAtual;
    }
    
    public void consomeGas(float distancia) {
        float qtdeConsumo = ( distancia/this.consumoMedio );
        if (this.informaGas() >= qtdeConsumo) {
            this.gasAtual = (this.gasAtual - qtdeConsumo);
        }
    }
    
    public boolean estahNoReserva() {
        if (this.informaGas() <= (this.capacidadeTanque * 0.1)) {
            return true;
        } else {
            return false;
        }
    }

}
