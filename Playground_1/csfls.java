// implementa animazioni
import java.util.Random;
import java.util.Scanner;

public class csfls {
    public static void main(String[] args) throws InterruptedException {
        String border = "===================================";
        System.out.println(border);
        String[] options = {"sasso", "carta", "forbici", "lucertola", "spok" };
        String[] spiega = {"Sasso batte forbici e schiaccia lucertola", "Carta batte sasso e taglia Spock", "Forbici batte carta e decapita lucertola", "Lucertola mangia carta e avvelena Spock", "Spock rompe forbici e distruggi sasso" };
        
        for (String opzioni : spiega)
            {
            printAnimated(opzioni);
            }
            System.out.println(border);
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserisci la tua mossa (sasso, carta, forbici, lucertola, spok):");
            String utenteMossa = scanner.nextLine().toLowerCase();

            Thread.sleep(500); // Aggiungi un ritardo di 1 secondo
            System.out.println("3...");
            Thread.sleep(500); // Aggiungi un ritardo di 1 secondo
            System.out.println("2...");
            Thread.sleep(500); // Aggiungi un ritardo di 1 secondo
            System.out.println("1...");
            Thread.sleep(500); // Aggiungi un ritardo di 1 secondo

            String computerMossa = options[random.nextInt(options.length)];

            // Utilizzare le sequenze di escape ANSI per cambiare il colore del testo
            System.out.println("Hai scelto: \033[1;36m" + utenteMossa + "\033[0m");
            System.out.println("Il computer ha scelto: \033[1;31m" + computerMossa + "\033[0m");

            if (utenteMossa.equals(computerMossa))
            {
                System.out.println("Pareggio!");
            }
            else if ((utenteMossa.equals("sasso") && computerMossa.equals("forbici")) ||
                (utenteMossa.equals("carta") && computerMossa.equals("sasso")) ||
                (utenteMossa.equals("forbici") && computerMossa.equals("carta")) ||
                (utenteMossa.equals("lucertola") && computerMossa.equals("spok")) ||
                (utenteMossa.equals("spok") && computerMossa.equals("forbici")) ||
                (utenteMossa.equals("spok") && computerMossa.equals("sasso")) ||
                (utenteMossa.equals("lucertola") && computerMossa.equals("carta")) ||
                (utenteMossa.equals("forbici") && computerMossa.equals("lucertola")) ||
                (utenteMossa.equals("carta") && computerMossa.equals("spok")) ||
                (utenteMossa.equals("sasso") && computerMossa.equals("lucertola")))
            {
            System.out.println("\033[1;32mHai vinto!\033[0m");
            }
            else
            {
            System.out.println("\033[1;31mHai perso!\033[0m");
        
        }
        
        scanner.close();
    }
    
    private static void printAnimated(String action) throws InterruptedException {
        for (char c : action.toCharArray()) {
            System.out.print(c);
            Thread.sleep(20); // Ritardo di 200 millisecondi tra ogni carattere
        }
        System.out.println(); // Stampa una nuova riga alla fine di ogni azione
    }
}