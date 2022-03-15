public record Circle(Point point, double radius) implements Shape {
    public Circle {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius not allowed");
        }
    }

    @Override
    public String getArea() {
        return String.format("getArea() calculate area of %s", this.toString());
    }

}
