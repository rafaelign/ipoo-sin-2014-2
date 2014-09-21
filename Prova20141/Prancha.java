package Prova20141;

public class Prancha
{
    /**
     * tipoBloco, modelo, qtQuilhas, comprimento, espessura (0,5). 
     * tipoBloco armazena um caracter representando o material da prancha, 
     * modelo descreve textualmente o formato da prancha, 
     * qtQuilhas informa a quantidade de quilhas, 
     * comprimento e espessura, as respectivas medidas em centímetros
     */
    private char tipoBloco;
    private String modelo;
    private int qtQuilhas;
    private float comprimento;
    private float espessura;

    /**
     * esta classe possui dois construtores, 
     * o primeiro possui 4 parâmetros utilizados para inicializar 
     * todos os atributos da classe Prancha.
     * O segundo não tem parâmetro a!lgum e atribui valores padrão 
     * (definidos por você) para todos os atributos.
     */
    public Prancha(char tipoBloco, String modelo, int qtQuilhas, float comprimento, float espessura)
    {
        this.tipoBloco = tipoBloco;
        this.modelo = modelo;
        this.qtQuilhas = qtQuilhas;
        this.comprimento = comprimento;
        this.espessura = espessura;
    }
    
    public Prancha()
    {
        this.tipoBloco = ' ';
        this.modelo = "Não definido";
        this.qtQuilhas = 0;
        this.comprimento = 0;
        this.espessura = 0;
    }
    
    public void definirTipoBloco(char tipoBloco)
    {
        this.tipoBloco = tipoBloco;
    }

    public void definirModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void definirQtQuilhas(int qtQuilhas)
    {
        this.qtQuilhas = qtQuilhas;
    }

    public void definirComprimento(float comprimento)
    {
        this.comprimento = comprimento;
    }

    public void definirEspessura(float espessura)
    {
        this.espessura = espessura;
    }
    
    public char buscarTipoBloco()
    {
        return this.tipoBloco;
    }

    public String buscarModelo()
    {
        return this.modelo;
    }

    public int buscarQtQuilhas()
    {
        return this.qtQuilhas;
    }

    public float buscarComprimento()
    {
        return this.comprimento;
    }

    public float buscarEspessura()
    {
        return this.espessura;
    }
}
