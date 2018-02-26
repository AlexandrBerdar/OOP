package lesson5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {


    public static void main(String[] args) {
        String fileName = "/Users/alexandrberdar/IdeaProjects/JavaOOP/txt/1.txt";
        try (FileInputStream file = new FileInputStream(fileName)){
            byte[] buffer = new byte[1024];
            int read = 0;
            byte[] out;
            while ((read = file.read(buffer)) > 0){
                out = new byte[read];
                System.arraycopy(buffer,0,out,0,read);
                String output = new String(out, "cp1251");
                System.out.println(output);

            }

        }catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
