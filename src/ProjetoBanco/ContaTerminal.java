package ProjetoBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite o numero da agencia: ");
		int numero = sc.nextInt();
		System.out.println("Por favor digite a agencia: ");
		String agencia = sc.next();
		System.out.println("Por favor digite o nome do cliente: ");
		String nomeCliente = sc.next();
		System.out.println("Por favor digite o saldo: ");
		double saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco"
				+ "sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponicel para saque");
		sc.close();
	}

}
