import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator +"Users" +separator+ "admin" +separator+ "Desktop" +separator+ "test";
        File file = new File(path);

        Scanner iScanner = new Scanner(file);
        while (iScanner.hasNextLine()) {
            System.out.println(iScanner.nextLine());
        }
        iScanner.close();

    }
}
