package br.com.cleiton.inf008.l1;

public class GeometryCalculator {

    private int precision;

    public GeometryCalculator() {
        this(2);
    }

    public GeometryCalculator(int precision) {
        setPrecision(precision);
    }

    public int getPrecision() { return this.precision; }
    public void setPrecision(int precision) { this.precision = precision; }

    public String getFormattedResult(double number) {
        String formatSpecifier = "%." + this.precision + "f";

        return String.format(formatSpecifier, number);
    }

    public double calculateArea(double radius) { return Math.PI * Math.pow(radius, 2); }

    public double calculateArea(double base, double height, String shape) {
        if(shape.equalsIgnoreCase("rectangle")){
            return base * height;
        }else if(shape.equalsIgnoreCase("triangle")){
            return (base * height) / 2;
        }else {
            throw new IllegalArgumentException("Unknown Shape: " + shape);
        }
    }

    public double calculateArea(double side1, double side2, double side3) {
        double semiperimeter = this.calculatePerimeter(side1, side2, side3) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    public double calculatePerimeter(double... sides) {
        double perimeter = 0;

        for(double side : sides) {
            perimeter += side;
        }

        return perimeter;
    }
}
