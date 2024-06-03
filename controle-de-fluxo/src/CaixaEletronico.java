/* ESTRUTURAS CONDICIONAIS
 * A estrutura condicional, possibilita a escolha de um grupo de ações e comprotamentos a serem executadas, quando determinadas condições são ou não satisfeitas. A estrutura condicional pode ser SIMPLES ou COMPOSTA
 */

/*CONDICIONAIS SIMPLES
 * Quando ocorre uma validação de execução de fluxo, somente quando a condição for positiva, consideramos uma estrutura SIMPLES, exemplo:
 */

public class CaixaEletronico {
    public static void main (String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;
       
        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;
        System.out.println(saldo);
    }
}
