import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;


public class ReadAndWrite {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Owner\\Desktop\\1.txt";


        for (int i=0;i<10;i++){
            //Files.write(Paths.get(filePath), ("hello " + i+ lineSep).getBytes(), StandardOpenOption.APPEND);
            //Files.writeString(Paths.get(filePath), "hello " + i+ lineSep);
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Spain "+i);
            bw.newLine();
            bw.close();
            try {
                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                System.out.println(content);
            } catch (NoSuchFileException e){
                System.out.println("hey efi");
            }

        }
        File file = new File(filePath);
        file.delete();
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println(content);
        } catch (NoSuchFileException e){
            System.out.println("hey efi");
        }




    }
}
