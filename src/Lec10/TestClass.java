package Lec10;

public class TestClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(1,2);

        Circle circle = (Circle) GeometricObjectComparable.max(circle1, circle2);
        Rectangle rectangle = (Rectangle)GeometricObjectComparable.max(rectangle1, rectangle2);

        System.out.println("The max circle's area is " + circle.getArea());
        System.out.println("The max rectangle's area is " + rectangle.getArea());
        System.out.println(circle);
        System.out.println(rectangle);
    }
}


abstract class GeometricObjectComparable extends GeometricObject{
    protected GeometricObjectComparable() {
        super();
    }

    public static GeometricObjectComparable max(GeometricObjectComparable obj1, GeometricObjectComparable obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }
}

abstract class GeometricObject implements Comparable<GeometricObject>{

    protected GeometricObject() {
    }
    public abstract double getArea();

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Circle extends GeometricObjectComparable {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }
}

class Rectangle extends GeometricObjectComparable {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "[rectangle] width: " + width + " height: " + height;
    }
}
