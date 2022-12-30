import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMain {

    public static void main(String[] args) {

        String path = "C:\\Users\\Owner\\Downloads\\Players.csv";
        String path2 = "C:\\Users\\Owner\\Downloads\\Setup_IP4[10_100_102_6]_H[NPI929E2A].exe";
        String zipPath = "C:\\Users\\Owner\\Downloads\\PlayersZipped.zip";
        String zipPath2 = "C:\\Users\\Owner\\Downloads\\Setup_IP4[10_100_102_6]_H[NPI929E2A].zip";
        File file = new File(path);
        File file2 = new File(path2);
        zipSingleFile(file2,zipPath2);
    }
    private static void zipSingleFile(File file, String zipFileName) {
        try {
            //create ZipOutputStream to write to the zip file
            FileOutputStream fos = new FileOutputStream(zipFileName);
            ZipOutputStream zos = new ZipOutputStream(fos);
            //add a new Zip Entry to the ZipOutputStream
            ZipEntry ze = new ZipEntry(file.getName());
            zos.putNextEntry(ze);
            //read the file and write to ZipOutputStream
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }

            //Close the zip entry to write to zip file
            zos.closeEntry();
            //Close resources
            zos.close();
            fis.close();
            fos.close();
            System.out.println(file.getCanonicalPath()+" is zipped to "+zipFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
