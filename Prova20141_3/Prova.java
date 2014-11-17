package Prova20141_3;


public class Prova
{
    public Prova() {}
    
    /**
     * retorna o indice encontrado ou último indice vazio
     */
    public int existeNaMatriz(int n, int[][] matriz)
    {
        for (int l = 0;l < matriz.length;l = l + 1) {
            /**
             * Retorna o Índice quando encontrar o número ou
             * Para quando o count([l][1]) for 0
             */
            if (matriz[l][0] == n || matriz[l][1] == 0) {
                return l;
            }
        }
        
        return 0;
    }

    /**
    * Elabore um método (assinatura e implementação) que recebe um vetor de números 
    * inteiros (tamanho qualquer) e apresenta para o usuário, em modo texto, quantas vezes 
    * cada número informado aparece. As informações da saída não podem ser repetidas. 
    * Exemplo: entrada: {1, 2, 8, 1, 1, 5, 8} (3,0) 
    * saída: N. 1 —> 3 vezes | N. 2 —> 1 vez | N. 8 —> 2 vezes | N. 5 —> 1 vez
    * {1,1,1,2,8,8,5,5,5,7,7,7,9,9,8}
    */
    public void q1(int[] numeros)
    {
       int[][] count = new int[numeros.length][2];
       int indice = 0;
       
       for (int l = 0;l < numeros.length;l = l + 1) {
           indice = this.existeNaMatriz(numeros[l], count);
           count[indice][0] = numeros[l];
           count[indice][1] = count[indice][1] + 1;
       }
       
       for (int l = 0;l < count.length;l = l + 1) {
           if (count[l][1] == 0) {
               break;
           }
           System.out.println(count[l][0]+" => "+count[l][1]);
       }
    }
   
    /**
    * Elabore um método (assinatura e implementação) que recebe uma matriz quadrada 
    * (não é necessário verificar as dimensões) de números inteiros positivos e informa, para 
    * o usuário, em modo texto, os fatoriais de cada elemento da diagonal principal e os 
    * próximos números primos após cada elemento da diagonal secundária. Primeiro 
    * devem ser exibidos todos os fatoriais e, após isso, todos os próximos números 
    * primos. Considere que estão prontos e disponíveis (na mesma classe em que você 
    * está elaborando o método) os métodos public double fatorial(int n) - retorna o fatorial de 
    * n - e public int proximoPrimo(int n) - retorna o próximo número primo depois de n.
    */
    /**
     * Método auxiliar
     * Fatorial
     */
    public double fatorial(int n)
    {
       double total = n;
       n = n - 1;
       while (n > 1) {
           total = total * n;
           n = n - 1;
       }
       
       return total;
    }

    /**
     * Método auxiliar.
     * Primos
     */
    public boolean primo(int numero)
    {
        int up = 2;
        int down = 0;
        
        if (numero % 2 == 0) {
            down = (numero / 2);
        } else {
            down = (numero + 1) / 2;
        }
        
        while (down >= up) {
            if ( (numero % down == 0) || (numero % up == 0) ) {
                return false;
            }
            
            down = down - 1;
            up = up + 1;
        }
        
        if (numero > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método auxiliar
     * Próximo primo
     */
    public int proximoPrimo(int n)
    {
        n = n + 1;
        while (!this.primo(n)) {
            n = n + 1;
        }
        
        return n;
    }
    
    public void q2(int[][] numeros)
    {
        System.out.println("D.Principal: ");
        for(int l = 0;l < numeros.length;l = l + 1) {
            System.out.println(numeros[l][l]+" -> "+this.fatorial(numeros[l][l])+" ");
        }
        System.out.println();
        System.out.println("D.Secundaria: ");
        for(int l = (numeros.length - 1);l >= 0;l = l - 1) {
            System.out.println(numeros[l][(numeros.length - 1) - l]+" -> "+this.proximoPrimo(numeros[l][(numeros.length - 1) - l])+" ");
        }
    }
   
    /**
    * Elabore um método (assinatura e implementação) que recebe uma matriz de tamanho 
    * mínimo 2x2 (a matriz deve sempre conter no mínimo duas linhas e duas colunas, 
    * realize essa verificação e prossiga apenas caso a matriz esteja ok) e retorna uma 
    * matriz com duas colunas e mesma quantidade de linhas da matriz de entrada. Cada 
    * posição da primeira coluna da saída contem o maior elemento da respectiva linha da 
    * matriz de entrada e cada posição da segunda coluna contem o segundo maior 
    * elemento. (verificação: 1pt, restante: 3pts)
    * Exemplo:
    * 1 3 2 4
    * 9 8
    * -1 0 1 retorno: { {4,3}, {9,8}, {1,0} }
    */
    public int[][] q3(int[][] numeros)
    {
        if (numeros.length < 2) {
            return new int[1][1];
        }
        for (int l = 0;l < numeros.length;l = l + 1) {
           if (numeros[l].length < 2) {
               return new int[1][1];
           }
        }
        
        int[][] matriz = new int[numeros.length][2];
        for (int l = 0;l < numeros.length;l = l + 1) {
            for (int c = 0;c < numeros[l].length;c = c + 1) {
                if (c == 0) {
                    matriz[l][1] = Integer.MIN_VALUE;
                    matriz[l][0] = Integer.MIN_VALUE;
                }
                if (numeros[l][c] >= matriz[l][0]) {
                    matriz[l][1] = matriz[l][0];
                    matriz[l][0] = numeros[l][c];
                } else if (numeros[l][c] >= matriz[l][1]) {
                    matriz[l][1] = numeros[l][c];
                }
            }
        }
        
        return matriz;
    }
}
