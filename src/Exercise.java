import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        // Loop infinite times asking the user to input a number between 1 and 10
        // Print the name of the number (e.g. 5 --> five)
        // If the user input a number lower than 1 or greater than 10, print Cannot give you the name
        for (int i = 0; i < 11; i++)

            switch (i) {
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


// Ho quindi creato un ciclo for i, creando un loop che parte da 0 fino ad arrivare a 10, facendo stampare
// tutti i numeri in lettere, questo è utilizzando un ciclo for, altrimenti se si dovesse svolgere solo tramite l'input
// dato dall'utente, l'esercizio sarebbe il seguente, ad esempio con un input non valido:


        int userInputNumber = 12;

        switch (userInputNumber) {
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

    }
}
