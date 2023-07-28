package Lab02;

public class TestingStringForEquality {
    public static void main(String[] args) {
        String str1 = "Apdehanni";
        String str2 = "Apdehanni";
        String str3 = "Princess";
        //gan 3 gia tri

        System.out.println("1:");
        // vi du 1
        System.out.println("str1 equals str2 "+ str1.equals(str2));
        // check str1 cos bawng str2 khong va phuong thuc equals tra ve dung hoac sai

        System.out.println("str1 equals str3 " + str1.equals(str3));
        // check str1 co bang str3 hay k

        System.out.println("2:");

        String str4 = "Hello";
        String str5 = "hello";
        // gan 2 gia tri
        System.out.println("str4 equals str5 " + str4.equalsIgnoreCase(str5));
        // check str4 co bang str5 hay khong phunog thuc equalsIgnoreCase dung de so sánh tính đồng nhất giữa hai chuỗi mà không phân biệt hoa thường
        // va day la 2 su khac biet vi equals and equalsIgnoreCase



    }
}
