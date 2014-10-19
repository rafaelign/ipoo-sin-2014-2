package Fibonacci;


/**
 * Escreva a descrição da classe Fibonacci aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Fibonacci
{
    /**
     * Construtor para objetos da classe Fibonacci
     */
    public Fibonacci()
    {
    }
    
    /**
     * verificaTermo
     */
    public int verificaTermo(int n)
    {
        if (i > 0) {
            int ant = 0;
            int atual = 1;
            int aux = 0;
            
            if (i == 1) {
                return 0;
            } else if (i == 2) {
                return 1;
            } else {
                for(int i = 0;i < n;i = i + 1) {
                    aux = ant;
                    ant = atual;
                    atual = aux + atual;
                }
                
                return atual;
            }
        }
    }
}
