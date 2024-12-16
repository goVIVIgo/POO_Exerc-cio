import java.util.Scanner;

public class Invoice {
    private String identificador;
    private int quantidade;
    private double valor;

    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Invoice(){
        Scanner silly = new Scanner(System.in);
        System.out.print("digite o identificador: ");
        this.identificador = silly.nextLine();
        System.out.print("digite o quantidade: ");
        this.quantidade = silly.nextInt();

        if (this.quantidade <= 0){
            System.out.print("quantidade: 0");
        } else{
            System.out.println("quantidade: " + this.quantidade);
        }

        System.out.print("digite o valor: ");
        this.valor = silly.nextDouble();

        if (this.valor <= 0){
            System.out.println("valor: 0.0");
        } else{
            System.out.println("valor: " + this.valor);
        }
    }

    public void fatura(){
        System.out.println("identificador: " +this.identificador);
        System.out.println("Faturamento: " + (this.quantidade * this.valor));
    }

}
