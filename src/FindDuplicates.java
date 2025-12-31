import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {

        String str = "programming";   // যে string থেকে ডুপ্লিকেট ক্যারেক্টার খুঁজবো
        Map<Character, Integer> map = new HashMap<>();   // প্রতিটি ক্যারেক্টারের কাউন্ট রাখবে

        // String টাকে character array তে convert করে এক একটা ক্যারেক্টার নিয়ে কাজ করছি
        for(char c : str.toCharArray()) {

            // map এ যদি আগেই থাকে তবে পুরনো কাউন্ট + 1
            // না থাকলে ডিফল্ট ভ্যালু 0 নিয়ে +1 করা হবে
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate Characters:");

        // map এর ভেতরের সকল entry (key-value pair) ঘুরবো
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            // যেসব ক্যারেক্টারের কাউন্ট 1 এর বেশি — মানে duplicate
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}

