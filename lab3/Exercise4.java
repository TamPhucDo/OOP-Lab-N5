public class Exercise4 {

    public static void main(String[] args) {
        String testString = "Hello world from Java";
        String strToConcat = " - Programming is fun!";
        String palindromeStr = "Racecar"; // Từ đọc ngược xuôi đều giống nhau

        // 1. Find the length of the string
        System.out.println("1. Length of '" + testString + "': " + getStringLength(testString));

        // 2. Count the number of words
        System.out.println("2. Number of words in '" + testString + "': " + countWords(testString));

        // 3. Concatenate strings
        System.out.println("3. Concatenation result: " + concatenateStrings(testString, strToConcat));

        // 4. Check palindrome
        System.out.println("4. Is '" + palindromeStr + "' a palindrome? " + isPalindrome(palindromeStr));
        System.out.println("   Is '" + testString + "' a palindrome? " + isPalindrome(testString));
    }

    // 1. Hàm đếm độ dài chuỗi
    public static int getStringLength(String str) {
        if (str == null) return 0;
        return str.length();
    }

    // 2. Hàm đếm số lượng từ trong chuỗi
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        // Tách chuỗi dựa trên khoảng trắng
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // 3. Hàm nối 2 chuỗi
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null) str1 = "";
        if (str2 == null) str2 = "";
        // Có thể dùng str1.concat(str2) hoặc toán tử +
        return str1 + str2; 
    }

    // 4. Hàm kiểm tra chuỗi Palindrome (đọc ngược/xuôi giống nhau)
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        // Bỏ qua phân biệt hoa thường để kiểm tra chính xác hơn
        String lowerStr = str.toLowerCase(); 
        int left = 0;
        int right = lowerStr.length() - 1;

        while (left < right) {
            if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}