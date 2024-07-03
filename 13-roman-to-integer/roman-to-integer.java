
 import java.util.Scanner;
public class Solution {


    public static int romanToInt(String s) {
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && charToInt(s.charAt(i)) > charToInt(s.charAt(i - 1))) {
                result += charToInt(s.charAt(i)) - 2 * charToInt(s.charAt(i - 1));
            } else {
                result += charToInt(s.charAt(i));
            }
        }
        
        return result;
    }
    
    public static int charToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        
        int result = romanToInt(romanNumeral);
        
        System.out.println("The integer value of the Roman numeral is: " + result);
        
        scanner.close();
    }
}
  
    
