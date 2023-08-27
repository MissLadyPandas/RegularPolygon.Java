// This class represents a regular polygon with equal sides
public class RegularPolygon {

    // Properties of a polygon
    private int numberOfSides;
    private double sideLength;
    private double xPosition;
    private double yPosition;

    // This is the constructor that sets up a triangle
    public RegularPolygon() {
        numberOfSides = 3;
        sideLength = 1.0;
        xPosition = 0.0;
        yPosition = 0.0;
    }

    // This constructor lets you set the number of sides and the side length
    public RegularPolygon(int sides, double length) {
        numberOfSides = sides;
        sideLength = length;
        xPosition = 0.0; 
        yPosition = 0.0; 
    }

    // Setter methods to change the properties

    public void setNumberOfSides(int sides) {
        numberOfSides = sides;
    }

    public void setSideLength(double length) {
        sideLength = length;
    }

    public void setXPosition(double x) {
        xPosition = x;
    }

    public void setYPosition(double y) {
        yPosition = y;
    }

    // Getter methods to retrieve the properties

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getXPosition() {
        return xPosition;
    }

    public double getYPosition() {
        return yPosition;
    }

    // This method calculates the total length of all sides
    public double getPerimeter() {
        return sideLength * numberOfSides;
    }

    // This method calculates the area 
    public double getArea() {
        return (numberOfSides * sideLength * sideLength) / (4.0 * Math.tan(Math.PI / numberOfSides));
    }
}

