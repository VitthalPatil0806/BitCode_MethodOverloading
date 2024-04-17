public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    // compileTime Polymorphism
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public void display(){
        System.out.println(id+" "+name);
    }
}
