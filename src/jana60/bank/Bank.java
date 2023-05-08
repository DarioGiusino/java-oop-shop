package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome per creare il conto...");
		String userName = sc.next();
		sc.close();
		
		Conto c = new Conto(userName);
		c.addMoney(2000);
		System.out.println(c);
	}
}
