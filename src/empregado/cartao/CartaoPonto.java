package empregado.cartao;

public class CartaoPonto {

    private float horas;
    private int dia;
    private int mes;
    private int ano;

    public CartaoPonto(float horas_, int dia_, int mes_, int ano_){
        this.horas = (horas_>0) ? horas_: 0;
        this.dia = (dia_>0) ? dia_: 0;
        this.mes = (mes_ > 0) ? mes_: 0;
        this.ano = (ano_> 0) ? ano_: 0;
    }

    public float obterHoras(){
        return this.horas;
    }
    public int obterDia() {
        return this.dia;
    }
    public int obterMes() {
        return this.mes;
    }
    public int obterAno() {
        return this.ano;
    }
}
