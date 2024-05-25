import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner dadoScanner = new Scanner (System.in);
        String nome;
        System.out.print("Digite o seu nome:");
        nome = dadoScanner.nextLine();
        
        int numero;
        System.out.println("Digite seu número de usuário:");
        numero = dadoScanner.nextInt();

        int agencia;
        System.out.println("Digite o número da sua agência:");
        agencia = dadoScanner.nextInt();

        dadoScanner.close();

        double saldo = 237.48;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}