non-sealed class Triangle extends Polygon {
    private Point pointX;
    private Point pointY;
    private Point pointZ;

    public Triangle(Point pointX, Point pointY, Point pointZ) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
    }

    @Override
    public String getArea() {
        return String.format("getArea() calculate area of %s", this.toString());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                ", pointZ=" + pointZ +
                '}';
    }
}
