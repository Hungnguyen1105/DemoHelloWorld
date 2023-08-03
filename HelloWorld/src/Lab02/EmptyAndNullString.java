package Lab02;

public class EmptyAndNullString {
    public static void main(String[] args) {
        String emptyString= "Apdehanni";
        // Đoạn mã này khai báo một biến emptyString kiểu String và gán giá trị là empty string bằng cách đặt cặp dấu nháy kép liền nhau.

        System.out.println("Empty String: \"" + emptyString + "\"");

        // null String
        String nullableString = null;
        // Đoạn mã khai báo nullableString nhưng chua gắn giá trị thì mặc định no la rỗng
        System.out.println("Nullable String: " + nullableString);
        // In ra: Nullable String: null

        if (nullableString != null){
            /* su dung cau lenh if de ktra "nullableString" co gia tri kahc null khong
            neu "nullableString" kp la null se in ra do dai cua chuoi su dung phuong thuc length cua lop String
            */
            System.out.println("Do dai chuoi: "+ nullableString.length());
        }else {
            System.out.println("chuoi la null");
            /*
            Neu nullableString la null se in ra thong bao la chuoi null
            */
        }
        // Su dung toan tu ternany cung cap cap gia tri mac dinh cho chuoi null
        String result = nullableString != null ? nullableString: "chuoi mac dinh";
        System.out.println("Ket qua: \"" + result + "\"");

    }
}
