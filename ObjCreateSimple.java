public class ObjCreateSimple {
    int age;
    String name;

    public static void main(String[] args) {
        
        ObjCreateSimple stu=new ObjCreateSimple();
        stu.age=22;
        stu.name="Komal";
        System.out.println("Name: "+stu.name);
        System.out.println("Age: "+stu.age);
    }
}