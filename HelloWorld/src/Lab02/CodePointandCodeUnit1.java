package Lab02;

public class CodePointandCodeUnit1 {
    public static void main(String[] args) {
                // Code Point example
                String text = "Apdehanni AhnPhuong Hoang Nam";
                //khai bao 1 biên text kiểu chuôi gắn theo chuỗi kí tực
                int codePointCount = text.codePointCount(0, text.length());
                //đoạn code tính toán số lượng điểm mã (code points) trong chuỗi

                System.out.println("Text: " + text);
                // in ra màn hình chuỗi
                System.out.println("Code Point Count: " + codePointCount);
                //Đoạn code này in ra màn hình số lượng điểm mã tính được ở bước trước

                // Code Unit example
                char[] charArray = text.toCharArray();
                // doan code này chuyển đổi chuỗi thanh mảng kí tự char array
                int codeUnitCount = charArray.length;
                // đoạn code này tính toán số lượng trong đơn vị mã trong mảng char Array

                System.out.println("Text: " + text);
                // in ra màn hính 1 lần nx
                System.out.println("Code Unit Count: " + codeUnitCount);
                // in ra số lượng đơn vị mã được tính toán bước trc
        // đây là 2 vị dụ về CodePoints và Code Units

    }
}
