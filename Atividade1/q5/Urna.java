package Atividade1.q5;

public class Urna
{
    private int candidatoA;
    private int candidatoB;
    private int candidatoC;
    private int nulos;
    private int brancos;

    public Urna()
    {
        this.candidatoA = 0;
        this.candidatoB = 0;
        this.candidatoC = 0;
        this.nulos = 0;
        this.brancos = 0;
    }

    public int contarCandidatoA() {
        return this.candidatoA;
    }

    public int contarCandidatoB() {
        return this.candidatoB;
    }

    public int contarCandidatoC() {
        return this.candidatoC;
    }

    public int contarNulos() {
        return this.nulos;
    }

    public int contarBrancos() {
        return this.brancos;
    }
    
    public int contarVotos() {
        return (this.contarCandidatoA() + this.contarCandidatoB() + this.contarCandidatoC() + this.contarNulos() + this.contarBrancos());
    }
    
    public void votar(char candidato) {
        if (candidato == 'a' || candidato == 'A') {
            this.candidatoA = this.contarCandidatoA() + 1;
        } else if (candidato == 'b' || candidato == 'B') {
            this.candidatoB = this.contarCandidatoB() + 1;
        } else if (candidato == 'c' || candidato == 'C') {
            this.candidatoC = this.contarCandidatoC() + 1;
        } else if (candidato == ' ') {
            this.brancos = this.contarBrancos() + 1;
        } else {
            this.nulos = this.contarNulos() + 1;
        }
    }
}
