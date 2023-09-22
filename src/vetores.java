import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int n;
//		
//		System.out.print("quantas vezes voce vai digitar? ");
//		n = sc.nextInt();
//		
//		int[] vetor = new int[n];
//		
//		for (int i=0; i<vetor.length; i++) {
//			System.out.print("Digite um valor: ");
//			vetor[i] = sc.nextInt();
//			
//		}
//		System.out.println("Valores negativos:");
//		
//		for(int i=0; i< vetor.length; i++) {
//			if(vetor[i] < 0) {
//				System.out.printf("%d\n", vetor[i]);
//
//			}
//		}
//
//		Locale.setDefault(Locale.US);
//		Scanner sc  = new Scanner(System.in);
//		
//		int n;
//		
//		System.out.print("Quantas pessoas vão ser cadastradas? ");
//		 n = sc.nextInt();
//		 
//		 String[] nome = new String[n];
//		 int[] idade = new int[n];
//		 double[] altura = new double[n];
//		 
//		 for(int i =0; i<n; i++) {
//			 System.out.println("dados da "+(i+1)+"a pessoa:");
//			 System.out.print("nome: ");
//			 nome[i] = sc.next();
//			 System.out.print("idade: ");
//			 idade[i] = sc.nextInt();
//			 System.out.print("altura: ");
//			 altura[i] = sc.nextDouble();
//		 }
//		 
//		 int cont = 0;
//		 for (int i =0; i<n; i++) {
//			 if(idade[i]< 16) {
//				 cont += 1;
//				 
//			 }
//			 double percente = cont * 100.0 /n;
//			 System.out.printf("percentual de pessoas com menso de 16 anos: "+ percente+"%");
//		 }
//		 double soma = 0 ;
//		 for(int i =0; i<n; i++) {
//			 soma += altura[i];
//		 }
//		 double mediaAltura = soma /n;
//		 
//		 	System.out.printf("Altura media: %.2f%n", mediaAltura);
//		 
//		 for (int i =0; i<n; i++) {
//			 if(idade[i]< 16) {
//				 System.out.println(nome[i]);
//			 }
//		 }
//		 sc.close();
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int n;
//		
//		System.out.print("Quantas vezes voce vai digitar? ");
//		n = sc.nextInt();
//		
//		double[] vetor = new double[n];
//		
//		for(int i=0; i<vetor.length; i++) {
//			System.out.print("Digite um numero: ");
//			vetor[i] = sc.nextDouble();
//		}
//		
//		System.out.println();
//		System.out.print("Valores = ");
//		
//		for(int i=0; i<vetor.length; i++) {
//			System.out.printf("%.1f",vetor[i]);
//		}
//		
//		double soma = 0;
//		
//		for(int i=0; i<vetor.length; i++) {
//			soma += vetor[i];			
//		}
//		
//		System.out.printf("SOMA = %.2f%n", soma);
//		
//		double media = 0;
//		
//		for(int i=0; i<vetor.length; i++) {
//			media = soma /n;
//		}
//		System.out.printf("SOMA = %.2f%n", soma);
//		System.out.printf("Media = %.2f%n", media);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos numeros vão ser digitados? ");
		n = sc.nextInt();
		
		int[] num = new int[n];
		int[] vetor = new int[n];
	
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i]=sc.nextInt();
		}
		 for(int i=0 ; i<vetor.length; i++) {
			 if(vetor[i] % 2 == 0) {	 
				System.out.println();
		 		System.out.printf("%d%n ", vetor[i]);
			 }
		 }	 
		 int contardor = 0;
		  for (int i=0 ; i<vetor.length; i++){
			  if(vetor[i] % 2 == 0) {
				  contardor += 1;
			  }
		  }
			 	System.out.printf("Quantidade de numeros pares: %d", contardor);
	}
}
