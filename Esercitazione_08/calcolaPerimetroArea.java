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
        /// aggiunto una condizione aggiuntiva che verifica che l'input sia compreso tra due valori specifici
        if (lato>40 || lato<1) {
             // se l'input è > 40
            System.out.println("Hai inserito un numero non valido");
        } else {
            // se l'input è <= 40
            System.out.println("il lato inserito: "+lato);
            System.out.println("l'area e': "+area);
            System.out.println("il perimetro e': "+perimetro);
        }
        // lascio fuori dal if else la chiusura della classe input
        input.close();
    }
}

/*
note per i collaboratori
*/