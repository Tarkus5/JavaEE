import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creo il primo conto
        ContoCorrente contoCorrente1 = new ContoCorrente("AX1241",150.00f,1.5f);
        Utilita utilita = new Utilita();
        utilita.menu(contoCorrente1);
        /*contoCorrente1.saldo();
        contoCorrente1.saldo();
        contoCorrente1.prelievo();
        //System.out.println("Interessi : " + contoCorrente1.calcolaInteressi());
        contoCorrente1.deposito();
        contoCorrente1.calcolaInteressi();
        contoCorrente1.stampaInteresse();
        Scanner scanner = new Scanner(System.in);
        // creiamo un menu scelta operazioni tramite un  do - while
        do {
            System.out.println("Scegli una operazione");
            System.out.println("1] Versa ");
            System.out.println("2] Preleva");
            System.out.println("3] Calcola Interessi");
            System.out.println("4] Stampa saldo");
            System.out.println("5] Esci");

            System.out.println("Inserisci un valore da 1 a 5");
            int scelta = scanner.nextInt();
            switch (scelta){
                case 1: contoCorrente1.deposito();
                    break;
                case 2: contoCorrente1.prelievo();
                    break;
                case 3: contoCorrente1.calcolaInteressi();
                    break;
                case 4: contoCorrente1.saldo();
                    break;
                case 5: System.exit(0);

            }

        }
        while (true);
*/
    }
}