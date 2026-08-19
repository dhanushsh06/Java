class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}
class Main{
    static void display(Student s){
        System.out.println("Name: "+s.name);
        System.out.println("Marks: "+s.marks);
    }
    public static void main(String[] args){
        Student s = new Student("Dhan",96);
        display(s);
    }
}