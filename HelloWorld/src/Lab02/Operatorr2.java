package Lab02;

public class Operatorr2 {
    public static void main(String[] args) {
        //sử dụng toán tử tiền tố và hậu tố để tăng giá trị của biến m và n sau khi thực hiện phép gán.
        int m = 7;
        int n = 7;
        int a = 2 * ++m; // ở đây tăng giá trị của biến m lên 1 trước khi thực hiện phép gán, sau đó thực hiện phép nhân với 2.
        int b = 2 * n++;  /*ở đây toán tử hậu tố n++ trả về giá trị của n trước khi thực hiện việc tăng n lên 1.
         suy ra giá trị của n trong phép nhân 2 * n++ vẫn là 7, và sau đó n mới được tăng lên thành */
        System.out.println(m);
        System.out.println(n);
        System.out.println(a);
        System.out.println(b);
        // print screen
    }

}
