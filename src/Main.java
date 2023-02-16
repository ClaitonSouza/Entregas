

/* Projeto simples de calculo medio de rendimentos por hora e entregas feitas.

 Roadmap

 depois de desenvolvida a parte logia desse codigo, sera legal desenvolver um
 app com um bonito front end, com o intuito de ajudar os entregadore a organizar
 seus rendimentos.
 Por ser simples e utilizado como estudo em meu aprendizado em programacao
 espero que gostem */


import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


      double ganhosTotais;
      double entregasFeitas;
      double ganhosPorentregas;


      double gorjeta;
      double gorjetaEntregas;

      double horasTrabalhadas;
      double ganhosporHora;

      int op;



      Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seus Rendimentos totais de hoje Guerreiro: ");
        ganhosTotais = entrada.nextDouble();
        System.out.println("Digite o total de entregas feitas hoje Guerreiro: ");
        entregasFeitas = entrada.nextDouble();
        ganhosPorentregas = ganhosTotais / entregasFeitas;
        System.out.println("Media de  " + ganhosPorentregas + "Reais por entrega");


        System.out.println("Digite quanto ganhou de gorjeta hoje Guerreiro");
        gorjeta = entrada.nextDouble();
        gorjetaEntregas = gorjeta / entregasFeitas;
        System.out.println("Voce ganhou uma media de " + gorjetaEntregas + "Reais de gorjetas por entregas");


        System.out.println("Digite Quantas horas de trabalho no dia de hoje Guerreiro: ");
        horasTrabalhadas = entrada.nextDouble();
        ganhosporHora = ganhosTotais / horasTrabalhadas;
        System.out.println("Guerreiro, hoje voce guanhou; " + ganhosporHora + " Reais por hora trabalhada");











        System.out.println();


    }
}
