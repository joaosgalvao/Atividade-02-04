import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;

        System.out.println("Por favor, digite o seu nome!");
        NomeCliente = input.nextLine();

        System.out.println("Por favor, digite o número da sua conta!");
        Numero = input.nextInt();

        System.out.println("Por favor, digite a sua agência!");
        Agencia = input.next();

        System.out.println("Por favor, digite o seu saldo!");
        Saldo = input.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia + ", conta " + Numero + " e seu saldo (" + Saldo + ") já está disponível para saque.");

        input.close();
    }
}