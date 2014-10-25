package Prova20141_2;


/**
 * Escreva a descrição da classe Prova aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
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
}
