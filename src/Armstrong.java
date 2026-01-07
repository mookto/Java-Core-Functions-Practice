public class Armstrong {
    //কোনো ৩ অঙ্কের সংখ্যার প্রতিটি digit-এর cube (³) এর যোগফল যদি সংখ্যাটির সমান হয় তাহলে সেটিকে Armstrong Number বলে।
// যেমন:
// 153
// = 1³ + 5³ + 3³
// = 1 + 125 + 27
// = 153 ✔
// তাই 153 একটি Armstrong Number
    public static void main(String[] args) {

        int num = 153;      // যেই সংখ্যাটা চেক করব
        int sum = 0;        // digit cube এর যোগফল রাখবে
        int temp = num;     // num এর কপি (temp দিয়ে হিসাব করব)

        // temp যতক্ষণ 0 না হয় ততক্ষণ লুপ চলবে
        while(temp != 0) {

            int digit = temp % 10;  // শেষ digit বের করি (ex: 153 -> 3)

            sum += digit * digit * digit; // digit এর cube করে যোগ করি

            temp /= 10;   // temp কে 10 দিয়ে ভাগ দিয়ে শেষ digit বাদ দেই (153 -> 15)
        }

        // cube এর যোগফল num এর সমান হলে এটা Armstrong number
        if(sum == num)
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is NOT Armstrong");
    }
}
