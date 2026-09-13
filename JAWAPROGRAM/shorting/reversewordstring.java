public class reversewordstring {
    public static void main(String[] args) {
        String str = "Hello Manish How Are You";
        String[] words = str.split(" ");
        String reversedString = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        
        System.out.println(reversedString.trim());
    }   
    
}
    