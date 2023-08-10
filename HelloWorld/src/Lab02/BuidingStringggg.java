package Lab02;

public class BuidingStringggg {
    public static void main(String[] args) {
        // khởi tạo đối tượng builder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        // append de them ki tu vao chuoi
        stringBuilder.append("Apdehanni");
        stringBuilder.append("How are you today");

        String ketqua = stringBuilder.toString();
        //chuyen doi chuoi stringbuidlder thanh chuoi thuong

        System.out.println(ketqua);
        // in ra man hinh

    }
}
