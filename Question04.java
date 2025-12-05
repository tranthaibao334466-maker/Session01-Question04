import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width = ");
        float width = scanner.nextFloat();
        System.out.print("Height = ");
        float height = scanner.nextFloat();
        System.out.printf("Area: %.2f\n", width*height);
        System.out.printf("Perimeter: %.2f", 2*(width+height));
    }
}
