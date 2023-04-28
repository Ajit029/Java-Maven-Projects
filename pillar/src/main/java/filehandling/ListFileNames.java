package filehandling;

import java.io.File;

public class ListFileNames {
    public static void main(String[] argv) throws Exception
    {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File directory = new File("D:\\Programming\\Softwares");
  
        // store all names with same name
        // with/without extension
        String[] flist = directory.list();
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                System.out.println(filename);
                
            }
        }
    }
    
}
