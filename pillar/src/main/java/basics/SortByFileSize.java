package basics;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class SortByFileSize {

    private static final String DIRECTORY_PATH = "E:\\"; // Enter directory path here
    private static final double CONSTRAINT = 1_073_741_824; // 1 GB
    public static void main(String[] args) {
        getFileSize(DIRECTORY_PATH);
    }

    public static void getFileSize(String path){
        File directory = new File(path);
        
        String[] flist = directory.list();

        for (int i = 0; i < flist.length; i++) {
            String fileName = flist[i];
            File filePath = new File(path + "\\\\" + flist[i]);
            long fileSize = FileUtils.sizeOf(filePath);
            String message = String.format("%s | %s MB", fileName, fileSize/1048576);
            if(fileSize >= CONSTRAINT){
                //System.out.println(fileName + " | " + fileSize/1_048_576 + " MB");
                System.out.println(message);
            }  
        }
        
    }

}
