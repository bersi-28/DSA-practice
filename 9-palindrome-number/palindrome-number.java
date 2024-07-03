import java.util.Scanner;

public class Solution {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int reversed = 0;
        int original = x;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer within the range -231 <= x <= 231 - 1: ");
        int x = scanner.nextInt();
        
        boolean result = isPalindrome(x);
        
        System.out.println("Is the input integer a palindrome? " + result);
        
        scanner.close();
    }
}
  
    
