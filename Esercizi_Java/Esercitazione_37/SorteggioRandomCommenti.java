import java.util.Random;

public class SorteggioRandomCommenti {
    public static void main(String[] args) {
        // Creare un array di compagni di corso
        String[] studenti = {"Emanuele", "Tiziano", "Greta", "Cristopher", "Giorgio", "Simone", "Alessandro", "Davide", "Andrea"};

        // Creare un oggetto Random per generare numeri casuali
        Random rand = new Random();

        // Eseguire il ciclo attraverso ogni elemento dell'array
        for (int i = 0; i < studenti.length; i++) {
            // Generare un indice casuale
            int randomIndex = rand.nextInt(studenti.length);

            // Memorizzare temporaneamente l'elemento corrente dell'array
            String studenteCorrente = studenti[i];

            // Sostituire l'elemento corrente con l'elemento a indice casuale
            studenti[i] = studenti[randomIndex];

            // Sostituire l'elemento a indice casuale con l'elemento corrente
            studenti[randomIndex] = studenteCorrente;
        }

        // Eseguire il ciclo attraverso l'array a passi di 2
        for (int i = 0; i < studenti.length; i += 2) {
            // Se è rimasto un solo studente (cioè, se siamo all'ultimo elemento dell'array)
            if (i == studenti.length - 1) {
                // Stampare solo l'ultimo studente
                System.out.println(studenti[i]);
            } else {
                // Altrimenti, stampare la coppia di studenti
                System.out.println(studenti[i] + " e " + studenti[i + 1]);
            }
        }
    }
}