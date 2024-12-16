import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNascimento;
    private double altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {

    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pessoa imprimir() {
        Scanner silly = new Scanner(System.in);
        System.out.println("Nome: ");
        setNome(silly.nextLine());
        System.out.println("CPF: ");
        setCpf(silly.nextLine());
        System.out.println("Ano de Nascimento: ");
        setAnoNascimento(silly.nextInt());
        System.out.println("Altura: ");
        setAltura(silly.nextDouble());

        return this;
    }

    public void idade(){
        int anoNasci = getAnoNascimento();
        int anoAtt;
        Scanner silly = new Scanner(System.in);
        System.out.println("Ano atual: ");
        anoAtt = silly.nextInt();

        int idade = anoAtt - anoNasci;

        System.out.println("Idade: "+idade);
    }

}
