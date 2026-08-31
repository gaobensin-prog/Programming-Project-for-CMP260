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
        Map<String, List<Double>> values = new HashMap<>();
        List<String> points = new ArrayList<>();
        for (int i = 1; i < 4; i++){
            List<Double> nums = new ArrayList<>();
            System.out.print("Enter name for point " + i + " (single uppercase letter A-Z): ");
            String letter = input.nextLine();
            points.add(letter);
            System.out.print("Enter coordinates for " + letter + " as x y: ");
            Double x = input.nextDouble();
            Double y = input.nextDouble();
            input.nextLine();
            nums.add(x); nums.add(y);
            values.put(letter, nums);
            nums = new ArrayList<>();
        }
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
        System.out.println(points.get(0) + values.get(points.get(0)) + ", " + points.get(1) + values.get(points.get(1)) + ", " + points.get(2) + values.get(points.get(2)));
        
    }
}