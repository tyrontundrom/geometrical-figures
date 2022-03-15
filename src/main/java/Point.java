public record Point(double x, double y) {

    String distance(Point p) {
        return String.format("distance() calculate distance %s beetween %s", this.toString(),p);
    }
}
