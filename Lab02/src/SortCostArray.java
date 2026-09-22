import java.util.Arrays;
import java.util.Scanner;

public class SortCostArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số lượng phần tử của mảng
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        double[] my_array = new double[n];

        // 2. Nhập các giá trị phần tử (media costs)
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            my_array[i] = scanner.nextDouble();
        }

        // 3. Sắp xếp mảng tăng dần
        Arrays.sort(my_array);

        // 4. Tính tổng và giá trị trung bình
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += my_array[i];
        }
        double average = (n > 0) ? (sum / n) : 0;

        // 5. Hiển thị kết quả
        System.out.println("Sorted array: " + Arrays.toString(my_array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}