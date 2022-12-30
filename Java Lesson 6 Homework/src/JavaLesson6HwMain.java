import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.Deflater;

public class JavaLesson6HwMain {
    public static void main(String[] args) throws IOException {
        String filePath = "\\C:\\Users\\Owner\\Downloads\\Players.csv";
        try {
            Scanner scanFile = new Scanner(new File(filePath));
            scanFile.useDelimiter(",");
            ArrayList<String> fileCells = new ArrayList<>();
            while (scanFile.hasNext()){
                fileCells.add(scanFile.next());
            }
            System.out.println("Id: "+fileCells.get(1).substring(7));
            System.out.println("Level: "+fileCells.get(2).substring(0,1));
            System.out.println("Id: "+fileCells.get(2).substring(3));
            System.out.println("Level: "+fileCells.get(3).substring(0,1));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        FileWriter fileToArchive = new FileWriter("\\C:\\Users\\Owner\\Downloads\\PlayersArchived.csv",true);
        BufferedWriter bw = new BufferedWriter(fileToArchive);
        for (int i=0; i<10; i++) {
            bw.write("Efi " + i);
            bw.newLine();
            bw.close();
        }

    }
    public static byte[] compress(byte[] data, int compressionLevel,boolean format) throws IOException {

        Deflater deflater = new Deflater(compressionLevel, format);
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        byte[] buff = new byte[1024];
        int count = 0;

        while (!deflater.finished()) {
            count = deflater.deflate(buff);
            if (count > 0)
                baout.write(buff, 0, count);
        }
        deflater.end();
        return baout.toByteArray();
    }
}
