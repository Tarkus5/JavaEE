/* Costruire un programma che chieda in input l'altezza degli studenti di una classe (altezza espressa in cm )
 * il programma accetta un numero indeterminato di valori in input e restituisce la media aritmetica incrementale ogni volta
 * inserire una condizione per uscire dal ciclo e informare l'utente della stringa da inserire
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticAverage {
    Scanner scanner = new Scanner (System.in);
    ArrayList<Integer> studenti = new ArrayList<Integer>();

    public void inserimento(){
        int altezzaInserita;
        do {
            System.out.println("Inserisci il valore di altezza (in cm) oppure '0' per uscire dall'inserimento");
            altezzaInserita = scanner.nextInt();
            studenti.add(altezzaInserita);
        }while (altezzaInserita != 0);
    }

    int arithmeticAverage = 0;
    public void calculate(){
        for (int i = 0; i < (studenti.size()-1); i++) {
            arithmeticAverage = arithmeticAverage + studenti.get(i);
        }
        System.out.println("La media degli studenti è uguale a: " + (arithmeticAverage / (studenti.size()-1)));
    }

}
