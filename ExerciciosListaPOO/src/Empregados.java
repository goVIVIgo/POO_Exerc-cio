import java.util.Scanner;

public class Empregados {
    private String nome;
    private String sobrenome;
    private double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregados(){
        Scanner silly = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = silly.nextLine();
        System.out.print("Sobrenome: ");
        this.sobrenome = silly.nextLine();
        System.out.print("Salario: ");
        this.salario = silly.nextInt();

        if (this.salario >= 0){
            System.out.println ("Salario anual: " +this.salario * 12);
        } else {
            System.out.println("Salario engual a: 0 ");
        }

    }

   public void forneceAumento(){
        System.out.println("Salario: " + this.salario * 1.1);
    }
}
