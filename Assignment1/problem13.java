import java.util.Scanner;

public class problem13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float length, width, height;
        float doorwidth, doorheight;
        float windowwidth, windowheight;
        float wallarea, doorarea, windowarea, paintarea, whitewasharea;

        System.out.println("Enter room length, width and height (in meters): ");
        length = sc.nextFloat();
        width = sc.nextFloat();
        height = sc.nextFloat();

        System.out.println("Enter the door width and height (in meters): ");
        doorwidth = sc.nextFloat();
        doorheight = sc.nextFloat();

        System.out.println("Enter the window width and height (in meters): ");
        windowwidth = sc.nextFloat();
        windowheight = sc.nextFloat();

        wallarea = 2 * (length + width) * height;
        doorarea = doorwidth * doorheight;
        windowarea = windowwidth * windowheight;

        paintarea = wallarea - doorarea - 2 * windowarea;
        whitewasharea = length * width;

        System.out.printf("Area to be painted (interior walls): %.2f sq.meters%n", paintarea);
        System.out.printf("Area to be whitewashed (roof): %.2f sq.meters%n", whitewasharea);

        sc.close();
    }
}
