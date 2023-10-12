package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> student1PassedCourses = new ArrayList<>();
        student1PassedCourses.add("Math");
        student1PassedCourses.add("History");
        student1PassedCourses.add("Java 1.0");
        Student student1 = new Student("Mateen", student1PassedCourses);
        persons.add(student1);

        ArrayList<String> student2PassedCourses = new ArrayList<>();
        student2PassedCourses.add("Math");
        student2PassedCourses.add("History");
        student2PassedCourses.add("Java 1.0");
        Student student2 = new Student("Rodney", student2PassedCourses);
        persons.add(student2);

        ArrayList<String> student3PassedCourses = new ArrayList<>();
        student3PassedCourses.add("Math");
        student3PassedCourses.add("History");
        student3PassedCourses.add("Java 1.0");
        Student student3 = new Student("Rebecca", student3PassedCourses);
        persons.add(student3);

        ArrayList<String> student4PassedCourses = new ArrayList<>();
        student4PassedCourses.add("Math");
        student4PassedCourses.add("History");
        student4PassedCourses.add("Java 1.0");
        Student student4 = new Student("Marcus", student4PassedCourses);
        persons.add(student4);

        ArrayList<String> student5PassedCourses = new ArrayList<>();
        student5PassedCourses.add("Math");
        student5PassedCourses.add("History");
        Student student5 = new Student("Matisse Pedersen Dubrail, Hagavej 9 Søborg, DTU Cyberteknolonørd fuldtids-autist\nsammenkobletmed ADHD anfald, neddroslede kognitive evner..", student5PassedCourses);
        persons.add(student5);

        ArrayList<String> teacher1CanTeach = new ArrayList<>();
        teacher1CanTeach.add("Math");
        teacher1CanTeach.add("History");
        teacher1CanTeach.add("Java 1.0");
        Teacher teacher1 = new Teacher("Signe", teacher1CanTeach);
        persons.add(teacher1);

        ArrayList<String> teacher2CanTeach = new ArrayList<>();
        teacher2CanTeach.add("Math");
        teacher2CanTeach.add("History");
        Teacher teacher2 = new Teacher("Tess", teacher2CanTeach);
        persons.add(teacher2);

        for (Person person : persons) { //Har fået hjælp fra chatgpt til denne metode men KUN ift instanceof
            boolean courseAdded = person.addCourse("Java 1.0");
            if (courseAdded) {
                System.out.println(person.getName() + " har fået tildelt kurset 'Java 1.0");
            } else {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette kursus");
                }
            }
        }
    }
}

