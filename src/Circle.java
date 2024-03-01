final public class Circle {
    private final double pi = Math.PI;
    private final double radius;

    public Circle( double radius) {
        this.radius = radius;
    }
    public double getPi() {
        return pi;
    }
    public double getRadius() {
        return radius;
    }
    public double computeArea(){
        return (pi * radius * radius);
    }
}
