public class TimGiaTriTrongMang {
    public static void kiemTraSinhVien(String tenSinhVien) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean check = false;
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(tenSinhVien)) {
                index = i;
                check = true;
            }
        }

        if (check) {
            System.out.println("Vị trí của sinh vien : " + index);
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }
}
