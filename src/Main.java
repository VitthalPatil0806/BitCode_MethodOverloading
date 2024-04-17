//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(78,"abc");
        int res = emp.add(12,43,54);
        int res1 = emp.add(10,20);
        System.out.println(res);
        System.out.println(res1);
    }
}