class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Main {

    static Student getStudent(String name, int marks) {
        return new Student(name, marks);
    }

    public static void main(String[] args) {

        Student s1 = getStudent("Dhanush", 90);

        System.out.println(s1.name);
        System.out.println(s1.marks);
    }
}