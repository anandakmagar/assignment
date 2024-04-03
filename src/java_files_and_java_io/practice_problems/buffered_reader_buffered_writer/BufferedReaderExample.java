package java_files_and_java_io.practice_problems.buffered_reader_buffered_writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("ananda.txt"))){
            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
