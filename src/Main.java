import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C for Circle \n" + "Enter R for Rectangle \n" + "Enter T for Triangle");
        String selectedChar = sc.nextLine();
        if(selectedChar.equals("C")){
            System.out.println("Enter the radius of the circle");
            double radius = sc.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("The area of the circle is :" + circle.computeArea() );
        }
        else if(selectedChar.equals("R")){
            System.out.println("Enter the width of the Rectangle");
            double width = sc.nextDouble();
            System.out.println("Enter the height of the Rectangle");
            double height = sc.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("The area of Rectangle is :" + rectangle.computeArea() );
        }
        else if(selectedChar.equals("T")){
            System.out.println("Enter the base of the triangle");
            double base = sc.nextDouble();
            System.out.println("Enter the height of the triangle");
            double height = sc.nextDouble();
            Triangle triangle = new Triangle(base, height);
            System.out.println("The area of triangle is :" + triangle.computeArea() );
        }else{
            System.out.println("You didn't put valid letter");
        }
        sc.close();

    }
}
