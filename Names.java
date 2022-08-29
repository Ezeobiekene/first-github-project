
    
        import java.util.Scanner;

         public class Names {
        
                public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
        
                    //prompt the user to enter a radius
                    System.out.print("Enter a number for radius: ");
                    double radius = input.nextDouble();
        
        
                    //compute the area of circle
                    double area = radius * radius * 3.14159;
        
                    //display result
                    System.out.println("The area for the circle of radius " + radius + " is " + area);
                }
        
            }

