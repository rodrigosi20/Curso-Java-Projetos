import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		Double saldo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o número da Agência: ");
		numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Por favor, digite a Agência: ");
		agencia = sc.nextLine();
		
		
		System.out.println("Por favor, digite o nome do cliente: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		sc.close();
	}

}
