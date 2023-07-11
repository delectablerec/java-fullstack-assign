import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hang {

    static String[] immagineImpiccato = {
            "  -----\n |     |\n |\n |",
            "  -----\n |     |\n |     O\n |",
            "  -----\n |     |\n |     O\n |     |",
            "  -----\n |     |\n |     O\n |    /|",
            "  -----\n |     |\n |     O\n |    /|\\",
            "  -----\n |     |\n |     O\n |    /|\\\n |    /",
            "  -----\n |     |\n |     O\n |    /|\\\n |    / \\"
    };

    static int MAX_tentativo = immagineImpiccato.length;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvenuto nel gioco dell'impiccato! Inserisci una parola:");
        String parola = sc.next();
        giocaImpiccato(parola);
        sc.close();
    }

    static void giocaImpiccato(String parola) {
        char[] riempi = new char[parola.length()];
        int tentativo = 0;
        Arrays.fill(riempi, '*');
        System.out.println(riempi);
        System.out.println("tentativi rimanenti = " + (MAX_tentativo - tentativo));

        Scanner sc = new Scanner(System.in);

        ArrayList<Character> tentativoSbagliato = new ArrayList<>();

        while (tentativo < MAX_tentativo) {
            System.out.println("Gindovina la lettera:");
            char x = sc.next().charAt(0);

            if (tentativoSbagliato.contains(x)) {
                System.out.println("Già indovinato");
                continue;
            }
            if (parola.contains(x + "")) {
                for (int i = 0; i < parola.length(); i++) {
                    if (parola.charAt(i) == x) {
                        riempi[i] = x;
                    }
                }
            } else {
                tentativo++;
                tentativoSbagliato.add(x);
                System.out.println(immagineImpiccato[tentativo - 1]);
            }

            if (parola.equals(String.valueOf(riempi))) {
                System.out.println(riempi);
                System.out.println("Congratulationi! Hai indovinato la parola.");
                break;
            } else {
                System.out.println(riempi);
                System.out.println("tentativo rimanenti = " + (MAX_tentativo - tentativo));
            }
        }

        if (tentativo == MAX_tentativo) {
            System.out.println("BRAVO! La parola era " + parola);
        }
        sc.close();
    }
}