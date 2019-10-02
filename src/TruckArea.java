import java.util.Scanner;

public class TruckArea {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int surfaceArea = 0;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += square();
        System.out.println("\nEnter the area of the square hole");
        surfaceArea -= square();
        surfaceArea += parallelogram();
        
//TODO: add calls to other methods for each of the shapes needed
        System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
    }

    public static int triangle() {
        System.out.println("\nThe area of a triangle is: 1/2 * base * height");
        System.out.print("base > ");
        int base = in.nextInt();
        System.out.print("height > ");
        int height = in.nextInt();
        int area = (int) (0.5 * base * height);
        System.out.println("The area of this shape is: " + area);
        return area;
    }
//TODO: write methods for each of the different shapes
    public static int circle() {
        System.out.println("\nThe area of a circle is: pi * r^2");
        System.out.print("radius > ");
        int radius = in.nextInt();
        int Area = (int) (Math.PI * Math.pow(radius, 2));
        System.out.println("The area of this shape is: " + Area);
        return Area;
    }
    
    public static int square() {
        System.out.println("\nThe area of a square is: a^2");
        System.out.print("length of side > ");
        int side = in.nextInt();
        int Area = (int) (Math.pow(side, 2));
        System.out.println("The area of this shape is: " + Area);
        return Area;
    
    
    }
    
    public static int parallelogram() {
        System.out.println("\nThe area of a parallelogram is: b * h");
        System.out.print("length of base > ");
        int base = in.nextInt();
        System.out.print("length of height > ");
        int height = in.nextInt();
        int Area = (int) (base * height);
        System.out.println("The area of this shape is: " + Area);
        return Area;
        
    }
}