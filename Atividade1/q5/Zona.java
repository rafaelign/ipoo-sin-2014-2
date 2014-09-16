package Atividade1.q5;

/**
 *   Ao  final  da  votação,  a  zona  eleitoral  deve  ser  capaz  de  informar:
 *   Total de votos;
 *   Total de votos para cada candidato, branco e nulo;
 *   Percentual de votos para cada candidato, branco e nulo;
 *   Vencedor;
 */
public class Zona
{
    private Urna u1;
    private Urna u2;
    private Urna u3;

    public Zona()
    {
        this.u1 = new Urna();
        this.u2 = new Urna();
        this.u3 = new Urna();
    }

    public Zona(Urna u1, Urna u2, Urna u3)
    {
        this.u1 = u1;
        this.u2 = u2;
        this.u3 = u3;
    }

    public int contarVotos(){
        return (u1.contarVotos() + u2.contarVotos() + u3.contarVotos());
    }

    public int contarVotosCA() {
        return (u1.contarCandidatoA() + u2.contarCandidatoA() + u3.contarCandidatoA());
    }

    public int contarVotosCB() {
        return (u1.contarCandidatoB() + u2.contarCandidatoB() + u3.contarCandidatoB());
    }

    public int contarVotosCC() {
        return (u1.contarCandidatoC() + u2.contarCandidatoC() + u3.contarCandidatoC());
    }

    public int contarVotosNulos() {
        return (u1.contarNulos() + u2.contarNulos() + u3.contarNulos());
    }

    public int contarVotosBrancos() {
        return (u1.contarBrancos() + u2.contarBrancos() + u3.contarBrancos());
    }
    
    public String contarPercentualVotosCA() {
        return ( ( this.contarVotosCA() * 100 ) / this.contarVotos() ) + "%";
    }

    public String contarPercentualVotosCB() {
        return ( ( this.contarVotosCB() * 100 ) / this.contarVotos() ) + "%";
    }

    public String contarPercentualVotosCC() {
        return ( ( this.contarVotosCC() * 100 ) / this.contarVotos() ) + "%";
    }

    public String contarPercentualVotosNulos() {
        return ( ( this.contarVotosNulos() * 100 ) / this.contarVotos() ) + "%";
    }

    public String contarPercentualVotosBrancos () {
        return ( ( this.contarVotosBrancos() * 100 ) / this.contarVotos() ) + "%";
    }

    public String verificarVencedor() {
        if ( (this.contarVotosCA() == this.contarVotosCC() && this.contarVotosCA() > this.contarVotosCB()) || 
             (this.contarVotosCA() == this.contarVotosCB() && this.contarVotosCA() > this.contarVotosCC()) || 
             (this.contarVotosCA() > this.contarVotosCB() && this.contarVotosCA() > this.contarVotosCC()) ) {
            return "Vencedor da eleição: Candidato A;";
        } else if ( (this.contarVotosCB() == this.contarVotosCC() && this.contarVotosCB() > this.contarVotosCA()) || 
                    (this.contarVotosCB() == this.contarVotosCA() && this.contarVotosCB() > this.contarVotosCC()) || 
                    (this.contarVotosCB() > this.contarVotosCA() && this.contarVotosCB() > this.contarVotosCC()) ) {
            return "Vencedor da eleição: Candidato B;";
        } else if ( (this.contarVotosCC() == this.contarVotosCB() && this.contarVotosCC() > this.contarVotosCA()) || 
                    (this.contarVotosCC() == this.contarVotosCA() && this.contarVotosCC() > this.contarVotosCB()) || 
                    (this.contarVotosCC() > this.contarVotosCA() && this.contarVotosCC() > this.contarVotosCB()) ) {
            return "Vencedor da eleição: Candidato C;";
        } else {
            return "Empate";
        }
    }
}
