package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar e ler o nome do cliente
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine().trim();

        // Solicitar e ler a agência
        System.out.print("Digite a sua agência: ");
        String agencia = scanner.nextLine().trim();

        // Solicitar e ler o número da conta
        System.out.print("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        // Solicitar e ler o saldo
        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

        System.out.println(mensagem);
    }
}
