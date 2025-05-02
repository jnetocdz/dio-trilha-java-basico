import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: CONHECER E IMPORTAR A CLASSE SCANNER
        // EXIBIR AS MENSAGENS PARA NOSSO USARIO
        // OBTER PELO SCANNER OS VALORES DIGITADOS NO TERMINAR
        // EXIBIR A MENSAGEM CRIADA
        
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o número de sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("digite o número de sua agencia");
        String agencia = scanner.next();

        System.out.println("digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("digite o seu saldo");
        double saldo = scanner.nextDouble();



        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
