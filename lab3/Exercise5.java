public class Exercise5 {

    public static void main(String[] args) {
        String paragraph = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
        
        System.out.println("Original Paragraph:\n" + paragraph + "\n");
        
        String[][] wordFrequencies = countWordFrequency(paragraph);
        
        // In kết quả mảng 2 chiều
        System.out.println("Word Frequencies (Word - Count):");
        for (int i = 0; i < wordFrequencies.length; i++) {
            System.out.println("[" + wordFrequencies[i][0] + "] : " + wordFrequencies[i][1]);
        }
    }

    public static String[][] countWordFrequency(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return new String[0][0];
        }

        // 1. Làm sạch dữ liệu: Xóa các dấu câu (chỉ giữ lại chữ cái và khoảng trắng) và chuyển thành chữ thường
        String cleanText = paragraph.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        
        // 2. Tách thành mảng các từ
        String[] words = cleanText.split("\\s+");
        
        // Khởi tạo 2 mảng tạm để lưu từ độc nhất và số lần đếm tương ứng
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        // 3. Duyệt qua từng từ để đếm
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.isEmpty()) continue;

            boolean isFound = false;
            // Kiểm tra xem từ này đã có trong mảng uniqueWords chưa
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueWords[j].equals(currentWord)) {
                    counts[j]++; // Tăng biến đếm nếu đã tồn tại
                    isFound = true;
                    break;
                }
            }

            // Nếu chưa tồn tại, thêm từ mới vào mảng
            if (!isFound) {
                uniqueWords[uniqueCount] = currentWord;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // 4. Tạo mảng 2 chiều kết quả với kích thước chính xác
        // Cột 0: Chứa từ (String), Cột 1: Chứa số lần đếm (được ép kiểu sang String)
        String[][] result = new String[uniqueCount][2];
        for (int i = 0; i < uniqueCount; i++) {
            result[i][0] = uniqueWords[i];
            result[i][1] = String.valueOf(counts[i]);
        }

        return result;
    }
}