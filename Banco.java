
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados inseridos pelo usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declarando variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitando dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a linha pendente

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        // Formando a mensagem final com concatenação de strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                          agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibindo a mensagem final
        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();
    }
}