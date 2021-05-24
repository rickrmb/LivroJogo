import java.io.IOException;
import java.util.Scanner;

public class MeuLivro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);

		String nome;
		String decisao, caminho, arma, reiniciar = "SIM";

		System.out.println("AGILE ADVENTURES");
		System.out.println("Um jogo de Ricardo Rezende");
		System.out.println(
				"<------------------------------------------------------------------------------------------->\n\n");

		while (reiniciar.equalsIgnoreCase("SIM")) {

			System.out.println(
					"O agilidium foi roubado das terras ageis e foi levado pelo vilão Lenthor para o castelo de disperdiçor.\nSua missão é resgatar o agilidium, antes que as terras ageis virem um caos!\n\n");

			System.out.println("Qual seu nome, guerreiro?");
			nome = leitor.next();

			System.out.println("\nMuito bem " + nome + "! Você está pronto para recuperar o agilidium? Responda SIM ou NÃO.");
			decisao = leitor.next();

			while (!decisao.equalsIgnoreCase("SIM") & !decisao.equalsIgnoreCase("Não")) {
				System.out.println(
						"\nEu lá sei o que é " + "'" + decisao + "'" + "! Vamos tentar de novo.\n\nVocê está pronto? Responda SIM ou NÃO.");
				System.out.println("1.SIM");
				System.out.println("2.NÃO");
				decisao = leitor.next();
			}

			if (decisao.equalsIgnoreCase("SIM")) {
				System.out.println(
						"\nÓtimo! Há dois caminhos possíveis para o castelo de disperdiçor: Passando pelo vale da cascata ou pelo vale de sprintolandia. E então, por qual vale você vai? CASCATA ou SPRINTOLANDIA?");
				caminho = leitor.next();

				while (!caminho.equalsIgnoreCase("cascata") & !caminho.equalsIgnoreCase("sprintolandia")) {
					System.out.println(
							"\nVocê tem um sério problema com digitação né? Vamos tentar de novo.\nCASCATA ou SPRINTOLANDIA?");
					caminho = leitor.next();
				}

				while (!caminho.equalsIgnoreCase("sprintolandia")) {
					System.out.println(
							"\nPense bem! O vale da cascata é mais demorado, e não temos tempo a perder!\n\nE então, por qual vale você vai? CASCATA ou SPRINTOLANDIA?");
					caminho = leitor.next();
				}

				System.out.println(
						"\nSábia decisão! Os dias se passaram e você está de cara a cara com o Lenthor. Escolha uma arma para enfrenta-lo e recuperar o agilidium.\n\nMas pense bem, apenas uma dessas armas será efetiva. Suas opções são: MVPLIDIUM e REUNIUMDARIUM. Qual você escolhe?");
				arma = leitor.next();

				while (!arma.equalsIgnoreCase("MVPLIDIUM") & !arma.equalsIgnoreCase("REUNIUMDARIUM")) {
					System.out.println(
							"\nSe for pra digitar qualquer coisa, a gente pode ficar aqui o dia inteiro!\nVamos tentar de novo.  MVPLIDIUM e REUNIUMDARIUM?");
					arma = leitor.next();
				}

				if (arma.equalsIgnoreCase("MVPLIDIUM")) {
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
			if (reiniciar.equalsIgnoreCase("SIM")) {
				System.out.println("Gostaria de jogar novamente?");
				System.out.println("1.Sim");
				System.out.println("2.Não");
				reiniciar = leitor.next();
				System.out.println(
						"<------------------------------------------------------------------------------------------->\n\n");

				while (!reiniciar.equalsIgnoreCase("SIM") & !reiniciar.equalsIgnoreCase("não")) {
					System.out.println("Não sei o que é " + "'" + reiniciar + "'" +". Vamos tentar novamente");
					System.out.println("Gostaria de jogar novamente?");
					System.out.println("1.Sim");
					System.out.println("2.Não");
					reiniciar = leitor.next();
				}

			}
		}

		System.out.println("Até mais!");

		leitor.close();

	}

}
