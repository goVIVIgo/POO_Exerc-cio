import java.security.AccessControlContext;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Cachorro c = new Cachorro("titi",12,false);
        c.emitirSom();
        System.out.println();

        Preguiça p =  new Preguiça("vivi",19,false);
        p.emitirSom();

        Animal a = new Cachorro("brioche",1,true);
        a.emitirSom();

        Animal b = new Preguiça("momozizi",20,true);
        b.emitirSom();*/

        Scanner silly =  new Scanner(System.in);
        int v = silly.nextInt();

        Animal d[] = new Animal[v];

        for(int i=0;i<v;i++){
            d[i] = new Cachorro("silly",1,true);
            d[i] = new Preguiça("filho",2,true);

            int somaIdade = 0;

            for(int j=0;j<v;j++){
               somaIdade = d[j].idade;
            }


            double mediaIdade =  (double)somaIdade / 2;

            System.out.println("a media das somas das idades eh: "+ mediaIdade);

        }







    }
}