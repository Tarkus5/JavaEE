public class InvoiceImpl<T> implements Invoice2<T> {

    private T id;
    private String client;
    private double amount;

    public InvoiceImpl(T id, String client, double amount) {
        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String getClient() {
        return client;
    }

    @Override
    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
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
