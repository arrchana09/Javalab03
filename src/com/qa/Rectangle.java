package com.qa;

public class Rectangle extends Shape{

    private double height, width;

    public Rectangle(String name, String colour, double x, double y, double height, double width) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }

    public boolean isSquare(){
        if (width == height)
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCentrePoint() {
        Point c = new Point(this.getX() + width/2, this.getY() + height/2);
        return c;
    }
}
