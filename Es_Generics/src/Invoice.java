public class Invoice<T, E> {

    private T id;
    private E client;
    private double amount;

    public Invoice(T id, E client, double amount) {
        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public E getClient() {
        return client;
    }

    public void setClient(E client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Invoice => ");
        sb.append("id=").append(id);
        sb.append(", client='").append(client).append('\'');
        sb.append(", amount=").append(amount);
        return sb.toString();
    }
}
