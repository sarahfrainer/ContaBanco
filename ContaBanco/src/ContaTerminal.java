import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta");
        int numConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome completo");
        scanner.nextLine();
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu saldo");
        double saldo = scanner.nextDouble();

        scanner.close();

        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta " + numConta + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
