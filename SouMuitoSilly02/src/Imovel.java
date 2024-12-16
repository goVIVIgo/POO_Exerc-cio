public abstract class Imovel {
    protected double areaQ;
    protected double valor;
    protected int quartos;

    public Imovel(double areaQ, double valor, int quartos) {
        this.areaQ = areaQ;
        this.valor = valor;
        this.quartos = quartos;
    }

    public double getAreaQ() {
        return areaQ;
    }
    public void setAreaQ(double areaQ) {
        this.areaQ = areaQ;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuartos() {
        return quartos;
    }
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    abstract double precoImovel();

    String vetor[];

}

