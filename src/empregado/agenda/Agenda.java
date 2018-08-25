package empregado.agenda;

public class Agenda {
    private String nome;
    private String tipo;
    int duracao;
    String dia;

    public Agenda(String tipo_, String dia_,  int duracao_){
        this.nome = "Semanal "+ dia_ + " "+ tipo_;
        this.duracao = duracao_;
        this.dia = dia;
        this.tipo = tipo_;
    }
}
