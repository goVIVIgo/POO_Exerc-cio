public class Empregado extends Pessoa{

    protected int codigoSetor;
    protected double salario;
    protected double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salario, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salario = salario;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salario - imposto;
    }

    public String toString() {
        return super.toString() + " " + codigoSetor + " " + salario + " " + imposto + " " + calcularSalario();
    }
}
