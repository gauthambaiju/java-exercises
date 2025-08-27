package Rectangle_2;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return this.length * this.breadth;
    }

    public double calculatePerimeter() {
        return (this.length + this.breadth) * 2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
    }
}
