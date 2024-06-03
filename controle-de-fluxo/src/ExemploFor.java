/*FOR
 * O comando FOR ("para") permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando FOR recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação;
 * A estrutura de sintaxe do controle de repetição FOR é exibida abaixo?
    //Estrutura do controle de fluxo FOR
    for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {
        //comando que será executado até que a expressão de validação torne-se falsa
    }

 */

public class ExemploFor {
    /*public static void main (String [] args){
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos ++){
            System.out.println (carneirinhos + " - Carneirinho(s)");
        }
    }
} */

    public static void main (String [] args){
        for (int amigos = 0; amigos <=10; amigos ++){
            if (amigos == 1) {
                System.out.println("Você possui " + amigos + " Amigo");
            }else
            System.out.println ("Você pussui " + amigos + " Amigos");
        }
    }
}