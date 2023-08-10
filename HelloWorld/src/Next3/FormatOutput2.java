package Next3;

public class FormatOutput2 {
    public static void main(String[] args) {
        String productName = "So Mi Roway";
        double price = 99.000;
        int quantity = 10;
        String output = String.format("Sản phẩm: %s\nGiá: %.2f\nSố lượng: %d", productName, price, quantity);
        // Trong chuỗi định dạng, %s, %f và %d là các chỉ thị định dạng cho chuỗi, số thực và số nguyên tương ứng.
        //%f được sử dụng với .2 để chỉ định rằng giá trị số thực sẽ được làm tròn đến 2 chữ số sau dấu thập phân.
        System.out.println(output);

    }

}
