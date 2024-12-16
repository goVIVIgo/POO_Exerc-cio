public class Preguiça extends Animal {

    boolean escala;

    public Preguiça(String nome, int idade, boolean escala) {
        super(nome, idade);
        this.escala = escala;
    }

    @Override
    public String emitirSom(){
        return "eu nn aguento mais poo";
    }
}
