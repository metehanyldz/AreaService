import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String args[]) {
        AreaService areaService = new AreaService();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        List<Shape> shapesList = new ArrayList<>();

        shapesList.add(circle);
        shapesList.add(rectangle);

        System.out.println("ans" + String.valueOf(areaService.calculateArea(shapesList)));

    }
}
