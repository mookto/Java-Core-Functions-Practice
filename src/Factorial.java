public class Factorial {
    public static void main(String[] args) {

        int n = 5;      // এখানে আমরা যে সংখ্যার factorial বের করব (n = 5)
        int fact = 1;   // factorial এর মান স্টোর করার জন্য ভ্যারিয়েবল (শুরুতে 1 ধরা হয়)

        // 1 থেকে n পর্যন্ত loop চলবে
        for(int i = 1; i <= n; i++) {

            fact *= i;  // fact = fact * i  (প্রতিবার fact এর সাথে বর্তমান i গুণ হবে)
        }

        // শেষ পর্যন্ত fact এ factorial এর মান পাওয়া যাবে
        System.out.println("Factorial: " + fact);
    }
}
