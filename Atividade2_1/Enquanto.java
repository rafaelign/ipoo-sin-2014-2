package Atividade2_1;


public class Enquanto
{
    public Enquanto() {}

    /**
     * Apresenta para o usuário (em modo texto) os quadrados dos números inteiros de 15 a 200
     */
    public void quadrados()
    {
        int i = 15;
        while (i <= 200) {
            System.out.println(i+"*"+i+"= "+ (i*i) );
            i = i + 1;
        }
    }
    
    /**
     * Apresenta para o usuário (em modo texto) o resultado da soma dos valores pares de 1 até 500.
     */
    public void somaPares()
    {
        int i = 1;
        int total = 0;
        while (i <= 500) {
            
            if (i % 2 == 0) {
                total = total + i;
            }
            i = i + 1;
            
        }
    }

    /**
     * Apresenta para o usuário (em modo texto) uma tabela de conversão de graus Celsius 
     * para graus Fahrenheit (a fórmula de conversão é F = C*9.0/5.0+32, onde F é a temperatura
     * em Fahrenheit e C é a temperatura em Celsius). A tabela deve iniciar em 0o C até 30o C, 
     * com incrementos de 0,5o
     */
    public void converteCemF()
    {
        double c = 0;
        double f = 0;
        while (c <= 30) {
            
            f = (c * 9 / 5) + 32;
            c = c + 0.5;
            
        }
    }
    
    /**
     * Recebe via parâmetro um número inteiro positivo qualquer (entre 1 e 10) e 
     * retorna o somatório dos fatoriais de 1 até o número informado via parâmetro. 
     * O tipo do retorno deve ser long. Sugestão: criar primeiro o método fatorial 
     * e depois o somatório de fatoriais.
     */
    public long fatorial(int n)
    {
        long total = 1;

        while (n > 0) {

            total = total * n;
            n = n - 1;
            
        }
        
        return total;
    }
    
    public long somaFatoriais(int n)
    {
        long total = 0;
        int i = 1;
        while (i <= n) {
        
            total = total + this.fatorial(i);
            i = i + 1;
        
        }
        return total;
    }
    
    /**
     * Apresenta o somatório dos fatoriais dos números ímpares entre 1 e 10.
     */
    public void somaFatoriaisImpares()
    {
        long total = 0;
        int i = 1;
        while (i < 10) {
        
            total = total + this.fatorial(i);
            i = i + 2;
        
        }
        System.out.println("Soma dos fatoriais dos ímpares: "+total+".");
    }
    
    /**
     * Recebe via parâmetro dois números inteiros positivos. 
     * O primeiro (n1) deve ser um número no intervalo de 2 a 9 e o segundo (n2), 
     * deve ser um número inteiro entre 0 e 30. O método retorna um número do tipo
     * long representando n1n2 (n1 elevado na potencia n2). 
     * Utilize estruturas de repetição.
     */
    public long potencia(int b, int e)
    {
        if (b >= 2 && b <= 9 && e >= 0 && e <= 30 ) {
            while (e > 0) {
                b = b * b;
                e = e - 1;
            }
            
            return b;
            
        } else return 0;
    }
    
    /**
     * Recebe via parâmetro um número inteiro na faixa de 1 até 9 (inclusive) (n1) 
     * e um segundo número inteiro positivo (n2). 
     * O método deve retornar o total de números divisíveis por n1, na faixa de 1 até n2.
     */
    public int totalDivisoes(int n1, int n2)
    {
        int total = 0;
        
        if (n1 >= 1 && n1 <= 9) {

            while (n2 > 0) {
                if (n1 % n2 == 0) {
                    total = total + 1;
                }
                n2 = n2 - 1;
            }
            
        }
        
        return total;
    }
    
    /**
     * Apresenta para o usuário (em modo texto) o somatório de número de 
     * grãos de trigo que pode-se obter num tabuleiro de xadrez, 
     * obedecendo à seguinte regra: colocar um grão de trigo no 
     * primeiro quadro e, nos quadros seguintes, o dobro do quadro anterior. 
     * Ou seja, no 1o quadro coloca-se 1 grão, no segundo 2 grãos (neste momento temos 3 grãos), 
     * no 3o quadro colocam-se 4 grãos (agora temos 7 grãos), no 4o quadro 
     * colocam-se 8 grãos (agora temos 15 grãos) até atingir o sexagésimo quarto quadro.
     */
    public void somaGraosXadrez()
    {
        long total = 1;
        long x = 1;
        int i = 2;
        while (i <= 64) {

            x = x * 2;
            System.out.println(total);
            total = total + x;
            System.out.println("+"+x);
            i = i + 1;
        }
        
        System.out.println("Total Grãos: "+total);
    }
    
    /**
     * Implemente uma classe em Java para contar o número de dias decorridos
     * entre duas datas. As datas devem ser informadas através de 4 parâmetos (d1, m1, d2, m2), 
     * representando o 1o dia e seu mês e o 2o dia e seu mês, respectivamente. 
     * O programa deve verificar se as datas são válidas (mês e número de dias do mês), 
     * e se a segunda data é realmente posterior a primeira (caso contrário informar que 
     * houve um erro ao fornecer as datas).
     * OBS.: O número de dias de cada mês a ser considerado no cálculo é o seguinte:
     * i. 1 e 28 – fevereiro
     * ii. 1 e 31 - janeiro, março, maio, julho, agosto, outubro e dezembro
     * iii. 1 e 30 – abril, junho, setembro e novembro
     * Obs2.: apesar deste problema poder ser resolvido sem estruturas de repetição, 
     * neste caso, utilize-as.
     */
    public void contarDias(int d1, int m1, int d2, int m2)
    {
        int total = 0;
        int diasMes = 31;
        d1 = d1 - 1;
        
        if (m1 <= 12 && m2 <= 12 && (m1 < m2 || (m1 == m2 && d1 < d2))) {
            if (d1 < d2 && m1 == m2) {
                // Mesmo mês...
                if (d2 > 30 && (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11)) {
                    d2 = 30;
                } else if (d2 > 28 && m1 == 2) {
                    d2 = 28;
                } else if (d2 > 31) {
                    d2 = 31;
                }
                System.out.println("Total de dias percorridos: "+(d2 - d1));
            } else {
                // Primeiro mês
                if (d1 >= 0) {
                    if (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11) {
                        total = 30 - d1;
                    } else if (m1 == 2) {
                        total = 28 - d1;
                    } else {
                        total = 31 - d1;
                    }
                    
                    m1 = m1 + 1;
                }

                // Meses sequentes
                while (m1 <= m2) {
                    if (m1 == m2) {
                        diasMes = d2;
                    } else {
                        diasMes = 31;
                    }

                    // Ajuste do dia limite
                    if (diasMes > 31) {
                        diasMes = 31;
                    }
                    if (diasMes > 30 && (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11)) {
                        diasMes = 30;
                    } else if (diasMes > 28 && m1 == 2) {
                        diasMes = 28;
                    }

                    total = total + diasMes;
                    m1 = m1 + 1;
                }
                
                System.out.println("Total de dias percorridos: "+total);
            }
        } else {
            System.out.println("Dados informados incorretamente.");
        }
    }
}
