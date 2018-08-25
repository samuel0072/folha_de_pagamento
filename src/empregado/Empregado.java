package empregado;
import empregado.cartao.CartaoPonto;

import java.util.ArrayList;

public class Empregado {


    private String nome;
    private String endereco;
    private String tipo;

    private float salario;
    private int num;

    private ArrayList<CartaoPonto> cartoes = new ArrayList<CartaoPonto>();


    public Empregado(String nome_, String endereco_, String tipo_, float salario_){
        this.nome = nome_;
        this.endereco = endereco_;
        this.tipo = tipo_;
        this.salario = (salario > 0) ? salario_ : 0;
    }

    public void mudarNome(String novoNome){
        this.nome = novoNome;
    }
    public void mudarEnd(String novoEnd){
        this.endereco = novoEnd;
    }
    public void mudarTipo(String novoTipo){
        this.tipo = novoTipo;
    }

    public void mudarSalario(float novoSalario){
        this.salario = novoSalario > 0 ? novoSalario : salario;
    }

    public void adcNovoCartao(float horas_, int dia_, int mes_, int ano_){
        this.cartoes.add(new CartaoPonto(horas_, dia_, mes_, ano_));
    }


}
