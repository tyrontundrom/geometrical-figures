public sealed interface Shape permits Circle, Polygon {
    String getArea();

    default String getDiameter() {
        return switch (this) {
            case Circle circle -> "is " + Circle.class + " object.";
            case Section section -> "is " + Section.class + " object.";
            case Triangle triangle -> "is " + Triangle.class + " object.";
            default -> throw new IllegalStateException("Unexpected value: " + this);
        };
    }
}
