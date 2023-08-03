package Lab02;

public class TheStringAPI1 {
    public static void main(String[] args) {
        // API length() and CharAt(index) do dai cua chuoi mang
        String text = "Apd e ha n n i";
        int length = text.length();
        char firstChar = text.charAt(0);
        //xet từ kí tự đầu tiên
        char lastChar = text.charAt(text.length() - 1);
        // ký tự cuối cugnf của chuỗi

        System.out.println("Length: " + length);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: "+ lastChar);
        System.out.println("_____________");

        // substring (beginIndex. endIndex) lay1 chuoi ki tu
        String text1 = " Hello , Apdehanni";
        String subString = text1.substring(1, 10); // lay 1 phan chuoi tu 1->10
        System.out.println("Substring: " + subString); // in ra ket qua
        System.out.println("_________________");

        // concat(str) noi chuoi
        String firstname = "Quynh";
        String lastname = " Tung Tung";
        String fullname = firstname.concat(" ").concat(lastname);// noi hai chuoi lai voi nhau
        System.out.println("Full name: " + fullname);
        System.out.println("------------------");

        // Split (regex) tách chuỗi thành mảng

        String text2 = "co thuan nguyen,quynh tung tung,co nga ";
        String[] names = text2.split(",");
        // tách chuỗi thành mảng các chuỗi con bằng dấu "."
        for (String name: names){
            // dung vong lap for de duyet cac phan tu trong mang
            System.out.println(name);
            //in ra chuoi con o man hinh

        }
        System.out.println("_______________");

        //replace (oldChar, newChar) thay thế kí tự

        String text3 = "Hung Nguyen";
        String newText = text3.replace("u" , "t");
        // thay the ki tu
        System.out.println("New Text: " + newText);
        System.out.println("____________");

        // toLowerCase() and toUpperCase() chuyen doi ki tu in thuong sang in hoa

        String text4 = "APDEHANNI , HUNG NGUYEN";
        String text5 = "wua su way xing";
        String lowerCase = text4.toLowerCase(); // doi sang in thuong
        String upperCase = text5.toUpperCase();// doi sang in hoa
        System.out.println("Lower Text: " + lowerCase); // ket qua la chu in thuong
        System.out.println("Upper Text: " +  upperCase);// ket la chu hoa
        System.out.println("___________");

        // trim () phuong thuc xoa khoang trang

        String text6 = "         ThuanThiAlo       ";
        String trimmedtext =text6.trim(); // xoa khoang trang cua chuoi
        System.out.println("Trimmed: " + trimmedtext);
        System.out.println("___________");
        System.out.println("Nhung tinh nag co ban cua API");



    }
}
