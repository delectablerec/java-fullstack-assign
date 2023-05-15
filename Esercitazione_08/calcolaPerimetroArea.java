/*
titolo dell'esercitazione e relativa spiegazione
*/
import java.util.Scanner; // libreria che serve per poter utilizzare i metodi di Scanner (lettura input)

public class calcolaPerimetroArea // deve chiamarsi come il nome del file .java
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // creo un oggetto scanner chiamato input
        System.out.print("Inserisci la lunghezza del lato: ");
        int lato; // questo sarà il parametro che utilizzerò per i calcoli
        lato = input.nextInt(); // legge il prossimo intero dall'input
        int area;
        int perimetro;
        // lato = 5; // assegno il vaore 5 alla variabile lato
        area = lato*lato;
        perimetro = lato*4;
        System.out.println(lato); // stampa della variabile lato andando a capo
        // System.out.print(lato); // stampa della variabile lato senza andare a a capo
        System.out.println(area); // stampa area
        System.out.println(perimetro); // stampa perimetro
        input.close(); // la chiusura è opzionale ma segna in giallo l'input finchè non la mettiamo
    }
}

/*
note per i collaboratori
*/