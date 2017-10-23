package Java2LabExercise.Lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class LanguageGuesser {
    private static String STOP_WORDS_DIR = null;
    public static void main(String[] args) {
        if (args[0].length() == 0) {
            System.out.println("Nothing Inputted.");
            System.exit(1);
        }
        if (!initialize()) {
            System.out.println("Config File Required.");
            System.exit(1);
        }

    }

    private static boolean initialize() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./language.cnf"));
        } catch (Exception e) {
            return false;
        }
        STOP_WORDS_DIR = properties.getProperty("STOP_WORDS_DIR");
        return true;
    }

    private static void read_lang(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                read_lang(fileEntry);
            } else if (fileEntry.getName().endsWith(".txt")) {
                read_txt(fileEntry.getPath());
            }
        }
    }

    private static ArrayList read_txt(String txt_src) {
        try {
            /* 读入TXT文件 */
            //String pathname = txt_src; "D:\\twitter\\13_9_6\\dataset\\en\\input.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
            File filename = new File(txt_src); // 要读取以上路径的input.txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line = "";
            line = br.readLine();
            ArrayList<String> text = new ArrayList<>();
            while (line != null) {
                text.add(line);
                line = br.readLine(); // 一次读入一行数据
            }
            return text;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
