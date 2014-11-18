package Prova20132_1;


public class Prova
{
    public Prova() {}

    /**
     * Elabore um método (assinatura e implementação) que recebe uma matriz NxN (ou 
     * seja, uma matriz quadrada, na qual a quantidade de linhas é a mesma que a de 
     * colunas) por parâmetro e retorna um vetor onde cada elemento representa o somatório 
     * de uma diagonal acima da secundária. Não é necessário verificar se a matriz é 
     * quadrada. (4,0)
     * Exemplo:
     *     d0 d1 d2
     * 1  2  3 10 d0 = 1 = 1
     * 1  2  10 0 d1 = 2 + 1 = 3
     * 1  10 0 0 d2 = 3 + 2 + 1 = 6
     * 10 0 0 0 retorno: {1, 3, 6} - vetor com 3 posições
     * 
     * {{1,2,3,10},{1,2,10,0},{1,10,0,0},{10,0,0,0}}
     */
    public int[] somaDiagonais(int[][] numeros)
    {
        int[] diagonais = new int[numeros.length - 1];
        int d;
        int c;
        
        // d0 == 0,0
        // d1 == 1,0 + 0,1
        // d2 == 2,0 + 1,1 + 0,2
        
        for (int dP = 0;dP < diagonais.length;dP = dP + 1) {
            d = dP;
            c = 0;
            while ( (d + c) <= dP && d >= 0) {
                diagonais[dP] = diagonais[dP] + numeros[d][c];
                
                d = d - 1;
                c = c + 1;
            }
        }

        return diagonais;
    }
    
    /**
     * Elabore o seguinte método public ContaCorrente[][] contasNegEPos 
     * (ContaCorrente [] contas), o qual recebe um vetor de contas correntes e retorna um 
     * vetor de vetores de contas. O primeiro (índice 0 do retorno) deve conter todas as 
     * contas com saldos negativos e o segundo (índice 1 do retorno) todas as contas com 
     * saldos positivos. Os vetores devem ter o mesmo tamanho que a sua quantidade de 
     * elementos. A classe ContaCorrente possui os seguintes métodos: public String 
     * informaNome() - retorna o nome do dono da conta; public double informaSaldo () - 
     * retorna o saldo da conta; public String informaNConta() - retorna o número da conta
     */
    
    /**
     * Elabore um método (assinatura e implementação) que recebe uma matriz quadrada 
     * por parâmetro e apresenta para o usuário, em modo texto, qual é o maior e qual é o 2o 
     * maior elemento de cada coluna. Apresente o resultado somente se a matriz for 
     * quadrada, ou seja, faça essa verificação no início do método
     */
}
