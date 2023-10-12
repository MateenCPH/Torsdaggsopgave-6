package Task3;

import java.util.ArrayList;

public class Student extends Person {

    protected ArrayList<String> passedCourses = new ArrayList<>();
    protected ArrayList<String> currentCourses = new ArrayList<>();
    protected String name;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.name = name;
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }


}
