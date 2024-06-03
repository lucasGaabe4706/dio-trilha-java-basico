/*DO WHILE
 * O laço DO/WHILE (na tradução para a lingua portuguesa "faça...enquanto"), assim como o laço while, considera que, enquanto uma determinada condição for válida, o bloco de código será executado. Entretanto, DO/WHILE testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez. 
 * A estrutura de sintaxe do controle de repetição 
do / while
 é exibida abaixo:

Copy
//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);
*/

// ExemploDoWhile.java

// ExemploDoWhile.java

import java.util.Random;
public class ExemploDoWhile {

	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}