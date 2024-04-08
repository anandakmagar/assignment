package java_files_and_java_io.guided_lab_reading_a_delimited_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Course {
    private String code, course_name, instructor_name;

    public Course(){

    }
    public Course(String code, String course_name, String instructor_name){
        this.code = code;
        this.course_name = course_name;
        this.instructor_name = instructor_name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
}

public class GuidedLab_Example2 {
    public static void main(String[] args) {
        try {
            String location = "C:\\Users\\anand\\Desktop\\PerScholasJava\\src\\java_files_and_java_io\\CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<Course> data = new ArrayList<>();

            while (input.hasNextLine()){
                String line = input.nextLine();
                String[] splitedString = line.split(",");

                Course course = new Course();
                course.setCode(splitedString[0]);
                course.setCourse_name(splitedString[1]);
                course.setInstructor_name(splitedString[2]);

                data.add(course);

                for (Course c : data){
                    System.out.println(c.getCode() + " | " + c.getCourse_name() + "|"
                            + c.getInstructor_name());
                    System.out.println("===============================");
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
