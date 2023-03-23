import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();

        // create some students
        ArrayList<String> passed = new ArrayList<String>();
        passed.add("Datamatiker");
        passed.add("multimedia design");
        Student s1 = new Student("Solomon Mwesigwa", passed);
        Student s2 = new Student("Maurice Katende", new ArrayList<String>());
        Student s3 = new Student("Hamza Elahi", new ArrayList<String>());
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);


        ArrayList<String> canTeach = new ArrayList<String>();
        passed.add("Datamatiker");
        passed.add("multimedia design");
        Teacher T1 = new Teacher("Evelyn Eriksen", canTeach);
        Teacher T2 = new Teacher("Kaya Holberg", canTeach);
        Teacher T3 = new Teacher("Leeland Uzumaki", new ArrayList<String>());
        persons.add(T1);
        persons.add(T2);
        persons.add(T3);
    }
   for()
}