public class RegularPolygonTest {
    public static void main(String[] args) {
        // Test of preset polygon 1 & 2 here, displays # of sides, perimeter, and area
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("Polygon1 - Sides: " + polygon1.getNumberOfSides() + ", Perimeter: " + polygon1.getPerimeter() + ", Area: " + polygon1.getArea());

        RegularPolygon polygon2 = new RegularPolygon(6, 2.0);
        System.out.println("Polygon2 - Sides: " + polygon2.getNumberOfSides() + ", Perimeter: " + polygon2.getPerimeter() + ", Area: " + polygon2.getArea());
    }
}
