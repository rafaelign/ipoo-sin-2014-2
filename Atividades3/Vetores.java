package Atividades3;

/**
 * Arquivo: Lista de Exercícios 3.0: Vetores
 */
public class Vetores
{
    public Vetores() {}

    /**
     * Método auxiliar.
     * Mostrar Matrizes.
     */
    public void mostrarVetor(int[] numeros, String separador)
    {
        for (int indice = 0;indice < numeros.length;indice = indice + 1) {
            System.out.print(numeros[indice]);
            if (indice < (numeros.length - 1)) {
                System.out.print(separador);
            }
        }
    }
    
    /**
     * Recebe um vetor com 20 valores e, após a leitura, informa quais deles são 
     * pares e quais deles são ímpares
     */
    public void identificarNumeros(int[] numeros)
    {
        for (int i = 0;i < numeros.length;i = i + 1) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]+" - PAR");
            } else {
                System.out.println(numeros[i]+" - IMPAR");
            }
        }
    }
    
    /**
     * Recebe um vetor com 10 caracteres e mostra-os para o usuário em ordem inversa
     */
    public void mostrarInvertido(char[] caracteres)
    {
        for (int i = (caracteres.length - 1);i >= 0;i = i - 1) {
            System.out.print(caracteres[i]);
        }
    }
    
    /**
     * Recebe um vetor com 10 valores inteiros e apresenta o fatorial de cada um deles
     */
    public int fatorial(int numero)
    {
        int count = numero - 1;
        while (count > 1) {
            numero = numero * count;
            count = count - 1;
        }

        return numero;
    }
    
    public void calcularFatoriais(int[] numeros)
    {
        for (int i = 0;i < numeros.length;i = i + 1) {
            System.out.println(numeros[i]+"! = "+this.fatorial(numeros[i]));
        }
    }
    
    /**
     * Recebe por parâmetro um vetor com 10 valores inteiros e informa (para o usuário,em modo texto)
     * qual	é o maior e o menor valor lido, bem como suas posições no vetor
     */
    public void mostrarMaiorMenor(int[] numeros)
    {
        int indiceMenor = -1;
        int indiceMaior = -1;
        int numeroMaior = 0;
        int numeroMenor = 0;
        for (int i = 0;i < numeros.length;i = i + 1) {
            if (numeros[i] > numeroMaior || indiceMaior == -1) {
                indiceMaior = i;
                numeroMaior = numeros[i];
            }

            if (numeros[i] < numeroMenor || indiceMenor == -1) {
                indiceMenor = i;
                numeroMenor = numeros[i];
            }
        }
        
        System.out.print("Menor valor Vetor["+indiceMenor+"]: "+numeroMenor+" - Maior valor Vetor["+indiceMaior+"]: "+numeroMaior);
    }
    
    /**
     * Repita o mesmo exercício da letra d, porém informe agora os dois maiores e os dois menores valores,
     * bem como suas posições
     */
    public void mostrarMaiorMenor2(int[] numeros)
    {
        int[] maioresIndices = {-1, -1};
        int[] menoresIndices = {-1, -1};
        int[] maioresNumeros = {0, 0};
        int[] menoresNumeros = {0, 0};
        int k;
        for (int i = 0;i < numeros.length;i = i + 1) {
            for (k = 0;k < 2;k = k + 1) {
                
            }
            
            for (k = 0;k < 2;k = k + 1) {
            }
        }
    }
    
    /**
     * Recebe por parâmetro um vetor com 20 valores inteiros (positivos e negativos) e retorna um novo 
     * vetor somente com os valores negativos.
     */
    public int[] transformarEmNegativos(int[] numeros)
    {
        for (int i = 0;i < numeros.length;i = i + 1) {
            if (numeros[i] > 0) {
                numeros[i] = numeros[i] * -1;
            }
        }
        
        return numeros;
    }
    
    /**
     * Dado um gabarito de uma prova com 10 questões cujas respostas podem ser A, B, C, D ou E, 
     * elabore um método que receba uma prova por parâmetro retorna a quantidade de acertos. 
     * Gabarito: {A,A,C,E,D,B,C,E,B,D}.
     */
    public int corrigirProva(char[] respostas)
    {
        char[] gabarito = {'A','A','C','E','D','B','C','E','B','D'};
        int acertos = 0;
        
        for (int questao = 0;questao < gabarito.length;questao = questao + 1) {
            if (respostas[questao] == gabarito[questao]) {
                acertos = acertos + 1;
            }
        }
        
        return acertos;
    }
    
    /**
     * Recebe um vetor com 15 valores inteiros e: 1. divide todos os elementos deste vetor pelo 
     * maior valor e 2. Divide todos os elementos pelo menor valor. Apresente os vetores resultantes.
     */
    public void processarVetor(float[] numeros)
    {
        float maiorValor;
        float menorValor;
        
        for (int i = 0;i < numeros.length;i = i + 1) {
            if (i == 0) {
                maiorValor = numeros[i];
                menorValor = numeros[i];
                continue;
            }
            
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
            
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
        }
        
        float vetorA = new float[numeros.length];
        float vetorB = new float[numeros.length];
        for (int i = 0;i < numeros.length;i = i + 1) {
            vetorA[i] = numeros[i] / maiorValor;
            vetorB[i] = numeros[i] / menorValor;
        }
        
        this.mostrarVetor(vetorA, " | ");
        System.out.println();
        System.out.println();
        this.mostrarVetor(vetorB, " | ");
    }
    
    /**
     * Gere os 30 primeiros números primos a partir de 100 e armazene-os em um vetor. No final, 
     * imprima o vetor com os números primos.
     */
    
    /**
     * Dados dois vetores, cada um com 5 valores inteiros, realize a multiplicação dos elementos 
     * com o mesmo índice e, ao final, exiba o vetor resultante para o usuário.
     */
    
    /**
     * Dado um vetor com 20 elementos (parâmetro), primeiro imprima-o (com os valores lado-a-lado) e, 
     * em seguida, troque o primeiro elemento com o último, o segundo com o penúltimo, o terceiro com 
     * o antepenúltimo, e assim sucessivamente. Mostre o novo vetor depois da troca.
     */
    
    /**
     * Dado um vetor de 15 números inteiros, apresentar quantas vezes cada número informado aparece.
     */
    
    /**
     * Calcule o número de dias decorridos entre duas datas. As datas devem ser lidas no formato 
     * dia-mês (considerando que ambas estão no ano corrente). O programa deve verificar se as datas 
     * são válidas (mês e número de dias do mês), e se a segunda data é realmente posterior a primeira 
     * (caso contrário informar que houve um erro ao fornecer as datas). Considere a quantidade correta
     * de dias para cada mês. Utilize um vetor para representar os dias de cada mês.
     */
}
