import java.io.IOException;
import java.util.Scanner;
/* Exemplo de adventure text, proposto aos alunos do m�dulo de
 * l�gica de programa��o da imers�o Java Xpert
 * */
public class SnarfAdventures {

	public static void main(String[] args) {
		
		String nome;
		String escolha;
		Scanner leitor = new Scanner(System.in);
		System.out.println("SNARF ADVENTURES");
		System.out.println("Um jogo de Andr� David");
		
		
		System.out.println("Seu objetivo � enfrentar os perigos para que voce consiga alimentar o FEROZ e TERR�VEL Snarf. Qual � seu nome, aventureiro?");
		nome = leitor.next();
		
		System.out.println("Voce est� pronto para come�ar? SIM ou N�O");
		escolha = leitor.next();
	
		if (escolha.equalsIgnoreCase("sim")) {
			//Aqui eu dou sequencia na hist�ria na parte do sim
			System.out.println("Voce est� em uma sala escura. N�o ve nada. Mas tem uma LANTERNA, uma GARRAFA e um BAIXO. Qual objeto deseja usar?");
			escolha = leitor.next();
			if(escolha.equalsIgnoreCase("lanterna")) {
				//Aqui o que acontece se ele escolher lanterna
				System.out.println("Ao acender a lanterna, voce viu um simbolo antigo");
				System.out.println("$$$$$$$$$$$$$$$$$L   .$$$$$$$$$$$$$$$u");
				System.out.println("$$$$$$$$$$$$$$$$$$N.@$$$$$$$$$$$$$$$$ *");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ '>.n=L");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RR$$$$ 'b\"  9");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$R#\"  .$$$$ @   .*");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$`   .e$$$$$$$P   e\"");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$R#    o$$$$$$$$P   @");
				System.out.println("$$$$$$$$$$$$$$$$$$$P\" .e> 4$\" '$$$$F  .F");
				System.out.println("$$$$$$$$$$$$$$$$$R  .$$$& '$   $$$$  .#>");
				System.out.println("$$$$$$$$$$$$$$$$$b.o$$$$$  $N  \"$$\" .\"'>");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$  $$N  \"` .$ '>");
				System.out.println("$$$$$$$$$$$$$$ \"$$$$$$$$R  $$$&    $$ '>");
				System.out.println("$$$$$$$$$$$$$$  E\"$$P`9$E  $$$$   8$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E  \"  9$F  $$$$k .$$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E     9$N  $$$$$$$$$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E     9$$.u$$$$$$$$$$ '>");
				System.out.println("$$$$$$$$$$$$$$ o\"     9$$$$$$$$$$$$$$ d");
				System.out.println("**************#       ***************\"");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
				
				System.out.println("Al�m do s�mbolo antigo, voc� encontrou tamb�m uma porta. Deseja investigar o SIMBOLO ou a PORTA?");
				escolha = leitor.next();
				
				if(escolha.equalsIgnoreCase("SIMBOLO")) {
					//O que acontece se ele escolher o s�mbolo
					System.out.println("Voc� decidiu investigar o s�mbolo... Music Television... O que � isso?");
					System.out.println(".");
					System.out.println("..");
					System.out.println("...");
					System.out.println("BUM! Enquanto voc� confabula, a parede explode! Quando a poeira baixa, Supla est� do outro lado em sua moto.");
					System.out.println("Infelizmente isso foi o suficiente para que Snarf fugisse com ele para viver grandes aventuras.");
					System.out.println("GAME OVER");
				}else if (escolha.equalsIgnoreCase("PORTA")) {
					//O que acontece se ele escolher porta
					System.out.println("Ao caminhar at� a porta voc� nota que as cordas do seu baixo come�am a vibrar... Alguma frequ�ncia as agita.");
					System.out.println("Voc� deseja tocar as mesmas cordas para encontrar a frequ�ncia certa?");
					System.out.println("SIM ou N�O");
					escolha = leitor.next();
					
					if(escolha.equalsIgnoreCase("SIM")) {
						System.out.println("EXCELENTE ideia! Ao tocar as notas L�, L�, L�, L�, R�, MI, a tranca se abre! Hey, Ho, Let's go!");
						System.out.println("Enquanto voc� decide se entra ou n�o pela porta, ouve um miado. Deseja VER o que est� acontecendo? SIM ou N�O");
						escolha = leitor.next();
						
						if(escolha.equalsIgnoreCase("SIM")) {
							//Caso ele escolha cruzar a porta
							System.out.println("Ao cruzar a porta voc� encontra ele, o pequeno Snarf, bochechando o saco de ra��o e esperando ansiosamente por voc�");
							System.out.println("Quando voc� coloca a ra��o, o pequeno felino rola de tanta alegria e te d� pequenas mordidas carinhosas na m�o");
							System.out.println("Esse � o maior pr�mio que algu�m pode receESPERE! TEM ALGO NO CH�O, AO LADO DO GATINHO!");
							System.out.println("Voc� verifica o que te chamou a aten��o e um pequeno brilho revela... UMA FORTUNA! Voc� agora � um rico tutor de gatos! Parab�ns, " + nome);
						}else {
							//Caso ele escolha n�o cruzar a porta
							System.out.println("Sua indecis�o foi seu fim... Enquanto voc� pensava, o miado foi se distanciando at� se tornar inaud�vel. GAME OVER");
						}
					}else {
						//Caso escolha n�o tocar o baixo
						System.out.println("Sua indecis�o foi seu fim... Enquanto voc� pensava, ouve um miado que foi se distanciando at� se tornar inaud�vel. GAME OVER");
					}
					
					
				}else {
					//O que acontece se ele escrever qualquer outra coisa
					System.out.println("O faminto Snarf n�o pode esperar a sua coragem surgir. Voce est� fora da jogada... GAME OVER");
				}


				
			}else {
				if(escolha.equalsIgnoreCase("garrafa")) {
					//Aqui o que acontece se ele escolher garrafa
					System.out.println("A sua garrafa parece vazia. O Snarf pode ter sede. Deseja encher a garrafa? SIM ou N�O");
					escolha = leitor.next();
					if(escolha.equalsIgnoreCase("sim")) {
						//Aqui o que acontece se ele escolher encher a garrafa
						System.out.println("O Snarf ouviu o barulho da �gua e veio at� voc�");
						System.out.println("Voc� usa a lanterna e v� a porta aberta, por onde o snarf saiu. L� est� um saco de ra��o!");
						System.out.println("Quando voc� coloca a ra��o, o pequeno felino rola de tanta alegria e te d� pequenas mordidas carinhosas na m�o");
						System.out.println("Esse � o maior pr�mio que algu�m pode receber, " + nome);
					}else {
						//Aqui o que acontece se ele n�o encher a garrafa
						System.out.println("Um aventureiro desitradado � um aventureiro em perigo, " + nome + "!\nInfelizmente suas pedras renais te lembraram disso e voc� est� fora da jogada! GAME OVER!");
					}
					
				}else {
					if(escolha.equalsIgnoreCase("baixo")) {
						//Aqui o que acontece se ele escolher baixo
						System.out.println("Voc� come�a a tocar e lembra da can��o favorita do seu gatinho. Infelizmente, a lembran�a n�o te motiva a seguir a aventura, e voc� acaba adormecendo. GAME OVER.");
					}else {
						System.out.println("Que pena. Voce se atrapalhou na hora de escolher e um aventureiro mais bem preparado j� conquistou o premio. GAME OVER");
					}
				}
			}
			
			
			
		}else {
			System.out.println("O faminto Snarf n�o pode esperar a sua coragem surgir. Voce est� fora da jogada... GAME OVER");
		}
		leitor.close();

	}

}