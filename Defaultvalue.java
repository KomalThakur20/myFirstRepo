public class Defaultvalue {
   
        int a;
        float b;
        char s;
        boolean d;
        String f;
        byte g;
        short r;
        long o;
        double h;

        void display ()
        {
            System.out.println(" Display default data type in java");
            System.out.println();
            System.out.println("Default value of int :" + (a));
            System.out.println("Default value of float :" + (b));
            System.out.println("Default value of char :" + (s));
            System.out.println("Default value of boolean :" + (d));
            System.out.println("Default value of String :" + (f));
            System.out.println("Default value of byte :" + (g));
            System.out.println("Default value of Short :" + (r));
            System.out.println("Default value of long :" + (o));
            System.out.println("Default value of double :" + (h));
            
        }
    public static void main(String args[]){
        Defaultvalue obj=new Defaultvalue();
        obj.display();
    }
    }

