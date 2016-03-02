import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by toni on 27/01/16.
 */
public class Main {
    public static void main(String[]args){
        Ordinador o = new Ordinador("MSI", 17, 1300, "Intel Core i7 5700 HQ", 16);
        //o.marca = "MSI";
        //o.polzades = 17;
        //o.preu = 1300;
        //o.processador = "Intel Core i7 5700 HQ";
        //o.ram = 16;
        o.imprimeix();
    }
}

class Ordinador {
    int preu;
    int polzades;
    String processador;
    int ram;
    String marca;

    //Constructor 1
    Ordinador(String m, int plz, int pr, String proc, int ra) {
        marca = m;
        polzades = plz;
        preu = pr;
        processador = proc;
        ram = ra;
    }

    //Constructor 2
    Ordinador(String m, int plz) {
        marca = m;
        polzades = plz;
        preu = -1;
        processador = "Desconegut";
        ram = -1;
    }

    void imprimeix() {
        System.out.printf("Marca: %s\n", marca);
        System.out.printf("Polzades: %s\n", polzades);
        System.out.printf("Preu: %s\n", preu);
        System.out.printf("Processador: %s\n", processador);
        System.out.printf("RAM: %s\n", ram);

    }

    void devalua() {

    }
}