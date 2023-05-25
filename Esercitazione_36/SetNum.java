import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetNum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Set<Integer> setNumeri = new HashSet<Integer>();
    System.out.println("Inserisci gli interi separati da uno spazio:");
    String[] numeri = input.nextLine().split(" ");
    for (String numero : numeri) {
      setNumeri.add(Integer.parseInt(numero));
    }
    System.out.println("il numero di elementi inseriti �: " + numeri.length);
    System.out.println("il numero di elementi del set duplicati �: " + setNumeri.size());
    System.out.println("Il Set senza duplicati �:");
    for (int numero : setNumeri) {
      System.out.print(numero + " ");
    }

    input.close();
  }
}

/*
per utilizzare il carattere è che normalmente restituisce  Ã¨ basta eseguire il comando java con questi attributi:
java -Dfile.encoding="UTF-8" SetNum.java e ricordarsi di specificare anche l'estensione del file
*/