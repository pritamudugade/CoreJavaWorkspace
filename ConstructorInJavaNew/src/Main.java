public class Main {
    public static void main(String[] args) {

            ConstructorEmployee obj = new ConstructorEmployee();
            System.out.println("------------------------------------------------------------------");
            ConstructorEmployee obj1 = new ConstructorEmployee(1,"Amit","Software Tester");
            ConstructorEmployee obj2 = new ConstructorEmployee(2,"Sunny","Senior Software Developer");
            System.out.println(obj1.getName()+ " is working as " +obj1.getDesignation() +", "+ "Having a employee id " +obj1.getEmpid()+ ".");
            System.out.println(obj2.getName()+ " is working as " +obj2.getDesignation() +", "+ "Having a employee id " +obj2.getEmpid()+ ".");
            System.out.println("------------------------------------------------------------------");
            ConstructorEmployee obj3 = new ConstructorEmployee(1,"ABC");
            System.out.println(obj3.getEmpid() +" And "+ obj3.getName());
    }
}