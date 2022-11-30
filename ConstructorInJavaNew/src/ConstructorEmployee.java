public class ConstructorEmployee {  //Constructors are not inherited in Java. - As Class and method name are same so can't inherit in another class as child class is different.
    int empid;
    String name;
    String Designation;
    public ConstructorEmployee(){  // Default Constructor or no-arg Constructor.
        System.out.println("This is Default Constructor or you can say no-arg constructor.");
    }

    public ConstructorEmployee(int empid, String name, String designation){ //Parameterized Constructor.
        this.empid = empid;
        this.name = name;
        this.Designation = designation;
    }

    public ConstructorEmployee(int empid, String name){
        System.out.println("Message: Contructor with incomplete parameter. ");
        this.empid = empid;
        this.name = name;
    }
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
