import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class coda
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);

    Queue<String> coda = new LinkedList<String>();
    System.out.println("Inserisci gli elementi della Queue (inserisci \"fine\" per terminare l'inserimento):");
    String elemento = input.nextLine();
    // System.out.println(coda.remove());
    while (!elemento.equals("fine"))
        {
        coda.add(elemento);
        elemento = input.nextLine();
        }
        System.out.println("Gli elementi della Queue sono:");
        while (!coda.isEmpty())
        {
        System.out.println(coda.remove());
        }

    input.close();
    }
}