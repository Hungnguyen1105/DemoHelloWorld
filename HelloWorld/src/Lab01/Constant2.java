package Lab01;

public class Constant2 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWitdh = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWitdh * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        double Length = 20;
        double Width = 10;
        System.out.println(" S " + Length * Width  );
    }

}
