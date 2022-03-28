public class Rectangle extends Shape{

    private int length=5;
    private int height=5;
    Rectangle(){}
    public int getLength(){
        return this.length;
    }

    public int getHeight(){
        return this.height;
    }

    @Override
    public double calculateShape(Shape shape){
        Rectangle rectangle = (Rectangle) shape;
        return (rectangle.getLength() * rectangle.getHeight());
    }
}
