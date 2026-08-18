class StudentConstructor{
    String name;
    int age;

    StudentConstructor(String a,int b){
        this.name = a;
        this.age = b;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class ConstructorAndThisKeyword{
    public static void main(String[] args){
        StudentConstructor s1 = new StudentConstructor("Dhan", 21);
        StudentConstructor s2 = new StudentConstructor("xyz",20);
        s1.display();
        s2.display();
    }
}