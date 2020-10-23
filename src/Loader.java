public class Loader {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(4, "Белый", false);
        circle_1.setRadius(8.9);
        circle_1.setColor("Розовый");
        System.out.println("Радиус круга: " + circle_1.getRadius() + "; Цвет круга: " + circle_1.getColor());
        System.out.println("Площадь круга: " + circle_1.getArea() + "; Периметр круга: " + circle_1.getPerimeter());
        System.out.println(circle_1.toString());


        Rectangle rectangle_1 = new Rectangle(7.5, 11.2, "Жёлтый", true);
        rectangle_1.setLength(8.7);
        rectangle_1.setWidth(4.9);
        System.out.println("Длина прямоугольника: " + rectangle_1.getLength() + "; Ширина прямоугольника: " + rectangle_1.getWidth());
        System.out.println("Площадь прямоугольника: " + rectangle_1.getArea() + "; Периметр прямоугольника: " + rectangle_1.getPerimeter());
        System.out.println(rectangle_1.toString());

        Square square_1 = new Square(9.0);
        System.out.println("Длина квадрата: " + square_1.getLength()+"; Ширина квадрата: "+square_1.getLength()+"; Сторона квадрата: "+square_1.getSide());
        System.out.println(square_1.toString());


    }
}
