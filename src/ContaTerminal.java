import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    System.out.println("Por favor, digite o número da agência: ");
    String agencia = sc.nextLine();

    System.out.println("Por favor, digite o número da sua conta: ");
    int numero = sc.nextInt();

    System.out.println("Agora digite seu nome: ");
    String nomeCliente = sc.nextLine();

    sc.nextLine();

    System.out.println("Por último, digite seu saldo: ");
    Double saldo = sc.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco. Sua agência é  " + agencia
        + ", sua conta é " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

    sc.close();

  }
}
