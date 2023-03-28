public class Main {

    public static <T> T getRandomElement(T[] arr) {
        int randomIndex = (int) Math.floor(Math.random() * arr.length);
        return arr[randomIndex];
    }

    //WILDCARD
    public static void printCoppia(Coppie<?, ?> coppia) {
        System.out.println(coppia);
    }

    public static void main(String[] args) {

        Integer[] numbers = {1, 9, 3, 6, 0};
        Integer randomNumber = getRandomElement(numbers);
        System.out.println("Numero casuale: " + randomNumber);

        Double[] doubleNumbers = {1.3, 9.4, 3.5, 6.7, 0.6};
        Double randomDoubleNumber = getRandomElement(doubleNumbers);
        System.out.println("Numero casuale: " + randomDoubleNumber);

        String[] colors = {"Red", "Green", "Blue"};
        String randomColor = getRandomElement(colors);
        System.out.println("Colore casuale: " + randomColor);

        System.out.println("-------------GENERICS CON LE CLASSI-----------------");

        Invoice<Integer, String> invoiceToBenito = new Invoice<>(1,"Benito", 1000.0);
        System.out.println(invoiceToBenito);

        Invoice<String, Integer> invoiceToKim = new Invoice<>("2023/01", 123666123, 500.0);
        System.out.println(invoiceToKim);

        Invoice<Integer, Integer> invoiceToAdolf = new Invoice<>(666, 123666123, 500.0);
        System.out.println(invoiceToAdolf);

        System.out.println("-------------GENERICS CON LE INTERFACCE-----------------");
        Invoice2<Integer> invoiceToIosif = new ItalianInvoice(2, "Iosif", 1500.0);
        System.out.println(invoiceToIosif);

        InvoiceImpl<Integer> invoiceToFrancisco = new InvoiceImpl<Integer>(25, "Francisco", 2500.0);
        System.out.println(invoiceToFrancisco);

        Invoice2<Integer> invoiceToPol = new InvoiceImpl<>(26, "Pol", 3000.0);
        System.out.println(invoiceToPol);

        System.out.println("-------------GENERICS ESERCIZI-----------------");
        Coppie<Integer, String> coppieRandom = new Coppie<>(25, "Ciaobbello");
        System.out.println(coppieRandom);

    }
}