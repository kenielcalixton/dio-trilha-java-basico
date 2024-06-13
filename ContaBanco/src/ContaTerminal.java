import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para nosso usuario
        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = terminal.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = terminal.nextInt();
        System.out.println("Por favor, digite a Agência !");
        String agencia = terminal.next();
        System.out.println("Por favor, digite seu saldo!");
        double saldo  = terminal.nextDouble();
        //Obter pela class scanner os valores digitados no terminal
        
        //Exibir a mensagem conta criada
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroAgencia +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
