package Prova20141_2;

/**
 * Classe principal
 * 
 * @author Ignácio, Rafael
 */
public class Prova
{
    /**
     * Construtor para objetos da classe Prova
     */
    public Prova() {}

    /**
     * Elabore um método (assinatura e implementação) que recebe um número inteiro e maior do que zero
     * (n) por parâmetro e mostra para o usuário, em modo texto, n termos da série abaixo:
     * Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768, ....!
     * Dica: atenção para a relação entre os termos 2, , , 4, , , 8 o mesmo vale para
     * 7, , 21, , 63 e também 3, , ,12, , 48 ou seja, são 3 seqüências dentro de uma só. (3,0)!
     */
    public void mostrarTermosSerie(int n)
    {
        String termos = "2";
        int tA = 4;
        int tB = 7;
        int tC = 3;
        char proxTermo = 'b';
        
        for(int i = 0;i < (n - 1);i = i + 1) {
            if (proxTermo == 'a') {
                termos = termos + ", " + tA;
                tA = tA * 2;
                proxTermo = 'b';
            } else if (proxTermo == 'b') {
                termos = termos + ", " + tB;
                tB = tB * 3;
                proxTermo = 'c';
            } else if (proxTermo == 'c') {
                termos = termos + ", " + tC;
                tC = tC * 4;
                proxTermo = 'a';
            }
        }
        
        System.out.println(termos);
    }
    
    /**
     * Construa dois métodos,
     * 
     * o primeiro (chamado ehPrimo) recebe um número inteiro positivo 
     * por parâmetro e retorna verdadeiro caso o número seja primo e falso caso contrário. 
     * Um número primo é um número somente divisível por 1 e por ele mesmo. 
     * 
     * O segundo método (chamado proxPrimo) recebe um número inteiro positivo por parâmetro e 
     * retorna o próximo número primo após o parâmetro (ex.: 8 —> 11; 10 —> 11; 3 —> 5). 
     * 
     * Considere que ambos métodos estão na mesma classe e a implementação do método proxPrimo deve, 
     * obrigatoriamente, utilizar o método ehPrimo.
     */
    public boolean ehPrimo(int n)
    {
        int aux = 0;
        if (n % 2 == 0) {
            aux = n / 2;
        } else {
            aux = (n + 1) / 2;
        }

        for(int i = aux;i > 1;i = i - 1) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public int proxPrimo(int n)
    {
        n = n + 1;
        
        while (!this.ehPrimo(n)) {
            n = n + 1;
        }
        
        return n;
    }
    
    /**
     * Elabore o seguinte método em Java (implementação): 
     * public int saldosNaFaixa (Cadastro cad, double inicio, double fim). 
     * Este método recebe por parâmetro um objeto do tipo Cadastro. A classe Cadastro possui o método 
     * public ContaCorrente proxConta(), 
     * o qual, sempre que for executado, retorna a próxima conta corrente do cadastro. 
     * Esta classe possui também o método 
     * public int qtContas() 
     * o qual retorna a quantidade de contas cadastradas. 
     * 
     * O método saldosNaFaixa deve retornar a quantidade de contas correntes, do cadastro, 
     * cujo saldo está na faixa definida pelos parâmetros inicio (inclusive) e fim (inclusive). 
     * A classe ContaCorrente possui os seguintes métodos: 
     * public double informaSaldo() - retorna o saldo da conta; 
     * public String informaNConta() - retorna o número da conta.
     * As classes Cadastro e ContaCorrente já estão prontas, não é necessário implementá-las, 
     * implemente apenas o método saldosNaFaixa, o qual está em outra classe qualquer.
     */
    public int saldosNaFaixa (Cadastro cad, double inicio, double fim)
    {
        int contas = 0;
        ContaCorrente contaAtual;
        for (int i = 0;i < cad.qtContas();i = i + 1) {
            contaAtual = cad.proxConta();
            if (contaAtual.informaSaldo() >= inicio && contaAtual.informaSaldo() <= fim) {
                contas = contas + 1;
            }
        }
        
        return contas;
    }
}
