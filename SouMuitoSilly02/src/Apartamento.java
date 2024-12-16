public class Apartamento extends Imovel{

    protected boolean piscina;

    public Apartamento(double areaQ, double valor, int quartos, boolean piscina) {
        super(areaQ, valor, quartos);
        this.piscina = piscina;
    }

    public boolean isPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public double precoImovel(){
       if(areaQ > 300 && piscina){
           return 1.5 * valor;
       } else {
           return 1.1 * valor;
       }
    }

    public String toString(){
        return piscina + " " + areaQ + " " + precoImovel();
    }
}
