package java_files_and_java_io.practice_problems.buffered_reader_buffered_writer;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ananda.txt"))){
            bufferedWriter.write("Hello, I am Ananda Magar");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
