package Shapes;

public class Cylinder extends Shape{

    private double height;
    private double radius;
    private double surfaceArea;
    private double volume;

    public Cylinder(){
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double r, double h){
        super();
        this.radius = r;
        this.height = h;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double surfaceArea(){
        this.surfaceArea = (2 * Math.PI * (radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
        return this.surfaceArea;
    }

    public double volume(){
        this.volume = Math.PI * Math.pow(radius, 2) * height;
        return this.volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", surface area= " + surfaceArea() +
                ", volume= " + volume() +
                '}';
    }
}
