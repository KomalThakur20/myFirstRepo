

public class Multiclaases {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Komal";
        s1.rollno=02;
        Komal s2=new Komal();
        
        s1.display();

        
        s2.srm();

        


        
    }
    static class Student {
        String name;
        int rollno;
        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("Roll no. "+rollno);
        }

    
        

    
        
    }
    static class Komal {
        String sub1="English";
        String sub2="Hindi";
        void srm()
        {
            System.out.println("Subject 1: "+sub1);
            System.out.println("Subject 2: "+sub2);
        }
        
    }
}