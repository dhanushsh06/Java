class Student{
    int marks;
    Student(int marks){
        this.marks = marks;
    }
}
class Main{
    static void compare(Student s1, Student s2){
        if(s1.marks > s2.marks){
            System.out.println("Student 1 marks is Greater than Student 2");
        }
        else if(s1.marks == s2.marks){
            System.out.println("Both Students Scored Same marks");
        }
        else{
            System.out.println("Student 12 marks is Greater than Student 1");
        }
    }
        public static void main(String[] args){
            Student a = new Student(98);
            Student b = new Student(95);
            compare(a, b);
        }
    
}