package classes;

public class Account {
private double amount;
private String nome;


    public Account(double amount, String nome) {
        this.amount = amount;
        this.nome = nome;
    }

    public double getAmount(){
    return amount;
}
    public void transferMoney(Account accountSender, Account accountReceiver, double amount) {
        if (accountSender.getAmount() >= amount) {
            double minusAmount = accountSender.getAmount() - amount;
            double addAmount = accountReceiver.getAmount() + amount;

            System.out.println(accountSender.getNome() + " hai effettuato un bonifico di " + amount + "€");
            System.out.println(accountReceiver.getNome() + " hai ricevuto un bonifico di " + amount + "€");
            System.out.println(" ");
            System.out.println(accountSender.getNome() + " il tuo saldo attuale è di: " + minusAmount + "€");
            System.out.println(accountReceiver.getNome() + " il tuo saldo attuale è di: " + addAmount + "€");
        } else {
            System.out.println("Non puoi effettuare il bonifico: fondi insufficienti!");
        }
    }

    public String getNome() {
        return nome;
    }
}

