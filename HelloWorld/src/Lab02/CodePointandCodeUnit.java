package Lab02;

public class CodePointandCodeUnit {
    public static void main(String[] args) {
                // Code Point example
                String text = "Apdehanni AhnPhuong";
                int codePointCount = text.codePointCount(0, text.length());

                System.out.println("Text: " + text);
                System.out.println("Code Point Count: " + codePointCount);

                // Code Unit example
                char[] charArray = text.toCharArray();
                int codeUnitCount = charArray.length;

                System.out.println("Text: " + text);
                System.out.println("Code Unit Count: " + codeUnitCount);
        /* sử dụng phương thức codePointCount(int beginIndex, int endIndex) để đếm số lượng code point trong một chuỗi text.
        Phương thức này sẽ đếm số lượng code point trong khoảng từ vị trí beginIndex (bao gồm) đến endIndex (không bao gồm */




    }
}
