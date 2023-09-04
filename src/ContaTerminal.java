import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número de sua agência");
        int number = sc.nextInt();

        System.out.println("Digite agora o número da conta");
        String agencyNumber = sc.next();

        System.out.println("Por favor, digite seu nome completo");
        sc.nextLine();
        String clientName = sc.nextLine();


        System.out.println("Digite o valor que você possui em conta");
        double balance = sc.nextDouble();

        System.out.println("Olá " + clientName + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + " ,conta " + number + " e seu saldo " + balance + " já está disponível para saque.");

          
        sc.close();
    }
}
