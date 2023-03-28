public interface Invoice2<T> {

     T getId();
     void setId(T id);

     String getClient();
     void setClient(String client);

     double getAmount();
     void setAmount(double amount);

}
