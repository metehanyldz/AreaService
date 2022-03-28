import java.util.List;

public class AreaService {

    public double calculateArea(List<Shape> shapes) {
        double area = 0;

        for (Shape shape : shapes) {
            area += shape.calculateShape(shape);

        }
        return area;
    }

}
