public class Fibonacci { //Fibonacci series-এ প্রতিটি নতুন number = আগের দুইটি number-এর যোগফল, এবং loop ব্যবহার করে series generate করা হয়।
    public static void main(String[] args) {

        int n = 10;    // Fibonacci series-এর কতটি number print করতে হবে
        int a = 0;     // series-এর প্রথম সংখ্যা
        int b = 1;     // series-এর দ্বিতীয় সংখ্যা

        // প্রথম দুটি number print করা হলো
        System.out.print(a + " " + b + " ");

        // loop start হচ্ছে index 2 থেকে, কারণ 0 এবং 1 already print করা হয়েছে
        for(int i = 2; i < n; i++) {

            int c = a + b;           // আগের দুটি number যোগ করে নতুন number তৈরি
            System.out.print(c + " "); // নতুন number print করা
            a = b;                   // a update করা হলো আগের b দিয়ে
            b = c;                   // b update করা হলো নতুন number c দিয়ে
        }
    }
}
