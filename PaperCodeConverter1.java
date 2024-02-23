import java.util.Scanner;

public class PaperCodeConverter1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the binary paper code: ");
        String binaryCode = input.nextLine();
        
        if (binaryCode.length() != 8 || !binaryCode.matches("[01]+")) {
            System.out.println("INVALID PAPER CODE");
        } else {
            int decimalCode = Integer.parseInt(binaryCode, 2);
            if (decimalCode >= 1 && decimalCode <= 26) {
                char charCode = (char) (decimalCode + 'A' - 1);
                System.out.println("The character paper code is: " + charCode);
            } else {
                System.out.println("INVALID PAPER CODE");
            }
        }
        
        input.close();
    }

}
