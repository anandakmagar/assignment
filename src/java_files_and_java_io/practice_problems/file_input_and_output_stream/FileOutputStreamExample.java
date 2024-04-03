package java_files_and_java_io.practice_problems.file_input_and_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("output.txt")){
            outputStream.write("Hello World".getBytes());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
