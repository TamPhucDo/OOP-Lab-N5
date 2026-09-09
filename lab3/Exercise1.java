public class Exercise1 {

    

    /**
     * 1. Xóa phần tử đầu tiên có giá trị cho trước khỏi mảng.
     * Trả về true nếu xóa thành công, false nếu phần tử không tồn tại.
     * (Do mảng cố định kích thước, ta sẽ dịch các phần tử sang trái và gán phần tử cuối bằng 0).
     */
    public static boolean removeFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // Dịch các phần tử phía sau sang trái 1 vị trí
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0; // Gán phần tử cuối bằng 0
                return true;
            }
        }
        return false;
    }

    /**
     * 2. Chèn 1 phần tử vào vị trí cụ thể.
     * Các phần tử từ vị trí đó sẽ bị đẩy sang phải, phần tử cuối cùng cũ sẽ bị loại bỏ.
     */
    public static int[] insertElement(int[] arr, int element, int position) {
        if (position < 0 || position >= arr.length) {
            return arr; // Trả về mảng gốc nếu vị trí không hợp lệ
        }
        // Dịch phần tử sang phải bắt đầu từ cuối mảng
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = element;
        return arr;
    }

    /**
     * 3. Tìm các giá trị trùng lặp trong mảng số nguyên.
     */
    public static int[] findDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Kiểm tra xem phần tử này có xuất hiện lại ở phía sau không
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // Nếu là số trùng lặp, kiểm tra xem đã được thêm vào mảng kết quả chưa
            if (isDuplicate) {
                boolean alreadyAdded = false;
                for (int k = 0; k < count; k++) {
                    if (temp[k] == arr[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    temp[count++] = arr[i];
                }
            }
        }

        // Tạo mảng kết quả với kích thước chính xác
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    /**
     * 4. Xóa các giá trị trùng lặp khỏi mảng số nguyên (giữ lại 1 bản sao).
     */
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyAdded = false;
            // Kiểm tra phần tử đã có trong mảng kết quả tạm thời chưa
            for (int j = 0; j < count; j++) {
                if (temp[j] == arr[i]) {
                    alreadyAdded = true;
                    break;
                }
            }
            // Nếu chưa có thì thêm vào
            if (!alreadyAdded) {
                temp[count++] = arr[i];
            }
        }

        // Tạo mảng kết quả với kích thước chính xác (vừa đủ số lượng phần tử unique)
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    /**
     * Hàm tiện ích (helper function) để in mảng ra màn hình 
     * thay vì dùng Arrays.toString()
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }



    public static void main(String[] args) {
        // --- Test Câu 1 ---
        System.out.println("--- Task 1: Remove specific element ---");
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.print("Original arr1: ");
        printArray(arr1);
        boolean isRemoved = removeFirstOccurrence(arr1, 3);
        System.out.println("Removed 3? " + isRemoved);
        System.out.print("arr1 after removal: ");
        printArray(arr1); // Kỳ vọng: [1, 2, 4, 5, 0] (dịch trái, phần tử cuối gán bằng 0)

        // --- Test Câu 2 ---
        System.out.println("\n--- Task 2: Insert element ---");
        int[] arr2 = {1, 2, 4, 3};
        System.out.print("Original arr2: ");
        printArray(arr2);
        arr2 = insertElement(arr2, 5, 2);
        System.out.print("Inserted 5 at pos 2: ");
        printArray(arr2); // Kỳ vọng: [1, 2, 5, 4]

        // --- Test Câu 3 ---
        System.out.println("\n--- Task 3: Find duplicate values ---");
        int[] arr3 = {1, 3, 1, 3, 2, 4};
        System.out.print("Original arr3: ");
        printArray(arr3);
        int[] duplicates = findDuplicates(arr3);
        System.out.print("Duplicates: ");
        printArray(duplicates); // Kỳ vọng: [1, 3]

        // --- Test Câu 4 ---
        System.out.println("\n--- Task 4: Remove duplicate values ---");
        int[] arr4 = {1, 3, 1, 3, 2, 4};
        System.out.print("Original arr4: ");
        printArray(arr4);
        int[] uniqueArr = removeDuplicates(arr4);
        System.out.print("Without duplicates: ");
        printArray(uniqueArr); // Kỳ vọng: [1, 3, 2, 4]
    }
}