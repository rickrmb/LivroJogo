import java.util.Scanner;

public class MeuLivroNumero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);

		String nome;
		int decisao, caminho, arma;

		System.out.println("AGILE ADVENTURES");
		System.out.println("Um jogo de Ricardo Rezende");
		System.out.println(
				"<------------------------------------------------------------------------------------------->\n\n");

		System.out.println(
				"O agilidium foi roubado das terras ageis e foi levado pelo vil�o Lenthor para o castelo de disperdi�or.\nSua miss�o � resgatar o agilidium, antes que as terras ageis virem um caos!\n\n");

		System.out.println("Qual seu nome, guerreiro?");
		nome = leitor.next();

		System.out.println("Muito bem " + nome + "! Voc� est� pronto para recuperar o agilidium?");
		System.out.println("1.SIM");
		System.out.println("2.N�O");
		decisao = leitor.nextInt();

		while (decisao != 1 & decisao != 2) {
			System.out.println(
					"Eu l� sei o que � " + "'" + decisao + "'" + "! Vamos tentar de novo.\n\nVoc� est� pronto?");
			System.out.println("1.SIM");
			System.out.println("2.N�O");
			decisao = leitor.nextInt();
		}

		if (decisao == 1) {
			System.out.println(
					"�timo! H� dois caminhos poss�veis para o castelo de disperdi�or: Passando pelo vale da cascata ou pelo vale de sprintolandia. E ent�o, por qual caminho voc� vai");
			System.out.println("1.Vale da CASCATA");
			System.out.println("2.Vale de SPRINTOLANDIA");
			caminho = leitor.nextInt();

			while (caminho != 1 & caminho != 2) {
				System.out.println(
						"Voc� tem um s�rio problema com digita��o n�? Vamos tentar de novo.\nCASCATA ou SPRINTOLANDIA?");
				System.out.println("1.CASCATA");
				System.out.println("2.SPRINTOLANDIA");
				caminho = leitor.nextInt();
			}

			while (caminho != 2) {
				System.out.println(
						"Pense bem! O vale da cascata � mais demorado, e n�o temos tempo a perder!\n\nE ent�o, por qual caminho voc� vai?");
				System.out.println("1.CASCATA");
				System.out.println("2.SPRINTOLANDIA");
				caminho = leitor.nextInt();
			}

			System.out.println(
					"S�bia decis�o! Os dias se passaram e voc� est� de cara a cara com o Lenthor. Escolha uma arma para enfrenta-lo e recuperar o agilidium.\nMas pense bem, apenas uma dessas armas ser� efetiva. Suas op��es s�o: MVPLIDIUM e REUNIUMDARIUM. Qual voc� escolhe?");
			System.out.println("1.MVPLIDIUM");
			System.out.println("2.REUNIUNDARIUM");
			arma = leitor.nextInt();

			while (arma != 1 & arma != 2) {
				System.out.println(
						"Se for pra digitar qualquer coisa, a gente pode ficar aqui o dia inteiro!\nVamos tentar de novo.");
				System.out.println("1.MVPLIDIUM");
				System.out.println("2.REUNIUNDARIUM");
				arma = leitor.nextInt();
			}

			if (arma == 1) {
				System.out.println(
						"E o MVPLIDIUM provou que o Lenthor n�o � de nada rapidamente! As terras �geis podem recuperar sua paz agora, parab�ns "
								+ nome + "!");
			} else {
				System.out.println("Reuniumdarium o %@#$%&! Voc� est� fora... Game Over!");
			}

		} else {

			System.out.println("N�o temos tempo a perder! Voc� est� fora... Game Over!");
		}

		{

		}

		leitor.close();

	}

}
