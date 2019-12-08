package Picture_copy;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        File dir = new File("copied_picture");
        if (dir.mkdir()) {
        } else {
        }
        System.out.println(dir.getAbsolutePath());

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("E:\\BrainAcad\\brainAcad\\src\\Picture_copy\\photo_2018-08-31_20-43-09.jpg");
            fileOutputStream = new FileOutputStream("copied_picture/photo_2018-08-31_20-43-09.jpg");
            int temp;
            while ((temp = fileInputStream.read()) != -1) {
                fileOutputStream.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // метод для отладки
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}