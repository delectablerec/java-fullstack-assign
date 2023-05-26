// implementa map
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class csfls_2 {
    public static void main(String[] args) throws InterruptedException {
        
        Map<Integer, String> options = new LinkedHashMap<>();
        options.put(1, "sasso");
        options.put(2, "carta");
        options.put(3, "forbici");
        options.put(4, "lucertola");
        options.put(5, "spok");

        System.out.println("(1) sasso, (2) carta, (3) forbici, (4) lucertola, (5) spok");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero della tua mossa:");
        int userMove = scanner.nextInt();

        int computerMove = random.nextInt(5) + 1;

        while (true)
        {
                if (userMove >=6)
                {
                    System.out.println("Hai scelto un numero non consentito");
                break;
                }

                System.out.println("Hai scelto: " + options.get(userMove));
                System.out.println("Il computer ha scelto: " + options.get(computerMove));

            if (userMove == computerMove)
            {
                System.out.println("Pareggio!");
            } else if (
                (userMove == 1 && (computerMove == 3 || computerMove == 4)) ||
                (userMove == 2 && (computerMove == 1 || computerMove == 5)) ||
                (userMove == 3 && (computerMove == 2 || computerMove == 4)) ||
                (userMove == 4 && (computerMove == 2 || computerMove == 5)) ||
                (userMove == 5 && (computerMove == 1 || computerMove == 3))
            )
            {
                System.out.println("Hai vinto!");
            } else
            {
                System.out.println("Hai perso!");
            }
            break;
        }

        scanner.close();
    }
}