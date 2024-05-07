package Lec10;

public class TestColor {
    public static void main(String[] args) {
        GeometricObjectComparable[] objects = {
                new Square(2), new Circle(5), new Square(5), new Rectangle(3, 4), new Square(4.5)
        };

        for (GeometricObjectComparable obj : objects) {
            System.out.println("Area is " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}

interface Colorable {
    void howToColor();
}

class Square extends GeometricObjectComparable implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

class Circle1 extends GeometricObjectComparable {
    private double radius;

    public Circle1(double radius) {
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
}

class Rectangle1 extends GeometricObjectComparable {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
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
}
