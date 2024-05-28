import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite número da agência: ");
        String numeroAgencia = scan.nextLine();

        System.out.println("Digite número da conta: ");
        int numeroConta = Integer.parseInt(scan.next());

        System.out.println("Digite o saldo da conta: ");
        double saldoConta = Double.parseDouble(scan.next());

        System.out.println("Olá ".concat(nome +", obrigado por criar uma conta em nosso banco, sua agência é ").concat(numeroAgencia +", conta ").concat(numeroConta+" e seu saldo ").concat(saldoConta +" já está disponível para saque"));
        
        scan.close();
    }
        
    
}
