public class Circle extends Shape {


    private int radius=5;
    Circle(){}
    public int getRadius(){
        return this.radius;
    }

    @Override
    public double calculateShape(Shape shape){
        Circle circle = (Circle) shape;
        return circle.getRadius() * circle.getRadius() * Math.PI;
    }
}
