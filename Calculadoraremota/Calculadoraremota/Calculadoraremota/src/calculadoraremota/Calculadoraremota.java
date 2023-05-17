package calculadoraremota;

import java.util.Scanner;
import metodes.metodes;

public class Calculadoraremota {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean finalitzar = false;
        String sortir;
        metodes m1 = new metodes();
        do {
            do {
                m1.escolliroperacio();

                System.out.println("\n Vols continuar operant? \n");
                System.out.println(" [s/n]");

                finalitzar = true;
                sortir = entrada.nextLine();

                switch (sortir) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, posa un valor vàlid. \n");
                        finalitzar = false;
                }
            } while (finalitzar != true);
        } while (sortir.equals("s") || sortir.equals("S"));
    }
}
