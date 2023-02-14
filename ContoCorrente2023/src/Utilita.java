import java.util.Scanner;

public class Utilita {
    //Gestiamo le utilità necessarie per l'applicazione
    public void menu(ContoCorrente contoCorrente) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Scegli una operazione");
            System.out.println("1] Versa ");
            System.out.println("2] Preleva");
            System.out.println("3] Calcola Interessi");
            System.out.println("4] Stampa saldo");
            System.out.println("5] Esci");

            System.out.println("Inserisci un valore da 1 a 5");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    contoCorrente.deposito();
                    break;
                case 2:
                    contoCorrente.prelievo();
                    break;
                case 3:
                    contoCorrente.calcolaInteressi();
                    break;
                case 4:
                    contoCorrente.saldo();
                    break;
                case 5:
                    System.exit(0);

            }
        } while (true);
    }
}
