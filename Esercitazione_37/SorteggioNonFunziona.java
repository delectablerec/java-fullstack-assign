import java.util.Random;

public class SorteggioNonFunziona {
    public static void main(String[] args) {
        // Creare un array di compagni di corso
        String[] studenti = {"Emanuele", "Tiziano", "Greta", "Cristopher", "Giorgio", "Simone", "Alessandro", "Davide"};
        Random rand = new Random();

        // Mescolare l'array
        for (int i = 0; i < studenti.length; i++) {
            int randomIndex = rand.nextInt(studenti.length);
            String temp = studenti[i];
            studenti[i] = studenti[randomIndex];
            studenti[randomIndex] = temp;
        }

        // Stampare le coppie di studenti
        for (int i = 0; i < studenti.length; i += 2) {
            System.out.println(studenti[i] + " e " + studenti[i + 1]);
        }
    }
}