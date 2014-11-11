package Atividades3;


/**
 * Arquivo: Lista de Exercícios 3.1: Strings
 */
public class Strings
{
    public Strings() {}

    /**
     * Recebe duas strings (vetor de caracteres) por parâmetro e retorna verdadeiro caso elas sejam 
     * iguais ou falso caso contrário.
     */
    public boolean compararChar(char[] c1, char[] c2)
    {
        if (c1.length != c2.length) {
            return false;
        }
        
        for (int i = 0;i < c1.length;i = i + 1) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Recebe duas strings (tipo String) por parâmetro e retorna verdadeiro caso elas sejam iguais 
     * ou falso caso contrário.
     */
    public boolean compararStrings(String t1, String t2)
    {
        return (t1.equals(t2));
    }
    
    /**
     * Recebe duas strings (vetor de caracteres) por parâmetro e retorna a maior das duas strings.
     */
    public char[] maiorChar(char[] c1, char[] c2)
    {
        if (c1.length > c2.length) {
            return c1;
        } else {
            return c2;
        }
    }
    
    /**
     * Recebe uma string (vetor de caracteres) por parâmetro e informa (em modo texto), a quantidade 
     * de vogais, de consoantes e de números presentes na string.
     */
    public void contarCaracteres(char[] texto)
    {
        int consoantes = 0;
        int vogais = 0;
        int numeros = 0;
        for (int i = 0;i < texto.length;i = i + 1) {
            if (texto[i] >= 48 && texto[i] <= 57) {
                numeros = numeros + 1;
            } else if (
                texto[i] == 65 || texto[i] == 69 || texto[i] == 73 || texto[i] == 79 || texto[i] == 85 ||
                texto[i] == 97 || texto[i] == 101 || texto[i] == 105 || texto[i] == 111 || texto[i] == 117
            ) {
                vogais = vogais + 1;
            } else {
                consoantes = consoantes + 1;
            }
        }
        
        System.out.println("Total de consoantes: "+consoantes);
        System.out.println("Total de vogais: "+vogais);
        System.out.println("Total de números: "+numeros);
    }
    
    /**
     * Um palíndromo é uma frase ou palavra que mantém o mesmo sentido quando lida de trás pra frente. 
     * Exemplos: reger, rir, radar, ele, esse, ama, aia, etc. Construa um método que recebe uma string 
     * por parâmetro e retorna verdadeiro caso a palavra seja um palíndromo ou falso caso contrario.
     */
    public boolean palindromo(String texto)
    {
        String inverso = "";
        for (int i = (texto.length() - 1);i >= 0;i = i - 1) {
            inverso = inverso + texto.charAt(i);
        }
        
        return (texto.equalsIgnoreCase(inverso));
    }
}
