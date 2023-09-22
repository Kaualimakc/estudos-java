import java.util.Locale;
import java.util.Scanner;

import util.currencyConvert;

public class Main {

	public static void main(String[] args) {
//		double a = 10.5363;
//		System.out.printf("%.2f%n", a);
//		//"%.2f%n" para numeros de pontos flutantes e so aparecer ate a segunda casa decimal.//
//		//para aparecer com o "." em vez da ","//
//		
//		Locale.setDefault(Locale.US);
//		System.out.printf("%.2f%n", a);
//		
//		//concatennação
//		//%f= ponto flutuante (double , float)
//		//%d = inteiros
//		//%s = textos
//		//%n = quebra de linha
//		
//		String nome = "Maria";
//		int idade = 31;
//		double salario = 4000.00;
//		System.out.printf("%s tem %d anos e ghanha %.2f reais%n",nome , idade, salario);
//	
//		String product1 = "Computer";
//		String product2 ="Office desk";
//		
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		
//		double price1 = 2100.00;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		
//		System.out.printf("products: %s , %s %n", product1, product2);
//		System.out.printf("%s, witch price is $ %.2f%n",product1,price1);
//		System.out.printf("%s, witch price is $ %.2f%n%n",product2,price2);
//		
//		System.out.printf("Record: %d years old, code %d and gender:"+gender+"%n" ,age ,code);
//		System.out.printf("Mausue with eigth decimal places: %f%n", measure);
//		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
//		Locale.setDefault(Locale.US);
//		System.out.printf("US decimal point: %.3f", measure);
//	
//		//Usando o "Scanner"
//		//Para ler um uma String = "sc.next();
//		// inteiro = "sc.nextInt();"
//		//ponto flutuante = "sc.nextDouble();"
//		 
//		Scanner sc = new Scanner(System.in);
//		String x;
//		x = sc.next();
//		System.out.println("Você digitou:"+ x);
//		sc.close();
//
//		
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		String dia;
//		
//		switch(x) {
//		case 1:
//			dia ="domingo";
//			break;
//		case 2:
//			dia ="segunda";
//			break;
//		case 3:
//			dia ="terca";
//			break;
//			
//		default:
//			dia = "valor invalido";
//			break;	
//		}
//		System.out.println(dia);
		
//		Scanner sc = new Scanner(System.in);
//		double preco = 34.5;
//		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
//		
//		System.out.println(desconto);
//		sc.close();
	
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int soma = 0;
//		
//		while(num != 0) {
//			System.out.println("digite um novo numero: ");
//			soma += num;
//			num =sc.nextInt();
//			}
//		System.out.println(soma);
		
//		Scanner sc = new Scanner(System.in);
//		int senha = sc.nextInt();
//		
//		while(senha != 1140) {
//			System.out.println("senha invalida!");
//			senha =sc.nextInt();
//		}
//		System.out.println("Senha correta!");
		
//		Scanner sc = new Scanner(System.in);
//		int X,Y; 
//		
//		X = sc.nextInt();Y = sc.nextInt();
//
//		
//		while (X != 0 && Y !=0) {
//			if(X > 0 && Y > 0){
//				System.out.println("primeiro.");	
//				X = sc.nextInt();Y = sc.nextInt();
//			}
//			else if (X < 0 && Y >0) {
//				System.out.println("segundo");
//				X = sc.nextInt();Y = sc.nextInt();
//			}
//			else if (X < 0 && Y < 0) {
//				System.out.println("terceiro");
//				X = sc.nextInt();Y = sc.nextInt();
//			}
//			else {
//				System.out.println("quarto");
//			}
//		}
//		System.out.println("finish!");
		
//		Scanner sc = new Scanner(System.in);
//		
//		int code = sc.nextInt();
//		String combustivel;
//		
//		while(code !=4) {
//			if (code != 4) {
//
//		}

//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		
//		for (int i=1 ; i<=x ; i++) {
//			if(i % 2 !=0) {
//				System.out.println(i);
//			}
//			sc.close();
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int x = 0;
//		int in = 0;
//		int out = 0;
//		
//		for(int i=0; i<=n ; i++) {
//			if (i >= 10 && i <= 20) {
//				in += 1;
//			}
//			else {
//				out += 1;
//			}
//			System.out.println("in: " + in);
//			System.out.println("out: "+ out);
//		}
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i =0; i<n; i++) {
//			double n1 = sc.nextDouble();
//			double n2 = sc.nextDouble();
//			double n3 = sc.nextDouble();
//			
//			double media =( n1 *2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
//			System.out.println(media);
//		}

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i =1 ; i<=n ; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//			}
//		}
//		
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter three numbers: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		int higher = max(a ,b ,c);
//		
//		showResult(higher);
//		
//		sc.close();
//	}
//	
//	
//	public static int max(int a, int b, int c) {
//		int aux;
//		if(a > b && a > c) {
//			aux = a;
//		}else if(b > c) {
//			aux = b;
//		}else {
//			aux = c;
//		}
//		return aux;
//	}
//	public static void showResult(int resultado) {
//		System.out.println("higher: "+ resultado);
//	Locale.setDefault(Locale.US);
//	Scanner sc = new Scanner(System.in);
//	
//	triangle x, y;
//	x = new triangle();
//	y = new triangle();
//	
//	System.out.println("Enter the measures of triangle X: ");
//	x.a = sc.nextDouble();
//	x.b = sc.nextDouble();
//	x.c = sc.nextDouble();
//	System.out.println("Enter the measures of triangle Y: ");
//	y.a = sc.nextDouble();
//	y.b = sc.nextDouble();
//	y.c = sc.nextDouble();
//	
//	double areaX = x.area();
//	double areaY = y.area();
//	
//	System.out.printf("triangle X area: %.4f%n", areaX);
//	System.out.printf("triangle X area: %.4f%n", areaY);
//	
//	if(areaX > areaY) {
//		System.out.println("Larger area: X");
//	}else {
//		System.out.println("Larger area: Y");
//	}
//		
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		estoque product = new estoque();
//		
//		System.out.println("Enter product data: ");
//		System.out.print("name: ");
//		product.name = sc.nextLine();
//		System.out.print("Price: ");
//		product.price = sc.nextDouble();
//		System.out.println("quantity: ");
//		product.quantity = sc.nextInt();
//		
//		System.out.println("Product data: "+ product);
//		
//		System.out.println("Enter numbers of added in Products: ");
//		int quantity = sc.nextInt();
//		product.addProducts(quantity);
//		System.out.println(product);
//		
//		
//		System.out.println();
//		System.out.println("Enter numbers of remove in products: ");
//		quantity = sc.nextInt();
//		product.removeProducts(quantity);
//		System.out.println(product);
//		
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		notas notas = new notas();
//		
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//		System.out.println("Notas: ");
//		notas.nota1 = sc.nextDouble();
//		notas.nota2 = sc.nextDouble();
//		notas.nota3 = sc.nextDouble();
//		
//		if (notas.notaMedia() < 60.0) {
//			System.out.println("Failed");
//			System.out.printf("Missing: %.2fPoints%n",notas.missing());
//		}
//		else {
//			System.out.println("PASS");
//		}

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is the dollar price: ");
		double dollar = sc.nextDouble();
		
		System.out.println("how many dollars will be bought?");
		double quantity = sc.nextDouble();
		
		double real = currencyConvert.quantidadeReal(dollar, quantity);
		double total = currencyConvert.total(real);
		
		System.out.println(total);
		sc.close();
		
		


	}
}
