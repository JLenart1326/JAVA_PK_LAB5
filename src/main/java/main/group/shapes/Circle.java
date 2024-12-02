package main.group.shapes;

import jakarta.persistence.*;
import main.group.color.Color;

@Entity
@Table(name = "circles")
public class Circle extends Shape {
    private double radius;

    public Circle() {this.radius = 0;}

    public Circle(double r, Color color) {
        super(color);
        this.radius = r;
    }

    @Override
    public String toString() {
        return "Radius: " + this.radius;
    }

    @Override
    public double getArea() {
        return (double) (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * Math.PI * this.radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }
}
