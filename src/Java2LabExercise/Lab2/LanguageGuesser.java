package Java2LabExercise.Lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

public class LanguageGuesser {
    private static String STOP_WORDS_DIR;
    public static void main(String[] args) {
        if (args[0].length() == 0) {
            System.out.println("Nothing Inputted.");
            System.exit(1);
        }
        if (!init()) {
            System.out.println("Config File Required.");
            System.exit(1);
        }
        ArrayList<String> langList = read_lang(new File(STOP_WORDS_DIR));
        ArrayList<String> resultName = new ArrayList<>();
        ArrayList<Integer> resultRank = new ArrayList<>();
        ArrayList<String> textArray = read_txt(args[0]);
        String text = "";
        for (String textLine:textArray) {
            text = text + " " + textLine;
        }
        for (int i = 0; i < langList.size(); i++) {
            ArrayList<String> lang = new ArrayList<>();
            //lang.add(langList.get(i));
            resultName.add(langList.get(i));
            int start = Integer.parseInt(langList.get(i + 1));
            int stop = Integer.parseInt(langList.get(i + 2));
            int j = start;
            while (true) {
                lang.add(langList.get(j));
                if (j == stop) {
                    i = stop + 1;
                    break;
                }
                j++;
            }
            int rank = 0;
            for (String str:lang) {
                rank = rank + getOccur(text, str);
            }
            resultRank.add(rank);
        }
        System.out.println(resultName.get(resultRank.indexOf(Collections.max(resultRank))));
    }

    private static boolean init() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./language.cnf"));
        } catch (Exception e) {
            return false;
        }
        STOP_WORDS_DIR = properties.getProperty("STOP_WORDS_DIR");
        return true;
    }

    private static ArrayList read_lang(final File folder) {
        ArrayList<String> langList = new ArrayList<>();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                read_lang(fileEntry);
            } else if (fileEntry.getName().endsWith(".txt")) {
                langList.add(fileEntry.getName().replace(".txt", ""));
                langList.add(String.valueOf(langList.size() + 2));
                langList.add(String.valueOf(read_txt(fileEntry.getPath()).size() + langList.size() - 1));
                langList.addAll(read_txt(fileEntry.getPath()));
            }
        }
        return langList;
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

    private static int getOccur(String src, String find){
        int o = 0;
        int index=-1;
        while((index=src.indexOf(find,index))>-1){
            ++index;
            ++o;
        }
        return o;
    }
}
