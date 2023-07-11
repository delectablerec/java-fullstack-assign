import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SorteggioSort {
    public static void main(String[] args) {
        // Creare una lista di compagni di corso
        List<String> studenti = Arrays.asList("Emanuele", "Tiziano", "Greta", "Cristopher", "Giorgio", "Simone", "Alessandro", "Davide", "Andrea");

        // Mescolare la lista
        Collections.shuffle(studenti);

        // Stampare le coppie di studenti
    for (int i = 0; i < studenti.size(); i += 2)
    {
        // Se è rimasto un solo studente, stampalo da solo
        if (i == studenti.size() - 1) {
            System.out.println(studenti.get(i));
        } else
        {
            // Altrimenti, stampa la coppia di studenti
            System.out.println(studenti.get(i) + " e " + studenti.get(i + 1));
        }
    }
    }
}