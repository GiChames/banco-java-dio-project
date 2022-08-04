import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    Conta cc = new ContaCorrente();
    Conta cpoupanca = new ContaPoupanca();

    System.out.println("Digite o valo do deposito: ");
    double valor = scan.nextDouble();

    cc.depositar(valor);

    cc.transferir(10, cpoupanca);

    cc.imprimirExtrato();

    cpoupanca.imprimirExtrato();

    }
}
