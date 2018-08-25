package folha;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import empregado.Empregado;
import empregado.horista.Horista;
import empregado.comissionado.Comissionado;

public class Folha {
    private ArrayList<Empregado> assalariados     = new ArrayList<Empregado>();
    private ArrayList<Horista> horistas           = new ArrayList<Horista>();
    private ArrayList<Comissionado> comissionados = new ArrayList<Comissionado>();

    private int dia;
    private int mes;
    private int ano;
    private String[] dias = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
    private String diaAtual;

    private Scanner leitor = new Scanner(System.in);

    public Folha(int dia_, int mes_, int ano_){
        this.dia = dia_>0?dia_: 0;
        this.mes = mes_> 0 ? mes_ : 0;
        this.ano = ano_ > 0? ano_: 0;
        this.diaAtual = dias[0];
    }

    public void mudarDia(int novoDia){
        this.dia = novoDia > 0 ? novoDia: 0;
    }
    public void mudarMes(int novoMes){
        this.mes = novoMes > 0 ? novoMes: 0;
    }
    public void mudarAno(int novoAno){
        this.dia = novoAno > 0 ? novoAno: 0;
    }

    public String obterData(){
        return this.dia +"/"+ this.mes + "/" + this.ano;
    }

    //adiciona um funcionario ao sistema
    public void adcFunc(){
        String[] tipos = {"Assalariado", "Horista", "Comissionado"};

        String escolha, nome, endereco;
        float salario;
        int d = 0;
        System.out.println("Informe:");
        System.out.println("Nome:");
        nome = leitor.nextLine();
        System.out.println("Endereco:");
        endereco = leitor.nextLine();

        while(d == 0 || d > 3){
            System.out.println("O empregado e:\n\t1 - Assalariado\n\t2 - Horista\n\t2 - Comissionado");
            d = this.lerNumero();
        }
        escolha = tipos[d-1];
        System.out.println("Informe o salario:");
        salario = leitor.hasNextFloat()? leitor.nextFloat(): 0;

        if(escolha.equals("Assalariado")){
            assalariados.add(new Empregado(nome, endereco, escolha, salario));
        }
        else if(escolha.equals("Horista")){
            horistas.add(new Horista(nome, endereco, salario));
        }
        else {
            comissionados.add(new Comissionado(nome, endereco, salario));
        }
    }

    public int lerNumero(){
        int numero = 0, numero0 = -1;
        while(numero < 0){
            try{
                numero0 = leitor.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println ("Digite um valor numerico!");
                numero0 = leitor.nextInt();
            }
            finally {
                numero = numero0;
            }
        }
        return numero;
    }

    public void lancarCartao(){

    }

    public void lanacarResVenda(){

    }

    public void lanacarTaxaServ(){

    }

    public void ediarFunc(){

    }

    public void rodarFolha(){

    }

    public void desfazer(){

    }

    public void refazer(){

    }

    public void criarAgenda(){

    }

}
