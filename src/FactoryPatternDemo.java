public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

// Khởi tạo hình tròn
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

// Khởi tạo hình chữ nhật
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

// Khởi tạo hình vuông
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }

}
