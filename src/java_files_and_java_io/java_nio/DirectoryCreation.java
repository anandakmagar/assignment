package java_files_and_java_io.java_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCreation {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("C:\\Users\\anand\\Desktop\\PerScholasJava\\src\\java_files_and_java_io\\ananda");

            if (Files.exists(path)){
                System.out.println("File already exists");
            }
            else {
                Path path2 = Files.createDirectories(path);
                System.out.println("File has been created at " + path2.toString());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
