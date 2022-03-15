class App {
    public static void main(String[] args) {
        Point point = new Point(12.0, 23.0);
        Point point1 = new Point(11.0, 2.0);
        System.out.println(point.distance(point1));
        System.out.println(point.x());
        Circle circle = new Circle(point,12.0);
        System.out.println(circle.getArea());
        Section section = new Section(point,point1);
        System.out.println(section.getArea());
        System.out.println(section.getDiameter());
        System.out.println(new Triangle(point, point1, new Point(45.0, 23.0)).getArea());
        System.out.println(new Triangle(point1, new Point(9.0, 23.0), new Point(768.0, -12.0)).getDiameter());
    }
}
