import java.util.Locale;
import java.util.Scanner;

import util.transacoes;


public class Caixa_eletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		transacoes t = null ;
		
		System.out.print("ENter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();		
		
		System.out.print("is there na initial deposit (y/n)? ");
		char escolha = sc.next().charAt(0);
		if(escolha == 'n') {
			t = new transacoes(number, name);
			System.out.println("Account "+t.getNumber()+", Holder: "+t.getName()+", Balance: "+t.getSaldo());
			}
		else if(escolha == 'y') {
			System.out.println("enter finsh deposit value: ");
			double inicialValue = sc.nextDouble();
			t = new transacoes(number, name, inicialValue);
			System.out.println("Account "+t.getNumber()+", Holder: "+t.getName()+", Balance: "+t.getSaldo());
			
		}
			System.out.println();
			System.out.print("enter deposit value: ");
			double deposit = sc.nextDouble();
			t.depositvalue(deposit);
			System.out.println("Account "+t.getNumber()+", Holder: "+t.getName()+", Balance: "+t.getSaldo());
			
			System.out.println();
			System.out.print("enter withdraw value: ");
			double sacar = sc.nextDouble();
			t.withdrawvalue(sacar);
			System.out.println("Account "+t.getNumber()+", Holder: "+t.getName()+", Balance: "+t.getSaldo());
		sc.close();


	}

}
