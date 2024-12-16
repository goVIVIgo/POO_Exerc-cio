public class Operario extends Empregado{

    protected double valorProd;
    protected double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salario, double imposto, double valorProd, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salario, imposto);
        this.valorProd = valorProd;
        this.comissao = comissao;
    }

    public double getValorProd() {
        return valorProd;
    }
    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularSalario(){
        return super.calcularSalario() + (valorProd * (comissao/100));
    }

    public String toString(){
        return super.toString() + " " + valorProd + " " + comissao;
    }
}
