public class Estudante {
    protected String nome;
    protected int anoIngresso;
    protected String curso;

    public Estudante(String nome, int anoIngresso, String curso) {
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double valorCopia(int folhas){
        return folhas * 0.10;
    }

    public String toString() {
        return nome + " " + anoIngresso + " " + curso;
    }



}
