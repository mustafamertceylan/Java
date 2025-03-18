public class Employee {
    private String name;
    private int salary;
    private String departman;

    public Employee(String name,int salary,String departman){
        this.name=name;
        this.salary=salary;
        this.departman=departman;
    }


    public void info(){
        System.out.println(this.name);
        System.out.println(this.departman);
        System.out.println(this.salary);
    }
}

