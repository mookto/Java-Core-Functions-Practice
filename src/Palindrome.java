public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
//i-- প্রতিবার index কমাচ্ছে → 4 → 3 → 2 → 1 → 0 : reverse loop
     //"+=" i er value add kora rev er moddhe       
        if(str.equals(rev))
            System.out.println(str + " is Palindrome");
        else
            System.out.println(str + " is NOT Palindrome");
    }
}
