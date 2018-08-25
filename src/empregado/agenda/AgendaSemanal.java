package empregado.agenda;
import empregado.agenda.Agenda;

public class AgendaSemanal extends Agenda {

    int duracao;
    String dia;

    public AgendaSemanal(String dia, int duracao){
        super("Semanal "+ dia + " "+ duracao);
        this.dia = dia;
        this.duracao = duracao;
    }
}
