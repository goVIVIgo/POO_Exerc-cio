public class Cachorro extends Animal{

    boolean corre;

    public Cachorro(String nome, int idade, boolean corre) {
        super(nome, idade);
        this.corre = corre;
    }

    @Override
    public String emitirSom(){
       return "auauauauauua";
    }
}
