package Atividade_Estrutura_Repeticao;


/**
 * Write a description of class MostraNumeros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MostraNumeros
{
    /**
     * Constructor for objects of class MostraNumeros
     */
    public MostraNumeros() {}

    public void maioresADireita()
    {
        int sub = 0;
        for (int i = 1;i <= 9;i = i + 1) {
            for (int j = 1;j <= 9;j = j + 1) {
                if ((j - sub) <= 0) {
                    System.out.print("  ");
                } else {
                    System.out.print((j - sub)+" ");
                }
            }
            System.out.println("");
            sub = sub + 1;
        }
    }
    
    public void menoresADireita()
    {
        int print = 1;
        for (int i = 1;i <= 9;i = i + 1) {
            print = i;
            for (int j = 8;j >= 0;j = j - 1) {
                if (print - j <= 0) {
                    System.out.print("  ");
                } else {
                     System.out.print((print)+" ");
                     print = print - 1;
                }
            }
            System.out.println("");
        }
    }
    
    public void numerosADireita(int n)
    {
        int sub = 0;
        int spaces = this.numeroDigitos(n) + 1;
        for (int i = 1;i <= n;i = i + 1) {
            for (int j = 1;j <= n;j = j + 1) {
                for(int k = 0;k < (spaces - this.numeroDigitos(j - sub));k = k + 1){
                    if (j > 1) {
                        System.out.print(" ");
                    }
                }
                if ( (j - sub) <= 0 ) {
                    System.out.print(" ");
                } else {
                    System.out.print(j - sub);
                }
            }
            System.out.println("");
            sub = sub + 1;
        }
    }
    
    public int numeroDigitos(int n)
    {
        int count = 1;
        int i = 10;
        
        while(i >= 10) {
            if (n - i < 0) {
                i = 0;
            } else {
                count = count + 1;
            }
            
            i = i * 10;
        }
        
        return count;
    }
}
