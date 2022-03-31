import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public String getReceipt() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("./src/receipt.txt"));
        double result = 0;

        while (scanner.hasNextLine()) {  //пока есть строка
            String[] productInfo = scanner.nextLine().split(";");
            result += Integer.parseInt(productInfo[1]) * Double.parseDouble(productInfo[2]);
        }

        return String.format(Locale.US, "%.2f", result);
    }
}

