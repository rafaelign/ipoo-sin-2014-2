package Atividade2.q1;


public class DiasEmHoras
{
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    public DiasEmHoras()
    {
        this.mes = 1;
        this.dia = 1;
        this.hora = 0;
        this.minutos = 0;
    }

    public DiasEmHoras(int mes, int dia, int hora, int minutos)
    {
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    public boolean configurarMes(int mes)
    {
        if ( mes > 0 && mes <= 12 ) {
            this.mes = mes;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean configurarDia(int dia)
    {
        int maximoDias = 31;
        if ( this.mes == 2 ) {
            maximoDias = 28;
        } else if ( this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 10 ) {
            maximoDias = 30;
        }

        if ( dia > 0 && dia <= maximoDias ) {
            this.dia = dia;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean configurarHora(int hora)
    {
        if ( hora > 0 && hora <= 24 ) {
            this.hora = hora;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean configurarMinutos(int minutos)
    {
        if ( minutos > 0 && minutos <= 60 ) {
            this.minutos = minutos;
            return true;
        } else {
            return false;
        }
    }
    
    public int converteEmHoras()
    {
        int mesesCalculados = 0;
        int totalHoras = this.hora;
        if ( this.mes > 2 ) {
            totalHoras = totalHoras + (28 * 24);
            mesesCalculados = mesesCalculados + 1;
        } else if ( this.mes > 4 ) {
            totalHoras = totalHoras + (30 * 24);
            mesesCalculados = mesesCalculados + 1;
            if ( this.mes > 6 ) {
                totalHoras = totalHoras + (30 * 24);
                mesesCalculados = mesesCalculados + 1;
                if ( this.mes > 9 ) {
                    totalHoras = totalHoras + (30 * 24);
                    mesesCalculados = mesesCalculados + 1;
                    if ( this.mes > 11 ) {
                        totalHoras = totalHoras + (30 * 24);
                        mesesCalculados = mesesCalculados + 1;
                    }
                }
            }
        }
        return this.hora + (this.mes * (31 - mesesCalculados) * 24) + (this.dia * 24);
    }
}
