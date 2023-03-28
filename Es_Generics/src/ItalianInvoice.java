public class ItalianInvoice implements Invoice2<Integer> {

    private Integer id;
    private String client;
    private double amount;

    public ItalianInvoice(Integer id, String client, double amount) {
        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
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
