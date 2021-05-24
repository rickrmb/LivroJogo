package correto;
import java.io.IOException;

//Precisa restabelecer estrutura de escolhar com números

import java.util.Scanner;

public class MeuLivroNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);

		String nome;
		int decisao, caminho, arma, reiniciar = 1;

		System.out.println("AGILE ADVENTURES");
		System.out.println("Um jogo de Ricardo Rezende");
		System.out.println(
				"<------------------------------------------------------------------------------------------->\n\n");

		while (reiniciar == 1) {

			System.out.println(
					"O agilidium foi roubado das terras ageis e foi levado pelo vilão Lenthor para o castelo de disperdiçor.\nSua missão é resgatar o agilidium, antes que as terras ageis virem um caos!\n\n");

			System.out.println("Qual seu nome, guerreiro?");
			nome = leitor.next();

			System.out.println("\nMuito bem " + nome + "! Você está pronto para recuperar o agilidium?");
			System.out.println("1.SIM");
			System.out.println("2.NÃO");
			decisao = leitor.nextInt();

			while (decisao != 1 & decisao != 2) {
				System.out.println(
						"\nEu lá sei o que é " + "'" + decisao + "'" + "! Vamos tentar de novo.\n\nVocê está pronto?");
				System.out.println("1.SIM");
				System.out.println("2.NÃO");
				decisao = leitor.nextInt();
			}

			if (decisao == 1) {
				System.out.println(
						"\nÓtimo! Há dois caminhos possíveis para o castelo de disperdiçor: Passando pelo vale da cascata ou pelo vale de sprintolandia. E então, por qual caminho você vai");
				System.out.println("1.Vale da CASCATA");
				System.out.println("2.Vale de SPRINTOLANDIA");
				caminho = leitor.nextInt();

				while (caminho != 1 & caminho != 2) {
					System.out.println(
							"\nVocê tem um sério problema com digitação né? Vamos tentar de novo.\nCASCATA ou SPRINTOLANDIA?");
					System.out.println("1.Vale da CASCATA");
					System.out.println("2.Vale de SPRINTOLANDIA");
					caminho = leitor.nextInt();
				}

				while (caminho != 2) {
					System.out.println(
							"\nPense bem! O vale da cascata é mais demorado, e não temos tempo a perder!\n\nE então, por qual caminho você vai?");
					System.out.println("1.Vale da CASCATA");
					System.out.println("2.Vale de SPRINTOLANDIA");
					caminho = leitor.nextInt();
				}

				System.out.println(
						"\nSábia decisão! Os dias se passaram e você está de cara a cara com o Lenthor. Escolha uma arma para enfrenta-lo e recuperar o agilidium.\nMas pense bem, apenas uma dessas armas será efetiva. Suas opções são: MVPLIDIUM e REUNIUMDARIUM. Qual você escolhe?");
				System.out.println("1.MVPLIDIUM");
				System.out.println("2.REUNIUNDARIUM");
				arma = leitor.nextInt();

				while (arma != 1 & arma != 2) {
					System.out.println(
							"\nSe for pra digitar qualquer coisa, a gente pode ficar aqui o dia inteiro!\nVamos tentar de novo.");
					System.out.println("1.MVPLIDIUM");
					System.out.println("2.REUNIUNDARIUM");
					arma = leitor.nextInt();
				}

				if (arma == 1) {
					System.out.println(
							"\nE o MVPLIDIUM provou que o Lenthor não é de nada rapidamente! As terras ágeis podem recuperar sua paz agora, parabéns "
									+ nome + "!\n\n");
				} else {
					System.out
							.println("\nReuniumdarium te deixou devagar e o Lenthor fugiu! Você está fora... Game Over!");
				}

			} else {

				System.out.println("\nNão temos tempo a perder! Você está fora... Game Over!");
			}

			{

			}
			System.out.println(
					"<------------------------------------------------------------------------------------------->\n\n");
			if (reiniciar == 1) {
				System.out.println("Gostaria de jogar novamente?");
				System.out.println("1.Sim");
				System.out.println("2.Não");
				reiniciar = leitor.nextInt();
				System.out.println(
						"<------------------------------------------------------------------------------------------->\n\n");

				while (reiniciar != 1 & reiniciar != 2) {
					System.out.println("1 ou 2. Vamos tentar novamente");
					System.out.println("Gostaria de jogar novamente?");
					System.out.println("1.Sim");
					System.out.println("2.Não");
					reiniciar = leitor.nextInt();
				}

			}
		}

		System.out.println("Até mais!");

		leitor.close();

	}

}
