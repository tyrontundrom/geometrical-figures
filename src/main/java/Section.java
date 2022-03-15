non-sealed class Section extends Polygon {
    private Point pointX;
    private Point pointY;

    public Section(Point pointX, Point pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    @Override
    public String getArea() {
        return String.format("getArea() calculate area of %s", this.toString());
    }

    @Override
    public String toString() {
        return "Section{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}
