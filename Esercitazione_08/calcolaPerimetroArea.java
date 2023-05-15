/*
titolo dell'esercitazione e relativa spiegazione
*/
import java.util.Scanner;

public class calcolaPerimetroArea
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del lato: ");
        int lato;
        lato = input.nextInt();
        int area;
        int perimetro;
        area = lato*lato;
        perimetro = lato*4;
        System.out.println("il lato inserito: "+lato); // concateno testo e variabili
        System.out.println("l'area e': "+area);
        System.out.println("il perimetro e': "+perimetro);
        input.close();
    }
}

/*
note per i collaboratori
*/