package Next3;

import java.util.Scanner;

public class ReadingInputt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khoi tao ham nhap tu ban phim
        System.out.println("What's your name ?");
        // in hoi ten
        String name = sc.nextLine();
        /* đoạn này đọc một dòng văn bản từ người dùng bằng cách sử dụng một đối tượng Scanner
        và sau đó lưu nội dung của dòng đó vào biến name kiểu dữ liệu String.
        */
        System.out.println("How old are you ?");
        int age = sc.nextInt();
        System.out.println("Hello, " + name + ". Next year. you'll be " + (age+1) );
        // nôí chuôĩ


    }
}
