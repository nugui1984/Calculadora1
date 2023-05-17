package metodes;

import java.util.Scanner;

public class metodes {

    private int numero1;
    private int numero2;
    private String opcio;
    private double resultat;

    Scanner entrada = new Scanner(System.in);

    public metodes(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void escolliroperacio(int numero1, int numero2) {
        boolean comprobar = false;
        System.out.println("\n Introdueix el primer numero. ");
        this.numero1 = entrada.nextInt();
        do {
            System.out.println("\n Operació? (Indica el signe)");
            System.out.println("+ = sumar \n - = restar \n"
                    + " x = multiplicar \n / = dividir \n * = elevar primer num al segon num."
                    + "\n % = residu");
            this.opcio = entrada.nextLine();
            if (opcio.equals("+") || opcio.equals("-") || opcio.equals("x")
                    || opcio.equals("X") || opcio.equals("/") || opcio.equals("%")
                    || opcio.equals("*")) {
                comprobar = true;
            } else {
                comprobar = false;
            }
        } while (comprobar != true);
        System.out.println("\n Introdueix el segon numero.");
        this.numero2 = entrada.nextInt();

    }

    public void implementaroperacions() {

        switch (this.opcio) {
            case "+":
                resultat = this.numero1 + this.numero2;
                break;
            case "-":
                resultat = this.numero1 - this.numero2;
                break;
            case "x":
            case "X":
                resultat = this.numero1 * this.numero2;
                break;
            case "/":
                while (this.numero2 == 0) {
                    do {
                        System.err.println(" Al denominador hi ha un zero \n"
                                + "per a  evitar errors coloca un altre valor.");
                        this.numero2 = entrada.nextInt();
                    } while (!entrada.hasNextInt());
                }
                resultat = this.numero1 / this.numero2;
                break;
            case "*":
                resultat = Math.pow(this.numero1, this.numero2);
                break;
            case "%":
                while (this.numero2 == 0) {
                    do {
                        System.err.println(" Al denominador hi ha un zero \n"
                                + "per a  evitar errors coloca un altre valor.");
                        this.numero2 = entrada.nextInt();
                    } while (!entrada.hasNextInt());
                    resultat = this.numero1 % this.numero2;
                    break;
                }
        }
    }

}
