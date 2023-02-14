/*
Esercizio centro di formazione

La direttrice di un centro di formazione ha bisogno di un programma per formare le classi per il nuovo anno formativo:
Stampare o visualizzare il numero di classi che si possono ottenere con un gruppo di studenti di cui si conosce l'anno di nascita.
Le classi devono essere omogenee per età e possono contenere max 16 studenti.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Studente {
    ArrayList<Integer> anniNascita = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    public void inserimentoStudenti(){
        int annoNascita = 0;
        do {
            System.out.println("Inserisci l'anno di nascita dello studente o scrivi '0' per terminare l'inserimento");
            annoNascita = scanner.nextInt();
            anniNascita.add(annoNascita);
        }while (annoNascita != 0);
    }

    public void sort(){
        int iterator = 0;
        ArrayList<Integer> annoUno = new ArrayList<Integer>();
        ArrayList<Integer> annoDue = new ArrayList<>();
        for (int i = 0; i < anniNascita.size(); i++){
            annoUno.add(anniNascita.get(0));
            iterator++;
            if (anniNascita.get(i) != anniNascita.get(0)){
                annoDue.add(anniNascita.get(i));
                iterator++;
            }
        }
        System.out.println(annoUno);
        System.out.println(annoDue);
    }

}
