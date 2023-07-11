import java.util.Random;

public class SorteggioRandom
{
    public static void main(String[] args)
    {
        String[] studenti = {"Emanuele", "Tiziano", "Greta", "Cristopher", "Giorgio", "Simone", "Alessandro", "Davide", "Andrea"};
        Random rand = new Random();
        for (int i = 0; i < studenti.length; i++)
            {
            int randomIndex = rand.nextInt(studenti.length);
            String studenteCorrente = studenti[i];
            studenti[i] = studenti[randomIndex];
            studenti[randomIndex] = studenteCorrente;
            }
        for (int i = 0; i < studenti.length; i += 2)
        {
            if (i == studenti.length - 1)
            {
                System.out.println(studenti[i]);
            } else
            {
                System.out.println(studenti[i] + " e " + studenti[i + 1]);
            }
        }
    }
}
// In questo codice, abbiamo aggiunto un'istruzione if all'interno del ciclo for che stampa le coppie di studenti.
// i è uguale alla lunghezza dell'array meno uno (cioè, se abbiamo raggiunto l'ultimo studente nell'array), stampiamo solo quello studente.
// In caso contrario, stampiamo la coppia di studenti come prima.

/*
Questo metodo viene spesso chiamato l'algoritmo di Fisher-Yates o Knuth shuffle
 */