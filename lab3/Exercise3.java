public class Exercise3 {

    public static void main(String[] args) {
        String name1 = "Nguyen Van Chien";
        String name2 = "Nguyen Thi Thu Thao";
        String name3 = "nguyen van chien";

        System.out.println("1. First and Last name of '" + name1 + "':");
        System.out.println("-> " + getFirstAndLastName(name1));

        System.out.println("\n2. Middle name of '" + name2 + "':");
        System.out.println("-> " + getMiddleName(name2));

        System.out.println("\n3. Capitalize full name of '" + name3 + "':");
        System.out.println("-> " + capitalizeFullName(name3));

        System.out.println("\n4. Vowels Uppercase, Consonants Lowercase of '" + name1 + "':");
        System.out.println("-> " + uppercaseVowelsLowercaseConsonants(name1));
    }

    /**
     * Trả về Từ đầu tiên (First/Last name) và Từ cuối cùng, bỏ qua tên đệm
     */
    public static String getFirstAndLastName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) return "";
        // Cắt chuỗi thành mảng các từ dựa trên khoảng trắng
        String[] words = fullName.trim().split("\\s+");
        
        if (words.length == 1) return words[0];
        
        return words[0] + " " + words[words.length - 1];
    }

    /**
     * Trả về phần tên đệm (Middle name)
     */
    public static String getMiddleName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) return "";
        String[] words = fullName.trim().split("\\s+");
        
        // Nếu tên chỉ có 1 hoặc 2 từ thì không có tên đệm
        if (words.length <= 2) return "";
        
        StringBuilder middleName = new StringBuilder();
        // Lấy từ vị trí số 1 đến vị trí áp chót
        for (int i = 1; i < words.length - 1; i++) {
            middleName.append(words[i]);
            if (i < words.length - 2) {
                middleName.append(" ");
            }
        }
        return middleName.toString();
    }

    /**
     * Viết hoa chữ cái đầu tiên của mỗi từ (Capitalize)
     */

    public static String capitalizeFullName(String s) {
        s=s.trim();
          String[] parts= s.split(" ");
          String result= new String();
          
          
          for (int i = 0; i < parts.length; i++) {
               if (!parts[i].isEmpty()){
               result += parts[i].substring(0, 1).toUpperCase()
                         + parts[i].substring(1).toLowerCase()
                         + " ";
               }
          }
          return result.trim();
    }

    /**
     * Viết hoa tất cả Nguyên âm (Vowels: a, e, i, o, u) và viết thường Phụ âm (Consonants)
     */
    public static String uppercaseVowelsLowercaseConsonants(String fullName) {
        if (fullName == null) {
            return "";
        }

        String result = "";

        for (int i = 0; i < fullName.length(); i++) {
            char c = fullName.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result += Character.toUpperCase(c);
            } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                result += c;
            } else if (Character.isLetter(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += c;
            }
        }

        return result;
    }
}