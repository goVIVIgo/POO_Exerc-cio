public class Conta implements Segurança {
    String cpf;
    String senha;
    double saldo;

    public Conta(String cpf, String senha, double saldo) {
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void sacar(double valor, String senha) {
        if (verificaSenha(senha)){
            saldo -= valor;
            System.out.println("valor do saque: " + valor + "valor atual da conta: " + saldo);
            mensagemSucesso();
        }else{
            mensagemErro();
        }
    }

    public void depositar(double valor, String senha) {
        if (verificaSenha(senha)){
            saldo += valor;
            System.out.println("valor do deposito: " + valor + " valor atual da conta: " + saldo);
            mensagemSucesso();
        } else{
            mensagemErro();
        }
    }

    @Override
    public boolean verificaSenha(String Senha){
        if(Senha.equalsIgnoreCase(this.senha)){
            return true;
        }
        return false;
    }

    @Override
    public void mensagemSucesso(){
        System.out.println("Sucesso!");
    }

    @Override
    public void mensagemErro() {
        System.out.println("Erro!");
    }
}
