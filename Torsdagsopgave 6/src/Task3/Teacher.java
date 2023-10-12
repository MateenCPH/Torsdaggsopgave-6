package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    protected ArrayList<String> canTeach = new ArrayList<>();
    protected ArrayList<String> currentCourses = new ArrayList<>();
    protected String name;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.name = name;
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}
