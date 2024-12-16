import java.util.Scanner;

public class Comida {
    String tipo;
    Double preco;
    int numero;

    public Comida() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o tipo: ");
    this.tipo = sc.nextLine();
    System.out.println("Digite o valor: ");
    this.preco = sc.nextDouble();
    System.out.println("Digite o numero: ");
    this.numero = sc.nextInt();

    System.out.println("tipo: " + this.tipo);
    System.out.println("valor: " + this.preco);
    System.out.println("numero: " + this.numero);

    }
    
}
