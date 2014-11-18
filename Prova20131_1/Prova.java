package Prova20131_1;


public class Prova
{
    public Prova() {}

    /**
     * Elabore o seguinte método public void maioresSaldos (ContaCorrente [] contas), o 
     * qual recebe um vetor de contas correntes e informa, para o usuário, em modo texto, os 
     * nomes e os números das contas das pessoas com os três maiores saldos (apresente 
     * 1o o maior saldo, depois o 2o maior e por último o 3o). A classe ContaCorrente possui 
     * os seguintes métodos: public String informaNome() - retorna o nome do dono da conta; 
     * public double informaSaldo () - retorna o saldo da conta; public String informaNConta() - 
     * retorna o número da conta.
     * 
     * Entrada
     */
    public void maioresSaldos (ContaCorrente[] contas)
    {
        int[] mContas = new int[3];
        double[] mValores = new double[3];
        
        for (int conta = 0;conta < contas.length;conta = conta + 1) {
            if (contas[conta].informaSaldo() >= mValores[0]) {
                mValores[2] = mValores[1];
                mContas[2] = mContas[1];
                mValores[1] = mValores[0];
                mContas[1] = mContas[0];
                mValores[0] = contas[conta].informaSaldo();
                mContas[0] = conta;
            } else if (contas[conta].informaSaldo() >= mValores[1]) {
                mValores[2] = mValores[1];
                mContas[2] = mContas[1];
                mValores[1] = contas[conta].informaSaldo();
                mContas[1] = conta;
            } else if (contas[conta].informaSaldo() >= mValores[2]) {
                mValores[2] = contas[conta].informaSaldo();
                mContas[2] = conta;
            }
        }
        
        System.out.println("Contas com maiores saldos:");
        for (int i = 0;i < mContas.length;i = i + 1) {
            System.out.print( (i+1) );
            System.out.print( " - Nome: " + contas[mContas[i]].informaNome() );
            System.out.println( " Conta: " + contas[mContas[i]].informaNConta());
        }
    }
    
    /**
     * Elabore um método (assinatura e implementação) que recebe uma matriz quadrada
     * (verifique se as dimensões estão corretas - uma matriz quadrada possui a mesma 
     * quantidade de linhas e colunas) de números inteiros positivos e informa, para o usuário, 
     * em modo texto, os fatoriais de cada elemento da diagonal principal e os próximos 
     * números primos após cada elemento da diagonal secundária. Considere que estão 
     * prontos e disponíveis (na mesma classe em que você está elaborando o método) os 
     * métodos public double fatorial(int n) - retorna o fatorial de n - e public int 
     * proximoPrimo(int n) - retorna o próximo número primo depois de n.
     */
    
    /**
     * Um palíndromo é uma frase ou palavra que mantém o mesmo sentido quando lida de 
     * trás pra frente. Exemplos: reger, rir, radar, ele, esse, ama, aia. Construa um método 
     * (assinatura e implementação) que recebe um vetor de caracteres por parâmetro e 
     * retorna verdadeiro caso o vetor represente um palíndromo ou falso caso contrario
     */
}
