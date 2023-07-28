package Lab02;

public class StringImmutable {
    public static void main(String[] args) {
        // example String are Immutable
        String orginalGreeting = "Hello";
        // gan gia tri ban dau cua chuoi la HElLO
        System.out.println("Original Greeting: " + orginalGreeting);
        //In ra man hinh cong voi chuoi
        orginalGreeting = changeString(orginalGreeting);
        // chuoi = chuoi thay doi ma khong thay doi chuoi ban dau String originalGreeting
        System.out.println("Modified Greeting: " + orginalGreeting);
        // chuoi da thay ma chuoi ban dau giu nguyen gia tri
    }
    public static String changeString(String input){
        input += " My Princess ";
        // cong them chuoi vao bien ban dau thi t khoi tao 1 ham moi la change String
        return input;
        // them My princess vao cuoi chuoi ma chuoi dau tien k thay doi
    }
}
