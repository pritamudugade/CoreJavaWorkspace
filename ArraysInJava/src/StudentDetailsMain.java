public class StudentDetailsMain {
    public static void main(String[] args) {
        Student[] ob = new Student[6];

        ob[0] = new Student(1,"Amit","Physics",40);
        ob[1] = new Student(2,"Prasad","Physics",45);
        ob[2] = new Student(3,"Pooja","Physics",50);
        ob[3] = new Student(4,"Sunny","Physics",55);
        ob[4] = new Student(5,"Sachin","Physics",60);
        ob[5] = new Student(6,"Rohit","Physics",65);
        for (int i = 0; i < 6; i++) {
            System.out.println(ob[i].rollno + " " + ob[i].name + " " + ob[i].subject + " " + ob[i].marks);
        }
    }
}
