/*CONDICIONAIS COMPOSTAS
 * Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução, condicionado a uma regra de negócio. Este cenário é denominado ESTRUTURA CONDICIONAL COMPOSTA. Vejamos o exemplo abaixo
 //Tirar dos comentários para testar

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 8;
        
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else
         System.out.println("Reprovado");
     }
 }
*/

/*CONDICIONAIS ENCADEADAS
  * Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else). Poderemos ter uma terceira, quarta ou inúmeras condições.
  
  //Tirar dos comentários para testar.

    public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}
*/

/*CONDIÇÃO TERNÁRIA
 * Como vimos em operadores, podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima, para ilustar o poder deste recurso
 

 //Cenário 1
public class ResultadoEscolar {
    public static void main(String[] args) {
      int nota = 7;
      String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
      System.out.println(resultado);
    }
}


//Cenário 2
// Cenário 2
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
*/


