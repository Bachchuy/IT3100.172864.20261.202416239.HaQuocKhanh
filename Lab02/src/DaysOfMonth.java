import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int month = -1;
        //1.Nhập năm
        while (true) {
            System.out.print("Enter year (e.g., 1999): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    break;
                } else {
                    System.out.println("Invalid year! Please enter a non-negative number.");
                }
            } else {
                System.out.println("Invalid input! Please enter digits only.");
                scanner.next(); // Xóa bộ đệm nếu nhập ký tự chữ
            }
        }

        // 2. Nhập tháng
        while (true) {
            System.out.print("Enter month (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    break; // Nhập đúng từ 1-12 thì thoát vòng lặp tháng
                } else {
                    System.out.println("Invalid month! Please enter from 1 to 12.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number from 1 to 12.");
                scanner.next(); // Xóa bộ đệm
            }
        }

        // 3. Kiểm tra năm nhuận
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = 0;

        // 4. Xác định số ngày trong tháng
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
        }

        // 5. In kết quả
        System.out.println("Number of days in month " + month + "/" + year + " is: " + days);
        scanner.close();
    }
}