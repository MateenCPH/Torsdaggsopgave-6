package Task3;

import java.util.ArrayList;

public class Teacher extends Person{
ArrayList<String> canTeach = new ArrayList<>();
ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name){
        super();
        canTeach = new ArrayList<>();
        currentCourses = new ArrayList<>();
    }
}
