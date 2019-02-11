package pl.sda.readStudent;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentModel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ReadStudent {

    public static void main(String[] args) {


        ObjectMapper mapper = new ObjectMapper();
        File file = new  File ("students.jason");


        Student[]students = new Student[0];
        try {
            students = mapper.readValue(file, Student[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student>studentList = Arrays.asList(students);
        System.out.println(studentList);
        List<Student>startsWithA = studentList
                .stream()
                .filter(s -> s.getName().startsWith("A"))
                .collect(Collectors.toList());
        startsWithA.forEach(System.out::println);



    }




}
