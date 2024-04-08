package java_files_and_java_io.java_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreation {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("C:\\Users\\anand\\Desktop\\PerScholasJava\\src\\java_files_and_java_io\\ananda\\ananda2.txt");

            if (Files.exists(p)){
                System.out.println("File already exists");
            }
            else {
                Files.createDirectories(p.getParent());
                Path p2 = Files.createFile(p);
                System.out.println("File has been created");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
