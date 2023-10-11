package Task3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name){
        super();
        passedCourses = new ArrayList<>();
        currentCourses = new ArrayList<>();
    }
}
