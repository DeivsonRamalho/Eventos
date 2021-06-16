package br.com.fuctura.principal;

import java.util.Scanner;

public class Eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eventos = new Scanner(System.in);
		int opcao, opcao2 = 0, qtdMaximoDeIngressos, opcaoDeCompras;
		double valorIngresso, valorDoDesconto, descontoDoIngresso;

		System.out.println("=================================");
		System.out.println("        Cinema Algoritmo         ");
		System.out.println("=================================");
		System.out.println("");
		System.out.println("Qual o valor do ingresso? ");
		valorIngresso = eventos.nextDouble();

		System.out.println("[1] JAVA.");
		System.out.println("[2] SQL.");
		System.out.println("[3] HTML5 / CSS3.");
		System.out.println("[4] PAYTHO.");
		opcao = eventos.nextInt();

		switch (opcao) {
		case 1:

			int poltronaDisponiveis = 48;

			System.out.println("Devido a Pandemia estamos operando nessa sala com 48 poltronas disponives. ");
			do {
				System.out.println("Escolha a opção de compra do ingresso? ");
				System.out.println("[1] Compra feita pela internet. ");
				System.out.println("[2] Cartões de credito parceiros. ");
				System.out.println("[3] Dinheiro direto no caixa. ");
				opcaoDeCompras = eventos.nextInt();
				if (opcaoDeCompras >= 1 & opcaoDeCompras <= 3) {
					System.out.println("Quantos ingressos seram comprados? ");
					qtdMaximoDeIngressos = eventos.nextInt();
													
					if (opcaoDeCompras == 1 & poltronaDisponiveis > 0 & qtdMaximoDeIngressos <= 48) {
						System.out.println("Você terar um desconto de 19% nas compras realizada pela internet. ");
						descontoDoIngresso = valorIngresso * 0.19;
						valorDoDesconto = valorIngresso - descontoDoIngresso;
						System.out.println("O valor pago: R$ " + valorDoDesconto);
						poltronaDisponiveis -= qtdMaximoDeIngressos;						
						
						
					} else if (opcaoDeCompras == 2 && poltronaDisponiveis > 0 && qtdMaximoDeIngressos <= 48) {
						System.out.println(
								"Você terar um desconto de 10% nas compras realizada com os cartões parceiros. ");
						descontoDoIngresso = valorIngresso * 0.10;
						valorDoDesconto = valorIngresso - descontoDoIngresso;
						System.out.println("O valor pago: R$ " + valorDoDesconto);
						poltronaDisponiveis -= qtdMaximoDeIngressos;
						
						
					} else if (opcaoDeCompras == 3 && poltronaDisponiveis > 0 && qtdMaximoDeIngressos <= 48) {
						System.out.println("Você terar um desconto de 5% nas compras realizada direto no caixa. ");
						descontoDoIngresso = valorIngresso * 0.05;
						valorDoDesconto = valorIngresso - descontoDoIngresso;
						System.out.println("O valor pago: R$ " + valorDoDesconto);
						poltronaDisponiveis -= qtdMaximoDeIngressos;
						
					}
					System.out.println("Deseja fazer outra compra? ainda tesmos: " + poltronaDisponiveis + " Ingressos disponíveis");
					System.out.println("[1] SIM.");
					System.out.println("[2] NÃO.");
					opcao2 = eventos.nextInt();
					
				} else {
					System.out.println("Opção invalidade ");
				}
			} while (opcao2 != 2);
			break;
		case 2:
		}

		eventos.close();
	}

}
