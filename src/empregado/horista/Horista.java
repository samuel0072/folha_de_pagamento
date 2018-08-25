package empregado.horista;

import empregado.Empregado;

public class Horista extends Empregado{

    private float horas;

    public Horista(String nome_, String endereco_, float salario){
        super(nome_, endereco_, "horista", salario);


    }
}
