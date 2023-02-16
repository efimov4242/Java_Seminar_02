import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        String test = test100();
        createWriteFile(test);
    }

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    public static String getStringRepeat() {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        while (n % 2 != 0 || n <= 0) {
            System.out.println("Введите четное число!");
            n = iScanner.nextInt();
        }
        iScanner.close();
        StringBuilder sb = new StringBuilder("c1");
        sb.append("c2");
        return (sb.toString().repeat(n));
    }

//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.
    void getCountChar() {
        var s1 = "aaaabbbcdd";
        StringBuilder s2 = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s1.length(); i++) {
            var temp = s1.charAt(i - 1);
            if (temp == s1.charAt(i)) {
                count++;
            } else {
                s2.append(count);
                s2.append(temp);
                count = 1;
            }
            if (i == s1.length() - 1) {
                s2.append(count);
                s2.append(s1.charAt(i));
            }
        }
        System.out.println(s2);
    }


//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
//(возвращает boolean значение).
    static boolean isPalindrom(String str) {
        str = str.toLowerCase();
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            a += str.charAt(i);
        }
        if (str == a) {
            return true;
        } else {
            return false;
        }
    }


//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту
// строку в простой текстовый файл, обработайте исключения.
    static String test100() {  //Метод, который составит строку, состоящую из 100 повторений слова TEST и метод
        StringBuilder test = new StringBuilder("TEST");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append(test.toString());
        }
        return str.toString();
    }

    static void createWriteFile(String str) { //метод, который запишет строку в простой текстовый файл, обработайте исключения.
        try(FileWriter writer = new FileWriter("newFile")) {
            writer.write(str);
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        {
            System.out.println("finally");
        }
    }

//   Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//   Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//   Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

    String startDir = System.getProperty("user.dir");
    public static String[] getDirArr(String dirPath) {
        try {
            String pathProject = System.getProperty("user.dir");
            File dir = new File(pathProject);
            String[] allFiles = dir.list();
            return  allFiles;
        } catch (Exception e) {

        }
        return new String[0];
    }

}


