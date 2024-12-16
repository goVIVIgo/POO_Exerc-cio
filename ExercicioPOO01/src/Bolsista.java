public class Bolsista extends Estudante {

    protected double bolsa;

    public Bolsista(String nome,int anoIngresso, String curso, double bolsa) {
        super(nome,anoIngresso,curso);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public double valorCopia(int folhas){
        return folhas*0.07;
    }

    public double quantidadeCopias(){
        return bolsa/0.07;
    }

    public String toString(){
        return super.toString()+" "+bolsa+" "+ quantidadeCopias();
    }



}
