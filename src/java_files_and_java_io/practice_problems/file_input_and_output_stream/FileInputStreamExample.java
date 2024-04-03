package java_files_and_java_io.practice_problems.file_input_and_output_stream;

import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try(InputStream inputStream = new FileInputStream("output.txt")){
            int data = inputStream.read();

            while (data != -1){
                System.out.println((char) data);
                data = inputStream.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
