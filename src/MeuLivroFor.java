import java.io.IOException;
import java.util.Scanner;

public class MeuLivroFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);

		String nome;
		String decisao, caminho, arma, reiniciar = "SIM";
		int i = 3;

		System.out.println("AGILE ADVENTURES");
		System.out.println("Um jogo de Ricardo Rezende");
		System.out.println(
				"<------------------------------------------------------------------------------------------->");
		//if(i>0 ^ i<0) {//nao consigo implementar regra de perda de vidas
			//for (i = 3; i > 1; i--) {
		
				while (reiniciar.equalsIgnoreCase("SIM")) {
					i=2;
					System.out.println(
							"LEVEL 1   VIDAS = 3\n\n\nO agilidium foi roubado das terras ageis e foi levado pelo vil�o Lenthor para o castelo de disperdi�or.\nSua miss�o � resgatar o agilidium, antes que as terras ageis virem um caos!\n\n");

					System.out.println("Qual seu nome, guerreiro?");
					nome = leitor.next();

					System.out.println("\nMuito bem " + nome
							+ "! Voc� est� pronto para recuperar o agilidium? Responda SIM ou N�O.");
					decisao = leitor.next();

					while (!decisao.equalsIgnoreCase("SIM") & !decisao.equalsIgnoreCase("N�o") & i!=0) {
						System.out.println("\nEu l� sei o que � " + "'" + decisao + "'"
								+ "! Voc� perdeu uma vida, e agora s� tem mais " + i
								+ ".\n\nVoc� est� pronto? Responda SIM ou N�O.");
						System.out.println("1.SIM");
						System.out.println("2.N�O");
						decisao = leitor.next();
						i--;

					}

					if (decisao.equalsIgnoreCase("SIM")) {
						System.out.println(
								"\n�timo! H� dois caminhos poss�veis para o castelo de disperdi�or: Passando pelo vale da cascata ou pelo vale de sprintolandia. E ent�o, por qual vale voc� vai? CASCATA ou SPRINTOLANDIA?");
						caminho = leitor.next();

						while (!caminho.equalsIgnoreCase("cascata") & !caminho.equalsIgnoreCase("sprintolandia") & i!=0) {
							System.out.println(
									"\nVoc� tem um s�rio problema com digita��o n�? Voc� perdeu uma vida, e agora s� tem mais " + i + " vida! Vamos tentar de novo.\nCASCATA ou SPRINTOLANDIA?");
							caminho = leitor.next();
							i--;
						}

						while (!caminho.equalsIgnoreCase("sprintolandia")) {
							System.out.println(
									"\nPense bem! O vale da cascata � mais demorado, e n�o temos tempo a perder!\n\nE ent�o, por qual vale voc� vai? CASCATA ou SPRINTOLANDIA?");
							caminho = leitor.next();
						}

						System.out.println(
								"\nS�bia decis�o! Os dias se passaram e voc� est� de cara a cara com o Lenthor. Escolha uma arma para enfrenta-lo e recuperar o agilidium.\n\nMas pense bem, apenas uma dessas armas ser� efetiva. Suas op��es s�o: MVPLIDIUM e REUNIUMDARIUM. Qual voc� escolhe?");
						arma = leitor.next();

						while (!arma.equalsIgnoreCase("MVPLIDIUM") & !arma.equalsIgnoreCase("REUNIUMDARIUM")) {
							System.out.println(
									"\nSe for pra digitar qualquer coisa, a gente pode ficar aqui o dia inteiro!\nVamos tentar de novo.  MVPLIDIUM e REUNIUMDARIUM?");
							arma = leitor.next();
						}

						if (arma.equalsIgnoreCase("MVPLIDIUM")) {
							System.out.println(
									"\nE o MVPLIDIUM provou que o Lenthor n�o � de nada rapidamente! As terras �geis podem recuperar sua paz agora, parab�ns "
											+ nome + "!\n\n");
						} else {
							System.out.println(
									"\nReuniumdarium te deixou devagar e o Lenthor fugiu! Voc� est� fora... Game Over!");
						}

					} else {
						if (i == 0) {
							System.out.println("\nN�o temos tempo a perder! Voc� est� fora... Game Over!");
						}
					}

					{

					}
					System.out.println(
							"<------------------------------------------------------------------------------------------->\n\n");
					if (reiniciar.equalsIgnoreCase("SIM")) {
						System.out.println("Gostaria de jogar novamente?");
						System.out.println("1.Sim");
						System.out.println("2.N�o");
						reiniciar = leitor.next();
						System.out.println(
								"<------------------------------------------------------------------------------------------->\n\n");

						while (!reiniciar.equalsIgnoreCase("SIM") & !reiniciar.equalsIgnoreCase("n�o")) {
							System.out.println("N�o sei o que � " + "'" + reiniciar + "'" + ". Vamos tentar novamente");
							System.out.println("Gostaria de jogar novamente?");
							System.out.println("1.Sim");
							System.out.println("2.N�o");
							reiniciar = leitor.next();
						}

					}
				}

			


		System.out.println("At� mais!");

		leitor.close();

	}

}
