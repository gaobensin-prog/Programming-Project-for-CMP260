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
        List<Double> nums = new ArrayList<>();
        Map<String, List<Double>> values = new HashMap<>();
        for (int i = 1; i < 4; i++){
            System.out.print("Please Enter a Uppercase Letter: ");
            String letter = input.nextLine();
            for (int j = 1; j < 3; j++){
                if (j == 2){
                    System.out.print("Enter a Number for y:");
                }else{
                    System.out.print("Enter a Number for x: ");
                }
                Double num = input.nextDouble();
                input.next();
                nums.add(num);
            values.put(letter, nums);
        input.close();
            }
        }

        //System.out.print("Choose a Distance Metric: ");
        //String distanceMetric = input.nextLine();
        //input.nextLine();
        //System.out.print("Choose How Much Decimal Place: ");
        //Integer decimalPlace = input.nextInt();
        //input.nextLine();
        //System.out.print(nums);

        
        

    }
}