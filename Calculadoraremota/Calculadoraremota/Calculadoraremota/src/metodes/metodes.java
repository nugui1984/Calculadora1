package metodes;

import java.util.Scanner;

public class metodes {

    private int numero1;
    private int numero2;
    private String opcio;
    private double resultat;

    Scanner entrada = new Scanner(System.in);

    public metodes() {
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

    public void escolliroperacio() {
        boolean comprobar = false;
        System.out.println("\n Introdueix el primer numero. ");
        this.numero1 = entrada.nextInt();
                    System.out.println("\n Operacio? (Indica el signe) \n + = sumar \n - = restar \n"
                    + " x = multiplicar \n / = dividir \n * = elevar primer num al segon num."
                    + "\n % = residu");
        while (comprobar != true) {
            this.opcio = entrada.nextLine();
            if (opcio.equals("+") || opcio.equals("-") || opcio.equals("x")
                    || opcio.equals("X") || opcio.equals("/") || opcio.equals("%")
                    || opcio.equals("*")) {
                comprobar = true;
            } else {
                comprobar = false;
            }
        } 
        
        System.out.println("\n Introdueix el segon numero.");
        this.numero2 = entrada.nextInt();
        
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
                if(this.numero2 == 0) {
                    do {
                        System.err.println(" Al denominador hi ha un zero \n"
                                + "per a  evitar errors coloca un altre valor.");
                        this.numero2=entrada.nextInt();
                        this.setNumero2(numero2);
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
                        this.numero2=entrada.nextInt();
                        this.setNumero2(numero2); 
                    } while (!entrada.hasNextInt());
                    resultat = this.numero1 % this.numero2;
                    break;
                }
        }
         System.out.println("(" + this.numero1 + ") " + opcio + " (" + this.numero2 + ")" + " = " + resultat);
         
    }

 
    
}
