package br.com.cleiton.inf008.l1;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Creating calculators ---");
        // 1. Using the default constructor (should have a precision of 2)
        GeometryCalculator calcDefault = new GeometryCalculator();
        System.out.println("Default calculator created with precision: " + calcDefault.getPrecision());

        // 2. Using the constructor with a custom precision
        GeometryCalculator calcCustom = new GeometryCalculator(4);
        System.out.println("Custom calculator created with precision: " + calcCustom.getPrecision());
        System.out.println("----------------------------\n");


        System.out.println("--- Testing with default precision calculator (2 decimal places) ---");
        // 3. Area of a Circle
        double circleArea = calcDefault.calculateArea(10.0);
        System.out.println("Area of a circle with radius 10: " + calcDefault.getFormattedResult(circleArea));

        // 4. Area of a Rectangle
        double rectangleArea = calcDefault.calculateArea(8.0, 5.0, "rectangle");
        System.out.println("Area of an 8x5 rectangle: " + calcDefault.getFormattedResult(rectangleArea));

        // 5. Area of a Triangle (base and height)
        double triangleArea1 = calcDefault.calculateArea(8.0, 5.0, "triangle");
        System.out.println("Area of a triangle with base 8 and height 5: " + calcDefault.getFormattedResult(triangleArea1));

        // 6. Perimeter of a pentagon
        double pentagonPerimeter = calcDefault.calculatePerimeter(5.5, 5.5, 5.5, 5.5, 5.5);
        System.out.println("Perimeter of a pentagon with side 5.5: " + calcDefault.getFormattedResult(pentagonPerimeter));
        System.out.println("------------------------------------------------------------------\n");


        System.out.println("--- Testing with custom precision calculator (4 decimal places) ---");
        // 7. Area of a Circle with higher precision
        double circleAreaCustom = calcCustom.calculateArea(10.0);
        System.out.println("Area of a circle with radius 10: " + calcCustom.getFormattedResult(circleAreaCustom));
        
        // 8. Area of a Triangle (Heron's formula) - using a 3-4-5 right triangle
        // Remember to correct the formula in your class: semiperimeter * (s-a)...
        double triangleArea2 = calcCustom.calculateArea(3.0, 4.0, 5.0);
        System.out.println("Area of a 3-4-5 triangle using Heron's formula: " + calcCustom.getFormattedResult(triangleArea2));

        // 9. Perimeter of a triangle
        double trianglePerimeter = calcCustom.calculatePerimeter(10.0, 12.5, 8.0);
        System.out.println("Perimeter of a triangle with sides 10, 12.5, 8: " + calcCustom.getFormattedResult(trianglePerimeter));
        System.out.println("-----------------------------------------------------------------\n");


        System.out.println("--- Testing Exception Handling ---");
        // 10. Testing invalid shape exception
        try {
            calcDefault.calculateArea(10, 10, "trapezoid");
        } catch (IllegalArgumentException e) {
            System.out.println("Successfully caught an expected error: " + e.getMessage());
        }
        System.out.println("----------------------------------\n");
    }
}