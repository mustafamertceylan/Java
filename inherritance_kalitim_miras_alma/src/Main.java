
public class Main {
    public static void main(String[] args) {
    Employee employee=new Employee("mert",2000,"pc");
        employee.info();
    Manager manager =new Manager("murat",3000,"yazılım",100);
    manager.info();
    manager.risesalary(100);


    }
}