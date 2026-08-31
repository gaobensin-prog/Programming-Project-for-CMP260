// Zhi Gao
// C00571719
// CMPS 260
// Programming Assignment: PA2
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class PA2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name for point (single uppercase letter A-Z): ");
        String letter = input.nextLine();
        System.out.print("Enter coordinates for " + letter + " as x y: ");
        Double x = input.nextDouble();
        Double y = input.nextDouble();
        input.nextLine();
        System.out.print("Choose a Distance Metric (euclidean, manhattan, chebyshev): ");
        String distanceMetric = input.nextLine();
        if (!distanceMetric.equals("euclidean") && !distanceMetric.equals("manhattan") && !distanceMetric.equals("chebyshev")){
            System.out.print("Invalid distance metric: " + distanceMetric + ". Goodbye.");
            System.exit(0);
        } 
        System.out.print("Enter decimal precision (1-6): ");
        Integer decimalPlace = input.nextInt();
        input.nextLine();
        if (decimalPlace > 6 || decimalPlace < 1){
            System.out.print("Invalid precision: " + decimalPlace + " (must be in [1, 6]). Goodbye.");
            System.exit(0);
        }
        
        System.out.println("=== Distance Metrics for All Points ===");
    }
}