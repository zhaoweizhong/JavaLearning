package Java2LabExercise.Lab1;

import java.io.*;
import java.util.ArrayList;

public class Tokenizer {
    public static String nextToken() {
        String text = "";
        try {
            ArrayList<String> textArray = read_txt(".\\input.txt");
            for (String textLine:textArray) {
                text = text + " " + textLine;
            }
        } catch (Exception e) {
            if (e.getMessage().equals("null")) {
                System.out.println("Source file is null.");
            } else if (e.getMessage().contains("found")) {
                System.out.println("File is not found.");
            } else {
                System.out.println("Sorry! Unknown Error.");
            }
        }
        text = text.replace(",","");
        text = text.replace(".", "");
        text = text.replace("'s","#s");
        text = text.replace("'d","#d");
        text = text.replace("'t","#t");
        text = text.replace("'","");
        text = text.replace("--"," ");
        text = text.replace(";","");
        text = text.replace("?","");
        text = text.replace("!","");
        text = text.replace(" ","-");
        text = text.replace("#","'");
        text = text.toLowerCase();
        write_txt(".\\output.txt",text);
        return null;
    }

    public static void write_txt(String txt_obj, String output) {
        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw
            /* 写入Txt文件 */
            File writename = new File(txt_obj/*".\\result\\en\\output.txt" */); // 相对路径，如果没有则要建立一个新的output.txt文件
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            out.write(output); // \r\n即为换行
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList read_txt(String txt_src) {
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