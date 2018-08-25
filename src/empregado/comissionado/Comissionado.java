package empregado.comissionado;

import empregado.Empregado;

public class Comissionado extends Empregado{

    private float comissao;


    public Comissionado(String nome_, String endereco_, float salario_){
        super(nome_, endereco_, "Comissionado", salario_);
        this.comissao = 0;
    }

    public void adcComissao(float novaComissao){
        comissao = novaComissao > 0 ? novaComissao: comissao;
    }
}
