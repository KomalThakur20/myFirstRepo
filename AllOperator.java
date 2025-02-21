public class AllOperator {

    public static void main(String[] args) {
        
// arthematic 
        
int a=2; int b=2;

System.out.println("All OPERATORS");
System.out.println();
System.out.println("arthematic" );
System.out.println();
System.out.println("Addition : "    +  (a + b));
System.out.println();
System.out.println("multiplication : "   +   (a * b));
System.out.println();
System.out.println("divition : "   +   (a / b));
System.out.println();
System.out.println("modulus : "   +   (a % b));
System.out.println();
System.out.println( "subtration :  "   +  (a - b));
System.out.println();
System.out.println();

// Realtion 

int x=4; int y=2;

System.out.println("Realation" );
System.out.println();
System.out.println("EQUAL:"  +(x==y));
System.out.println();
System.out.println("GRATER THAN :"  +(x>y));
System.out.println();
System.out.println("LESS THAN :" +(x<y));
System.out.println();
System.out.println("NOT EQUAL :" + (x!=y));
System.out.println();
System.out.println("GRATER THAN EQUAL :"  +(x>=y));
System.out.println();
System.out.println("lESS THAN EQUAL :" +(x<=y) );
System.out.println();
System.out.println();

// Bollean

boolean t = true, f = false;

System.out.println("Bollean");
System.out.println();
System.out.println( "AND :"  +(t&&f));
System.out.println();
System.out.println("OR :"   +(t||f));
System.out.println();
System.out.println("NOT :"  +(!t));
System.out.println();
System.out.println();

// assignment 

int d=1;

System.out.println("Assignment");
System.out.println();
System.out.println("ADD AND ASSIGN  :"+(d+=2));
System.out.println();
System.out.println( "SUBTRACTION AND ASSIGN :" +(d-=3));
System.out.println();
System.out.println("SIMPLE ASSIGN :" +(d=4));
System.out.println();
System.out.println("MULTIPLE AND ASSIGN :"+( d*=5));
System.out.println();
System.out.println("DIVIDE AND ASSIGN :" +(d/=6));
System.out.println();
System.out.println("modulus :" +(d%7));
System.out.println();
System.out.println();

//unary

int s=10;

System.out.println("UNARY");
System.out.println();
System.out.println("POSTIVE VLAUE :" +(+s));
System.out.println();
System.out.println("NAGETIVE VALUE " + (-s));
System.out.println();
System.out.println("INCREAMENT VALUE:" + (++s));
System.out.println();
System.out.println("DECREAMNET VALUE:" + (--s));
System.out.println();
System.out.println();


//BITWISE 

int h=2, n=20;

System.out.println();
System.out.println("BITWISE");
System.out.println();
System.out.println("AND :" +(h & n));
System.out.println();
System.out.println("OR : "+(h | n));
System.out.println();
System.out.println("Bitwise XOR : "+(h ^ n));
System.out.println();
System.out.println("LEFT SIDE : "+(h<<n));
System.out.println();
System.out.println("RIGHT SIDE : "+(h>>n));
System.out.println();
System.out.println("UNSIGN RIGHT SIDE : "+(h>>>n));
System.out.println();
System.out.println("BITWISE NOT : "+(~n));
System.out.println();
System.out.println("BITWISE NOT : "+(~h));
System.out.println();
System.out.println();

//TYPE CAST

double num=12.5;
System.out.println("TYPE CAST");
int castedNum = (int) num;
System.out.println();
System.out.println("Type Cast Operation:"+ (num));
System.out.println();
System.out.println("Casted value of num: " + castedNum);
System.out.println();
System.out.println();
    }
}