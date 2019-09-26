import java.util.Scanner;

public class ShowShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = scanner.nextInt();
        System.out.println("Enter height:");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Enter triangular square edge:");
        int lenghtEdge = scanner.nextInt();
        for (int i = 0; i <= lenghtEdge; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("One more!");

        for (int i = lenghtEdge; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
