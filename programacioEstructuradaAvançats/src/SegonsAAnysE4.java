import java.util.Scanner;

/**
 * Created by toni on 23/10/16.
 */
public class SegonsAAnysE4 {
    static Scanner s = new Scanner(System.in);
    // Declaram i inicialitzam les variables on guardarem els resultats que anirem obtenint
    static int minuts = 0, hores = 0, dies = 0, mesos = 0, anys= 0, residuAny = 0, residuMes = 0, residuDia = 0, residuHora = 0, residuMinut = 0;
    public static void main(String[] args) {
        entrada();
    }

    static void entrada() {
        System.out.println("Introdueix el número enter (en segons) que vols transformar: ");
        int temps = s.nextInt();
        calculaTemps(temps);
        System.out.println("La xifra introduïda correspon a " + anys + " any(s), " + mesos + " mes(os), " + hores + " hores, " + minuts + " minuts i " + residuMinut + " segons.");
    }

    static void calculaTemps(int temps) {

        // Declaram i assignam el valor a les constants amb què hem d'operar
        int valorAny = 31536000;
        int valorMes = valorAny / 12;
        int valorDia = valorAny / 365;
        int valorHora = valorAny / 8760;
        int valorMinut = valorAny / 525600;

        // Aquí obtindrem la quantitat d'anys i el residu necessari per calcular la resta de dades
        anys = temps / valorAny;
        residuAny = temps - (anys * valorAny);

        // Aquí obtenim els mesos i el seu residu
        mesos = residuAny / valorMes;
        residuMes = residuAny - (mesos * valorMes);

        // Aquí sabrem els dies, i el seu residu per calcular les hores
        dies = residuMes / valorDia;
        residuDia = residuMes - (dies * valorDia);

        // Aquí obtenim les hores i el residu en minuts
        hores = residuDia / valorHora;
        residuHora = residuDia - (hores * valorHora);

        // Aquí aconseguirem saber els minuts, i el residu obtingut seran els segons
        minuts = residuHora / valorMinut;
        residuMinut = residuHora - (minuts * valorMinut);
    }
}