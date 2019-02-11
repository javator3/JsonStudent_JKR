package pl.sda.saveStudent;

import pl.sda.studentModel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class saveStudent {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList();

        students.add(new Student("Anna", "Nowak", 123));
        students.add(new Student("Stanisław", "Kowalski", 3456));
        students.add(new Student("Maria", "Wiśniewska", 789));


        ObjectMapper mapper = new ObjectMapper();
        File file = new File("students.json");

        try {
            mapper.writeValue(file,students);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
