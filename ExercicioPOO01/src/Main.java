//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Conta c = new Conta("01","0123",10000.50);
        c.sacar(2000.10,"0222");
        c.depositar(3000,"0123");*/

//        Pessoa p = new Pessoa("a","01","022");
//        System.out.println(p);
//
//        Fornecedor f = new Fornecedor("b","02","033",300.80,90000);
//        System.out.println(f);
//
//        Empregado e = new Empregado("c","03","044",1,100020,2000);
//        System.out.println(e);
//
//        Operario o = new Operario("d","04","055",2,10000,4000,60,100);
//        System.out.println(o);

//        Funcionario f = new Funcionario("GABRIEL STALAPIKA","06666666666666666666624",1000);
//        f.bonusSalario();
//
//        System.out.println(f);
//
//        Presidente p = new Presidente("DJ JUNINHO PORTUGAL","024696966622",100000,30);
//        p.bonusSalario();
//
//        System.out.println(p);

        Estudante e = new Estudante("a",2004,"cdp");

        System.out.println(e + " "+ e.valorCopia(2000));

        Bolsista b = new Bolsista("b",2004,"ads",3000);
        b.quantidadeCopias();
        System.out.println(b + " "+ b.valorCopia(2000) );




    }
}