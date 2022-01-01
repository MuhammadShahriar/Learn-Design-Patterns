package CreationalDesignPatterns.FactoryDesignPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeCircle = shapeFactory.getShape("circle");
        Shape shapeRectAngle = shapeFactory.getShape("rectangle");
        Shape shapeSquare = shapeFactory.getShape("Square");

        shapeCircle.draw();
        shapeRectAngle.draw();
        shapeSquare.draw();
    }
}
