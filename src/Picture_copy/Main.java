package Picture_copy;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("./src/Picture_copy/photo_2018-08-31_20-43-09.jpg");
            fileOutputStream = new FileOutputStream("./src/Picture_copy/copy_photo_2018-08-31_20-43-09.jpg");
            int temp;
            while ((temp = fileInputStream.read()) != -1) {
                fileOutputStream.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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