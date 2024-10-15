public class NoOfVowels {
    public static void main(String[] args) {
        String str = "i am divyanshu";
        int n = str.length();  
        int i = 0, count = 0;  

        while (i < n) {
            char ch = Character.toLowerCase(str.charAt(i));  // Handle case-insensitivity
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  count++;  
             i++;  
        }

        System.out.println("Total length of string: " + n);
        System.out.println("Number of Vowels: " + count);
    }
}
