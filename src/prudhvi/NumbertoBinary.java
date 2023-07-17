package prudhvi;

//Assignment5
public class NumbertoBinary {
    public static void main(String arg[]) {

        int num = 9;
        String bin = Integer.toBinaryString(num);
        System.out.println(bin);

        String binary = String.valueOf(101011);
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
    }
}