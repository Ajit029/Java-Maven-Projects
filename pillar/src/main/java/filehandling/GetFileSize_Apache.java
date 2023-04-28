package filehandling;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class GetFileSize_Apache {
        private static final String FILE_PATH = "D:\\Programming\\Softwares\\rustup-init.exe";
    
        public static void main(String[] args) {
            File file = new File(FILE_PATH);
    
            long fileSize = FileUtils.sizeOf(file);
    
            System.out.println(fileSize/1e+6 + " MB");
        }
    
}
