package sumasprefijas;
/*import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
*/
import java.util.Scanner;
import java.util.Arrays;

 // @author Adriana Leon


 
public class SumasPrefijas {

 

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int[] nums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = (Integer.parseInt(arr[i]) == - 1) ? 0 : Integer.parseInt(arr[i]);
        }

        int[] prefixSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int next = Arrays.binarySearch(nums, nums[i] + 1);
            if (next >= 0) {
                prefixSums[i] = prefixSums[i - 1] + nums[i];
            }
        }
        for (int i = 0; i < prefixSums.length; i++) {
            System.out.print(prefixSums[i] + " + ");
        }
    }
    }
       /*
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < args.length; i++) {
            numbers.add(Integer.parseInt(args[i]));
        }
        
        Collections.sort(numbers);
        
        List<Integer> result = new ArrayList<>();
        
        for (int number : numbers) {
            if (result.contains(number)) {
                result.set(result.indexOf(number), result.get(result.indexOf(number)) + 1);
            } else {
                result.add(number);
            }
        }
        
        System.out.println(result);
    }  */
        // this is not how it should look like, I need the sum to be tomething like this 
    /* [1, 1
        2, 3
        3, 6
        4, 10
        5, 15 
        6, 21]   */
    
       /* if (args.length != 3) {
            System.out.println("No están bien los parámetros");
            return;
        }
        
        if (!args[1].equals("+") && !args[1].equals("-")) {
            System.out.println("No se lo que me has pedido");
        }
        
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = ");
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        
        if (args[1].equals("+")) {
            System.out.println(a + b);
        } else if (args[1].equals("-")) {
            System.out.println(a - b);
        }
        
       
        //var str = Arrays.toString(args);
        //System.out.println(str);
    }
        */
    
    

