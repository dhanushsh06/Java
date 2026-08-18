class Calculator{
void add(int a,int b){
    System.out.println("Sum: "+(a + b));
}
void multi(int a,int b){
    System.out.println("Multi: "+(a * b));
}
void sub(int a,int b){
    System.out.println("Subtraction: "+(a - b));
}
void div(float a,float b){
    System.out.println("Division: "+(a/b));
}
}

class MethodOverloading{

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(14,7);
        c.multi(14,7);
        c.sub(14,7);
        c.div(14,7);
    }
}