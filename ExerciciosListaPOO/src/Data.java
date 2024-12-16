import java.util.Scanner;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data retornarData(){
        Scanner silly = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        setDia(silly.nextInt());
        System.out.println("Digite o mes: ");
        setMes(silly.nextInt());
        System.out.println("Digite o ano: ");
        setAno(silly.nextInt());

        return this;
    }

    public void apresentarData(){
        Integer.toString(this.dia);
        Integer.toString(this.mes);
        Integer.toString(this.ano);

        String data = Integer.toString(this.dia) +"/"+ Integer.toString(this.mes) +"/"+ Integer.toString(this.ano);

        System.out.println(data);
    }



}
