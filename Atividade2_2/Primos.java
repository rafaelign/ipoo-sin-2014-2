package Atividade2_2;

/**
 * Escreva a descrição da classe Primos aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Primos
{
    private primos = false;
    
    /**
     * Construtor para objetos da classe Primos
     */
    public Primos()
    {}
    
    public void setPrimos(boolean p)
    {
        this.primos = p;
    }
    
    public boolean getPrimos()
    {
        return this.primos;
    }
    
    /**
     * contarDivisores
     */
    public int contarDivisores(int n)
    {
        int count = 2;
        int down = 0;
        int up = 2;
        
        if (n == 1) {
            return 1;
        }
        
        if (n <= 0) {
            return 0;
        }
        
        if (n % 2 == 0) {
            down = n / 2;
        } else {
            down = (n + 1) / 2;
        }
        
        while (down >= up) {
            if (down == up) {
                // Count ++
                if (n % down == 0) {
                    count = count + 1;
                }
            } else {
                // Count down ++
                if (n % down == 0) {
                    count = count + 1;
                }
                
                // Count up ++
                if (n % up == 0) {
                    count = count + 1;
                }
            }
            
            if (this.getPrimos() && count > 2) {
                return 0;
            }
            
            down = down - 1;
            up = up + 1;
        }
        
        return count;
    }
    
    /**
     * proximoPrimo
     */
    public int proximoPrimo(int n)
    {
        int prox = n + 1;
        
        while (this.contarDivisores(prox) != 2) {
            prox = prox + 1;
        }
        
        return prox;
    }
    
    /**
     * somaPrimos
     */
    public long somaPrimos(int ini, int fim)
    {
        long total = 0;
        if (this.contarDivisores(ini) != 2) {
            ini = this.proximoPrimo(ini);
        }

        while (ini <= fim) {
            total = total + ini;
            ini = this.proximoPrimo(ini);
        }
        
        return total;
    }

   /**
    * primosAleatorios
    */
   public void primosAleatorios()
   {
       Random random;
       int n;
       
       this.setPrimos(true);
       
       for (int i = 0;i < 20;i = i + 1) {
           n = random.nextInt();
           if (n < 0) {
               n = n * -1;
           }
           
           if (this.contarDivisores(n, true) == 2) {
               System.out.println("["+n+"] é um número primo.");
           } else {
               System.out.println("["+n+"] NÃO é um número primo.");
           }
       }
   }
}
