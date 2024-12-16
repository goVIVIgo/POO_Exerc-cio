public class Presidente extends Funcionario {

    protected double acoesP;

    public Presidente(String nome, String cpf, double salario, double acoesP) {
        super(nome, cpf, salario);
        this.acoesP = acoesP;
    }

    public double getAcoesP() {
        return acoesP;
    }
    public void setAcoesP(double acoesP) {
        this.acoesP = acoesP;
    }

    public double bonusSalario() {
        return salario * 0.10;
    }

    public String toString() {
        return super.toString() + " " + acoesP;
    }
}
