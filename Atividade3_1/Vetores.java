package Atividade3_1;


public class Vetores
{
    /**
     * Constructor for objects of class Vetores
     */
    public Vetores()
    {}

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
}
