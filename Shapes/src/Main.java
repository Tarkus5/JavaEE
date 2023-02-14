public class Main {
    public static void main(String[] args) {
    Shape rectangleArea = new Rectagle(10.0, 3.0); //Ci richiama comunque il metodo giusto per il principio del polimorfismo
    double areaRectangle = rectangleArea.getArea();
    System.out.println("Rectangle area = " + areaRectangle);

    /*
    Polimorfismo = possibilità di chiamare un oggetto da una superclasse o interfaccia ma avere risultati
    differenti, in funzione del tipo di dato utilizzato per creare l'oggetto.
    */

    Shape triangleArea = new Triangle(10.0, 3.0); //Ci richiama comunque il metodo giusto per il principio del polimorfismo
    double areaTriangle = triangleArea.getArea();
    System.out.println("Triangle area = " + areaTriangle);
    }
}