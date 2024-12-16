public class Casa extends Imovel{

    protected boolean quintal;

    public Casa(double areaQ, double valor, int quartos, boolean quintal) {
        super(areaQ, valor, quartos);
        this.quintal = quintal;
    }

    public boolean getQuintal() {
        return quintal;
    }
    public void setQuintal(boolean quintal) {
        this.quintal = quintal;
    }

    @Override
    public double precoImovel(){
        if (quartos > 4 && quintal){
            return 1.3 * valor;
        } else {
            return 1.15 * valor;
        }
    }

    public String toString(){
        return quintal + " " + quartos + " " + precoImovel();
    }

}
