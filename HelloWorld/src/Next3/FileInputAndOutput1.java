package Next3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputAndOutput1 {
    public static void main(String[] args) {
        try{
            String content = "Lbjgasdhjsafgdjasghdkgasjdg";
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Save filce seccusful");

        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Nội dung từ tệp: " + line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
