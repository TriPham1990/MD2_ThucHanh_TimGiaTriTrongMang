import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên :");
        String tenSinhVien = scanner.nextLine();

        TimGiaTriTrongMang.kiemTraSinhVien(tenSinhVien);

    }
}
