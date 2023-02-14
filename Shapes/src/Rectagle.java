public class Rectagle implements Shape {
    private double base;
    private double height;

    public Rectagle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }
}
