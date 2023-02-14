import java.util.Scanner;

public class ContoCorrente {
    // proprietà
    private String idConto; // riferimeto con this.idConto nel costruttore
    private float saldoContabile;
    private float tassoInteresse ;
    private  float interesse;
    final private float commissione = 1.5f;
    Scanner scanner ; // dichiaro un oggetto scanner

    // costruttore con tre parametri


    public ContoCorrente(String idConto, float saldoContabile, float tassoInteresse) {
        this.idConto = idConto;
        this.saldoContabile = saldoContabile;
        this.tassoInteresse = tassoInteresse;
        scanner = new Scanner(System.in);
    }

    // metodo preleva (prelievo solo se saldo >0 e poi se saldo > importo prelevato )
    public void prelievo(){
        float prelevato = 0.0f;
        if (saldoContabile>0){
            System.out.println("Quanto vuoi prelevare ?");
            prelevato = scanner.nextFloat();
            if (saldoContabile>prelevato){
                saldoContabile = saldoContabile - prelevato - commissione;
                saldo();
            }
            else {
                System.out.println("Importo non prelevabile: fondi insufficienti");
            }
        }
    }// fine metodo prelievo
    // metodo calcola saldo

    public void saldo (){
        System.out.println("Il saldo attuale è : " + this.saldoContabile );
    }

    // metodo per versamento
    public void deposito(){
        System.out.println("Quanbto vuoi depositare ? ");
        float deposito = scanner.nextFloat();
        saldoContabile += deposito; // saldoContabile  = deposito + saldoContabile
        saldo();
    }

    // metodo calcolaInteressi - Metodo calcolaInteressi : float  (solo se saldo > 0)
    public  float calcolaInteressi (){
        float interesse =( saldoContabile * tassoInteresse) / 100 ;
        saldoContabile += interesse;
        return interesse;
    }

    public void stampaInteresse (){
        System.out.printf("Interessi : %.2f " , interesse);
    }




}