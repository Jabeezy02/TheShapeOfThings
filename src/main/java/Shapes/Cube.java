package Shapes;

public class Cube extends Shape{

    private double width;
    private double surfaceArea;
    private double volume;

    public Cube(){
        super();
        this.width = 0.0;
    }

    public Cube(double w){
        super();
        this.width = w;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        this.width = w;
    }

    public double surfaceArea(){
        this.surfaceArea = 4 * Math.pow(width, 2);
        return this.surfaceArea;
    }
    public double volume(){
        this.volume = Math.pow(width, 3);
        return this.volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "width=" + width +
                ", surface area= " + surfaceArea() +
                ", volume= " + volume() +
                '}';
    }
}
