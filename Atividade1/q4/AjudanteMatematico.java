package Atividade1.q4;

/**
 *   Implemente  métodos  para  as  seguintes  funcionalidades: 
 *   (em  uma  classe chamada  AjudanteMatemático)
 *   1. Verificar  se  um  número  é  par;
 *   2. Verificar  se  um  número  é  ímpar;
 *   3. Calcular  a  soma  dos  quadrados  de  4  números  informados  via  parâmetro;
 *   4. Qual  é  o  maior  número  dentre  3  números  informados  via  parâmetro;
 *   5. Calcular a área de uma circunferência a partir do seu raio e considerando a 
 *   seguinte fórmula:  Área  =  3,14159  *  (raio*raio)
 *   6. Verificar  se  um  número  é  primo
 */
public class AjudanteMatematico
{
    public boolean verificarPar(int x)
    {
        return (x % 2 == 0);
    }

    public boolean verificarImpar(int x)
    {
        return (x % 2 != 0);
    }

    public float somarQuadrados(float x, float y, float z, float w)
    {
        return ( (x*x) + (y*y) + (z*z) + (w*w)  );
    }
    
    public String verificarMaiorNumero(int x, int y, int z)
    {
        if ( (x == z && x > y) || (x == y && x > z) || (x > y && x > z) ) {
            return x+" é maior";
        } else if ( (y == z && y > x) || (y == x && y > z) || (y > x && y > z) ) {
            return y+" é maior";
        } else if ( (z == y && z > x) || (z == x && z > y) || (z > x && z > y) ) {
            return z+" é maior";
        } else {
            return "Os números são iguais";
        }
    }
    
    public double calcularArea(double raio)
    {
        return ( 3.14159 * (raio*raio) );
    }
    
    public boolean verificarPrimo(int x)
    {
        return !( ( (x > 2) && (x % 2) == 0 ) || 
                  ( (x > 3) && (x % 3) == 0 ) || 
                  ( (x > 5) && (x % 5) == 0 ) || 
                  ( (x > 7) && (x % 7) == 0 ) || 
                  ( (x > 11) && (x % 11) == 0 ) ||
                  ( x <= 1 ));
    }
}
