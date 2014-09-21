package Prova20141;


public class Fabrica
{
    private int funcionariosOcupados;
    
    public Fabrica()
    {
        this.funcionariosOcupados = 0;
    }
    
    public void ocuparFuncionario()
    {
        this.funcionariosOcupados = (this.buscarFuncionariosOcupados() + 1);
    }

    public void desocuparFuncionario()
    {
        if (this.buscarFuncionariosOcupados() > 0) {
            this.funcionariosOcupados = (this.buscarFuncionariosOcupados() - 1);
        }
    }

    public int buscarFuncionariosOcupados()
    {
        return this.funcionariosOcupados;
    }

    /**
     * recebePedido 
     * Este método recebe como entrada uma prancha, 
     * a quantidade desejada desta prancha 
     * e uma descrição textual do contato do cliente que fez a encomenda. 
     * 
     * A fábrica possui apenas dois funcionários, portanto, 
     * o pedido só é aceito caso um dos dois funcionários esteja livre. 
     * Caso seja aceito o método retorna verdadeiro e falso caso contrário.
     */
    public boolean recebePedido(Prancha prancha, int quantidade, String cliente)
    {
        return (funcionariosOcupados < 2);
    }
    
    /**
     * Este método recebe como entrada uma prancha 
     * e retorna o valor em R$ do custo para produção da prancha de acordo com as regras a seguir: 
     * Caso o tipo do bloco da prancha seja fibra (identificado por f) ou epoxi (identificado por e) o custo é de R$ 200,00. 
     * Qualquer outro material possui custo de R$ 350,00.
     * 
     * Cada quilha da prancha custa R$ 25,00. 
     * 
     * Pranchas com até 150cm de comprimento acrescentam R $ 50,00 ao custo, 
     * entre 150cm e 180cm acrescentam R$ 75,00 
     * e acima de 180cm acrescentam R$ 100.
     * 
     * O custo base da prancha é a soma do custo do bloco mais o valor das quilhas mais o adicional do comprimento. 
     * O custo total da prancha é o custo base mais 30% do valor do custo base.
     */
    public float calcularCustoPrancha(Prancha prancha)
    {
        float custoTotal = 0;
        // Quilhas
        custoTotal = custoTotal + (prancha.buscarQtQuilhas() * 25);
        
        // Tipo de bloco
        if (prancha.buscarTipoBloco() == 'f' || prancha.buscarTipoBloco() == 'e') {
            custoTotal = custoTotal + 200;
        } else {
            custoTotal = custoTotal + 350;
        }
        
        // Comprimento
        if (prancha.buscarComprimento() <= 150) {
            custoTotal = custoTotal + 50;
        } else if (prancha.buscarComprimento() > 150 && prancha.buscarComprimento() <= 180) {
            custoTotal = custoTotal + 75;
        } else {
            custoTotal = custoTotal + 100;
        }
            
        return (custoTotal * (130 / 100));
    }
    
    /**
     * Este método recebe como entrada um valor em R$ e retorna o seu valor arredondado. 
     * O arredondamento é feito de forma a sempre retornar um valor inteiro, ou seja, sem centavos. 
     * Caso o valor dos centavos seja igual ou superior a 0,5 é retornado o arredondamento para cima. 
     * Caso seja inferior a 0,5 retorna-se o arredondamento para baixo. Exemplo: R$ 723,54 —> 724; R$ 55,32 —> 55
     */
    public float arredondar(float valor)
    {
        float valorArredondado = valor * 100;
        int quantidadeDezenas = 0;

        // Unidades
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
        }
        valorArredondado = valorArredondado / 10;

        // Dezenas
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        if (valorArredondado % 10 != 0) {
            valorArredondado = valorArredondado - 1;
            quantidadeDezenas = quantidadeDezenas +1;
        }
        // Arruma o valor
        valorArredondado = valorArredondado / 10;

        if (quantidadeDezenas >= 5) {
            valorArredondado = valorArredondado + 1;
        }

        return valorArredondado;
    }

    /**
     * Este método recebe como entrada uma prancha e a quantidade destas pranchas, 
     * retorna o preço do pedido e libera um funcionário 
     * (tendo em vista que, como a prancha está pronta, agora este funcionário pode trabalhar em um novo pedido). 
     * 
     * O preço de cada prancha é o custo total da prancha (método calcularCustoPrancha) 
     * mais R$ 50,00 da embalagem e mais 15% do custo total. 
     * 
     * Caso a quantidade de pranchas seja superior a 5 porém inferior a 10, o preço recebe um desconto de 10%. 
     * Caso seja superior a 10 porém inferior a 15, há um desconto de 15% e caso a quantidade seja superior a 15 fornece-se um desconto de 20%. 
     * 
     * O Tiozinho habituado a lidar com grandes quantias não trabalha com moedas, portanto, 
     * o preço final é sempre arredondado através do método arredondar
     */
    public float entregarPrancha(Prancha prancha, int quantidade)
    {
        float totalPedido = 0;

        // Calculando total
        totalPedido = ( ( (this.calcularCustoPrancha(prancha) + 50) * (115 / 100) ) * quantidade );
        
        // Verificação de desconto
        if (quantidade > 5 && quantidade <= 10) {
            totalPedido = totalPedido * (90 / 100);
        } else if (quantidade > 10 && quantidade <= 15) {
            totalPedido = totalPedido * (85 / 100);
        } else if (quantidade > 15) {
            totalPedido = totalPedido * (80 / 100);
        }

        return this.arredondar(totalPedido);
    }
}
