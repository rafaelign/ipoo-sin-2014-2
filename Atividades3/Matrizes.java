package Atividades3;


/**
 * Arquivo: Lista de Exercícios 3.2: Matrizes
 */
public class Matrizes
{
    public Matrizes() {}
    
    /**
     * Método auxiliar.
     * Retorna a ordem da matriz quadrada ou 0 caso não for quadrada
     */
    public int matrizQuadrada(int[][] numeros)
    {
        for (int linha = 0;linha < numeros.length;linha = linha + 1) {
            if (numeros.length != numeros[linha].length) {
                return 0;
            }
        }
        
        return numeros.length;
    }
    
    /**
     * Método auxiliar.
     * Mostrar Matrizes.
     */
    public void mostrarMatriz(int[][] numeros, String separador)
    {
        for (int linha = 0;linha < numeros.length;linha = linha + 1) {
            for (int coluna = 0;coluna < numeros[linha].length;coluna = coluna + 1) {
                System.out.print(numeros[linha][coluna]);
                if (coluna < (numeros[linha].length - 1)) {
                    System.out.print(separador);
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatriz(String[][] textos, String separador)
    {
        for (int linha = 0;linha < textos.length;linha = linha + 1) {
            for (int coluna = 0;coluna < textos[linha].length;coluna = coluna + 1) {
                System.out.print(textos[linha][coluna]);
                if (coluna < (textos[linha].length - 1)) {
                    System.out.print(separador);
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatriz(char[][] caracteres, String separador)
    {
        for (int linha = 0;linha < caracteres.length;linha = linha + 1) {
            for (int coluna = 0;coluna < caracteres[linha].length;coluna = coluna + 1) {
                System.out.print(caracteres[linha][coluna]);
                if (coluna < (caracteres[linha].length - 1)) {
                    System.out.print(separador);
                }
            }
            System.out.println();
        }
    }
    
    /**
     * Método auxiliar.
     * Fatorial.
     */
    public int fatorial(int numero)
    {
        int controle = numero - 1;
        
        while (controle > 1) {
            numero = numero * controle;
            controle = controle - 1;
        }
        
        return numero;
    }
    
    /**
     * Método auxiliar.
     * Potência.
     */
    public int potencia(int base, int expoente)
    {
        int total = 1;

        for (int i = 0;i < expoente;i = i + 1) {
            total = total * base;
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
     * Recebe uma matriz 3x4 por parâmetro e retorna o somatório de todos os elementos da matriz.
     */
    public int somarElementos(int[][] numeros)
    {
        int total = 0;
        
        for (int linha = 0;linha < 3;linha = linha + 1) {
            for (int coluna = 0;coluna < 4;coluna = coluna + 1) {
                total = total + numeros[linha][coluna];
            }
        }
        
        return total;
    }
    
    /**
     * Recebe uma matriz 3x4 por parâmetro e impreme-a (em modo texto, linhas e colunas).
     */
    public void mostrarElementos(int[][] numeros)
    {
        for (int linha = 0;linha < 3;linha = linha + 1) {
            for (int coluna = 0;coluna < 4;coluna = coluna + 1) {
                System.out.print(numeros[linha][coluna] + "  ");
            }
            System.out.println();
        }
    }
    
    /**
     * Recebe uma matriz (tamanho qualquer) por parâmetro e imprime-a (em modo texto, linhas e colunas).
     */
    public void mostrarElementosB(int[][] numeros)
    {
        for (int linha = 0;linha < numeros.length;linha = linha + 1) {
            for (int coluna = 0;coluna < numeros[linha].length;coluna = coluna + 1) {
                System.out.print(numeros[linha][coluna] + "  ");
            }
            System.out.println();
        }
    }
    
    /**
     * Recebe uma matriz 5x5 por parâmetro e retorna uma nova matriz onde todos os elementos devem 
     * ser multiplicados por 10, com exceção da diagonal principal, onde todos os elementos devem ser 0. 
     * Apresente (em modo texto) a matriz resultante para o usuário.
     */
    public void elementosX10(int[][] numeros)
    {
        if (this.matrizQuadrada(numeros) != 5) {
            System.out.print("Matriz inválida! Você deve apresentar uma matriz quadrada de ordem 5");
        } else {
            for (int linha = 0;linha < numeros.length;linha = linha + 1) {
                for (int coluna = 0;coluna < numeros[linha].length;coluna = coluna + 1) {
                    if (linha == coluna) {
                        numeros[linha][coluna] = 0;
                    } else {
                        numeros[linha][coluna] = numeros[linha][coluna] * 10;
                    }
                }
            }
            
            this.mostrarMatriz(numeros, " | ");
        }
    }
    
    /**
     * Recebe uma matriz 3x3 por parâmetro e apresente (para o usuário, em modo texto) a 
     * matriz resultante dos seguintes cálculos: 
     * a) 1a coluna: multiplicar todos os elementos da 1a coluna por 10; 
     * b) 2a coluna: calcular o fatorial de cada elemento desta coluna da matriz original; 
     * c) 3a coluna: elevar cada elemento desta coluna da matriz original na 3a potencia.
     */
    public void formatandoMatriz3x3(int[][] numeros)
    {
        if (this.matrizQuadrada(numeros) != 3) {
            System.out.print("Matriz inválida! Você deve apresentar uma matriz quadrada de ordem 3");
        } else {
            for (int linha = 0;linha < numeros.length;linha = linha + 1) {
                for (int coluna = 0;coluna < numeros[linha].length;coluna = coluna + 1) {
                    if (coluna == 0) {
                        numeros[linha][coluna] = numeros[linha][coluna] * 10;
                    } else if (coluna == 1) {
                        numeros[linha][coluna] = this.fatorial(numeros[linha][coluna]);
                    } else {
                        numeros[linha][coluna] = this.potencia(numeros[linha][coluna], 3);
                    }
                }
            }
            
            this.mostrarMatriz(numeros, " | ");
        }
    }
    
    /**
     * Recebe uma matriz 2x2 por parâmetro e apresente (para o usuário, em modo texto) uma nova 
     * matriz 2x2 com os valores 1 caso o elemento da matriz original seja primo ou 0 caso contrário.
     */
    public void formatandoMatriz2x2(int[][] numeros)
    {
        if (this.matrizQuadrada(numeros) != 2) {
            System.out.print("Matriz inválida! Você deve apresentar uma matriz quadrada de ordem 2");
        } else {
            for (int linha = 0;linha < numeros.length;linha = linha + 1) {
                for (int coluna = 0;coluna < numeros[linha].length;coluna = coluna + 1) {
                    if (this.primo(numeros[linha][coluna])) {
                        numeros[linha][coluna] = 1;
                    } else {
                        numeros[linha][coluna] = 0;
                    }
                }
            }
            
            this.mostrarMatriz(numeros, " | ");
        }
    }
    
    /**
     * Recebe uma matriz 4x4 e informe (para o usuário, em modo texto), quais linhas, colunas e 
     * diagonais possuem valores nulos (0).
     */
    public void formatandoMatriz4x4A(int[][] numeros)
    {
        String linComNull = "";
        String colComNull = "";
        String diaComNull = "";
        if (this.matrizQuadrada(numeros) != 4) {
            System.out.print("Matriz inválida! Você deve apresentar uma matriz quadrada de ordem 4");
        } else {
            for (int linha = 0;linha < numeros.length;linha = linha + 1) {
                for (int coluna = 0;coluna < numeros[linha].length;coluna = coluna + 1) {
                    // Linhas / Colunas
                    if (numeros[linha][coluna] == 0) {
                        if (linComNull.equals("")) {
                            linComNull = ""+linha;
                        } else {
                            linComNull = linComNull + ", " + linha;
                        }

                        if (colComNull.equals("")) {
                            colComNull = ""+coluna;
                        } else {
                            colComNull = colComNull + ", " + coluna;
                        }
                        
                        // Diagonal principal
                        if (linha == coluna && !diaComNull.contains("Principal")) {
                            if (!diaComNull.equals("")) {
                                diaComNull = diaComNull + ", ";
                            }
                            diaComNull = diaComNull + "Principal";
                        }
                        
                        // Diagonal secundária
                        if ((linha + coluna) == (numeros.length - 1) && !diaComNull.contains("Secundaria")) {
                            if (!diaComNull.equals("")) {
                                diaComNull = diaComNull + ", ";
                            }
                            diaComNull = diaComNull + "Secundaria";
                        }
                        
                    }
                }
            }

            if (!linComNull.equals("")) {
                System.out.println("Linhas com valores nullos(0): " + linComNull);
            }
            if (!colComNull.equals("")) {
                System.out.println("Colunas com valores nullos(0): " + colComNull);
            }
            if (!diaComNull.equals("")) {
                System.out.println("Diagonais com valores nullos(0): " + diaComNull);
            }
        }
    }
    
    /**
     * Recebe uma matriz 4x4 e informe (para o usuário, em modo texto), quais linhas, colunas e 
     * diagonais possuem somente valores nulos (0).
     */
    public void formatandoMatriz4x4B(int[][] numeros)
    {
        int[] linhas = {0,0,0,0};
        int[] colunas = {0,0,0,0};
        int dPrincipal = 0;
        int dSecundaria = 0;
        if (this.matrizQuadrada(numeros) != 4) {
            System.out.print("Matriz inválida! Você deve apresentar uma matriz quadrada de ordem 4");
        } else {
            for (int linha = 0;linha < numeros.length;linha = linha + 1) {
                for (int coluna = 0;coluna < numeros[linha].length;coluna = coluna + 1) {
                    // Linhas / Colunas
                    if (numeros[linha][coluna] == 0) {
                        linhas[linha] = linhas[linha] + 1;
                        colunas[coluna] = colunas[coluna] + 1;

                        // Diagonal principal
                        if (linha == coluna) {
                            dPrincipal = dPrincipal + 1;
                        }
                        
                        // Diagonal secundária
                        if ( (linha + coluna) == (numeros.length - 1) ) {
                            dSecundaria = dSecundaria + 1;
                        }
                        
                    }
                }
            }
            
            System.out.print("Linhas com todos valores nulos(0): ");
            for (int i = 0;i < linhas.length;i = i + 1) {
                if (linhas[i] == 4) {
                    System.out.print(i+" ");
                }
            }
            System.out.println(".");

            System.out.print("Colunas com todos valores nulos(0): ");
            for (int i = 0;i < colunas.length;i = i + 1) {
                if (colunas[i] == 4) {
                    System.out.print(i+" ");
                }
            }
            System.out.println(".");

            System.out.print("Diagonais com todos valores nulos(0): ");
            if (dPrincipal == 4) {
                System.out.print("Principal ");
            }
            if (dSecundaria == 4) {
                System.out.print("Secundaria ");
            }
            System.out.println(".");
        }
    }
}
