public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 121;      // Original number
        int temp = num;     // Copy of original number (for processing)
        int rev = 0;        // Variable to store reversed number

        // Loop will run until temp becomes 0
        while (temp != 0) {
            rev = rev * 10 + temp % 10;   // Get last digit and build reverse number
            temp = temp / 10;             // Remove last digit from temp (121/10=12 is result )
        }

        // Compare original number and reversed number
        if (num == rev)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is NOT Palindrome");
    }
}
