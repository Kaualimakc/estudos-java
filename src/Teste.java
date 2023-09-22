import java.util.Locale;
import java.util.Scanner;

import util.Meta;

public class Teste {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("quantos dias ja foram trabalhados? ");
		 int diasTrabalhado = sc.nextInt();
		 
		 System.out.print("Quantos pontos você tem nesse momento?");
		 int quantPontosAtuais =sc.nextInt();
		 
		 double mediaAtual = Meta.mediaAtual(diasTrabalhado , quantPontosAtuais );
		 
		 double missingMeta = Meta.faltaParaMeta(quantPontosAtuais);
		 

		 
		 System.out.printf("Media de produção diaria: %.1f%n%n", mediaAtual);
		 
		 double bonus = Meta.bonificacaoDoMes(quantPontosAtuais);
		 
		 
		 if (quantPontosAtuais >= 600) {
			 System.out.printf(" você vai ganhar R$ %.2f , por te batido a meta do mês" , bonus);
			 }
			 else {
				 System.out.printf("Falta: %.1f pontos para bater a meta!%n", missingMeta);
				 System.out.println();
				 System.out.print("Quantos dias faltam para acabar o mês? ");
				 int diasrestantes = sc.nextInt();
				 
				 double pontosRestantes = Meta.pontosDiarioParaMeta(diasrestantes, missingMeta);		 
				 System.out.printf("Você precisa fazer %.1f pontos por dia ate o fim do mês!", pontosRestantes);
				 
			 }
		 
		 sc.close();

	}

}
