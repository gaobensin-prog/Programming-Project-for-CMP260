// Zhi Gao
// C00571719
// CMPS 260
// Programming Assignment: PA2
import java.util.Scanner;
public class PA2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name for point 1 (single uppercase letter A-Z): ");
        String letter1 = input.nextLine();
        if (letter1.length() != 1 || !Character.isUpperCase(letter1.charAt(0))){
            System.out.print("Invaild point name: " + letter1 + " (must be a single uppercase letter A-Z). Goodbye.");
            input.close();
            return;
        }
        System.out.print("Enter coordinates for " + letter1 + " as x y: ");
        Double x1 = input.nextDouble();
        Double y1 = input.nextDouble();
        input.nextLine();
        System.out.print("Enter name for point 2 (single uppercase letter A-Z): ");
        String letter2 = input.nextLine();
        if (letter2.length() != 1 || !Character.isUpperCase(letter2.charAt(0))){
            System.out.print("Invaild point name: " + letter2 + " (must be a single uppercase letter A-Z). Goodbye.");
            input.close();
            return;
        }else if (letter2.equals(letter1)){
            System.out.print("Dupicate point name entered for " + letter2 + ". Goodbye.");
            input.close();
            return;
        }
        
        System.out.print("Enter coordinates for " + letter2 + " as x y: ");
        Double x2 = input.nextDouble();
        Double y2 = input.nextDouble();
        if (x2 == x1 && y2 == x1){
            System.out.print("Duplicate coordinates entered " + letter2 + ". Goodbye");
            input.close();
            return;
        }
        input.nextLine();
        System.out.print("Enter name for point 2 (single uppercase letter A-Z): ");
        String letter3 = input.nextLine();
        if (letter3.length() != 1 || !Character.isUpperCase(letter3.charAt(0))){
            System.out.print("Invaild point name: " + letter3 + " (must be a single uppercase letter A-Z). Goodbye.");
            input.close();
            return;
        }else if (letter3.equals(letter1) || letter3.equals(letter2)){
            System.out.print("Dupicate point name entered for " + letter3 + ". Goodbye.");
            input.close();
            return;
        }
        System.out.print("Enter coordinates for " + letter3 + " as x y: ");
        Double x3 = input.nextDouble();
        Double y3 = input.nextDouble();
        if ((x3 == x2 && y3 == y2) || (x3 == x1 && y3 == y1)){
            System.out.print("Duplicate coordinates entered " + letter3 + ". Goodbye");
            input.close();
            return;
        }
        input.nextLine();
        
        
        System.out.print("Choose a Distance Metric (euclidean, manhattan, chebyshev): ");
        String distanceMetric = input.nextLine();
        if (!distanceMetric.equals("euclidean") && !distanceMetric.equals("manhattan") && !distanceMetric.equals("chebyshev")){
            System.out.print("Invalid distance metric: " + distanceMetric + ". Goodbye.");
            input.close();
            return;
        } 
        System.out.print("Enter decimal precision (1-6): ");
        Integer decimalPlace = input.nextInt();
        input.nextLine();
        if (decimalPlace > 6 || decimalPlace < 1){
            System.out.print("Invalid precision: " + decimalPlace + " (must be in [1, 6]). Goodbye.");
            input.close();
            return;
        }
        
        System.out.println("=== Distance Metrics for All Points ===");
        System.out.print(letter1 + "(" + (x1 * Math.pow(10, -decimalPlace)) + ", " + (y1 * Math.pow(10, -decimalPlace)) + ")" + ", " + letter2 + "(" + (x2 * Math.pow(10, -decimalPlace)) + ", " + (y2 * Math.pow(10, -decimalPlace)) + ")" + ", " + letter3 + "(" + (x3 * Math.pow(10, -decimalPlace)) + ", " + (y3 * Math.pow(10, -decimalPlace)) + ")");
        



        input.close();
    }
}