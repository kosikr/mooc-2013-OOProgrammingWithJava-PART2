
public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.compareToIgnoreCase(o.getName()) > 0) {
            return 1;
        } else if (this.name.compareToIgnoreCase(o.getName()) == 0) {
            return 0;
        }
        return -1;

        /*
        return this.getName().compareTo(o.getName());
         */
    }

}
