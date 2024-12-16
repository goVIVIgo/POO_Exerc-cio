public class Fornecedor extends Pessoa{

    protected double valorDivida;
    protected double valorCredito;

    public Fornecedor(String nome, String endereco, String telefone, double valorDivida, double valorCredito) {
        super(nome, endereco, telefone);
        this.valorDivida = valorDivida;
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double valorSaldo(){
        return valorCredito - valorDivida;
    }

    public String toString(){
        return super.toString() + " " + valorDivida + " " + valorCredito + " " + valorSaldo();
    }
}
