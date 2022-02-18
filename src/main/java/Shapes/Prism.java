package Shapes;

public class Prism extends Shape{

    private double width;
    private double length;
    private double height;
    private double surfaceArea;
    private double volume;


    public Prism(){
        super();
        this.width = 0.0;
        this.length = 0.0;
        this.height = 0.0;
    }

    public Prism(double w, double l, double h){
        super();
        this.width = w;
        this.length = l;
        this.height = h;
    }

    public double getWidth(){

        return width;
    }
    public double getLength(){
        return length;
    }
    public double getHeigth(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setHeigth(double height){
        this.height = height;
    }
    public double surfaceArea(){
        this.surfaceArea = (2 * (length * width) + (2 * (length * height)) + (2 * (width * height)));

        return this.surfaceArea;

    }
    public double volume(){
        this.volume = width * length * height;

        return this.volume;

    }

    @Override
    public String toString() {
        return "Prism{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", surface area=" + surfaceArea() +
                ", volume=" + volume() +
                '}';
    }
}
