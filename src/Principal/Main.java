package Principal;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Irá depositar algum valor inicial:(s/n) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Coloque o valor do deposito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Insira um valor de depósito: ");
		double depositoValor = sc.nextDouble();
		conta.deposito(depositoValor);

		System.out.println("Dados atualizados: ");
		System.out.print(conta);
		System.out.println();

		System.out.print("Insira um valor para retirada: ");
		double retiradaValor = sc.nextDouble();
		conta.retirada(retiradaValor);
		System.out.println(conta);

		sc.close();
	}

}
