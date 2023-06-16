import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Loop infinite times asking the user to input a number between 1 and 10
        // Print the name of the number (e.g. 5 --> five)
        // If the user input a number lower than 1 or greater than 10, print Cannot give you the name
        Scanner nomeScanner = new Scanner(System.in);
        // for (int i = 0; i < 11; i++)

        while (true) {
            System.out.println("Metti un numero da 1 a 10");
            int numeroRandom = nomeScanner.nextInt();
            switch (numeroRandom) {
                case 1 -> System.out.println("uno");
                case 2 -> System.out.println("due");
                case 3 -> System.out.println("tre");
                case 4 -> System.out.println("quattro");
                case 5 -> System.out.println("cinque");
                case 6 -> System.out.println("sei");
                case 7 -> System.out.println("sette");
                case 8 -> System.out.println("otto");
                case 9 -> System.out.println("nove");
                case 10 -> System.out.println("dieci");
                default -> System.out.println("Cannot give you the number");
            }

                if (numeroRandom < 1 && numeroRandom > 10) {
                    System.out.println("Cannot give you the number");


            }
        }
    }
}


// Il codice non mi funziona, lo carico ugualmente sbagliato e se possibile vorrei avere una spiegazione su
// come farlo, grazie mille !
// Tra l'altro ho usato lo scanner, ma non ho idea di cosa sia, perchè è una soluzione che ho trovato online
// per inserire l'input dell'utente.