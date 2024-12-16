import java.sql.SQLOutput;
import java.util.Scanner;

public class Conta {
    String cpf;
    short numBanco;
    float saldo;

    public float calculoBoni(){
        return saldo * 0.1F;
    }

    public void saque (float valorSaque){
        saldo -= valorSaque;
    }

    public void depositar (float valorDeposito){
        saldo += valorDeposito;
    }

    public Conta retornarValores(){
        Scanner silly = new Scanner(System.in);
        System.out.println("Digite o cpf do seu conta: ");
        cpf = silly.nextLine();
        System.out.println("Digite o numero do banco: ");
        numBanco = silly.nextShort();
        System.out.println("Digite a quantidade de saldo do conta: ");
        saldo = silly.nextFloat();

        return this;
    }
}
