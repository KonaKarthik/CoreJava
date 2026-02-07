public class Operators{
    public static void main(String[] args)
    {
        int a=10;
        int b=5;
        
        //Arithmetic operators
        System.out.println("The addition of two numbers is:"+(a+b));
        System.out.println("The substraction of two numbers is:"+(a-b));
        System.out.println("The multiplication of two numbers is:"+(a*b));
        System.out.println("The division of two numbers is:"+(a/b));
        System.out.println("The modulus of two numbers is:"+(a%b));
        
        // increment / decrement operators
        int c=10;
        int d=20;
        c++;
        d--;
        System.out.println("The new value after increment is "+c);
        System.out.println("The new value after decrement is "+d);
        
        //Compound assignment Operator
        int e=10;
        e=e+5; // 15
        System.out.println(e);
        int f=10;
        f+=5; //15
        f*=5; //15*5
        System.out.println(f);

        //Relational / Comparision operators
        int g = 10;
        int h = 20;
        System.out.println(g==h);
        System.out.println(g!=h);
        System.out.println(g>h);
        System.out.println(g<h);
        System.out.println(g>=h);
        System.out.println(g<=h);

        //Logical Operators
        int i=10;
        int j =12;
        int k=14;
        int l=5;
        System.out.println("Logical operatorrs:");
        System.out.println(i<j && i<k); //True
        System.out.println(i>j || i<k); //True
        System.out.println(!(i>l)); //False

        boolean result = (i < l);
        System.out.println(! result);//True
        
        //Bitwise Operators
        int m= 5;
        int n=3 ;

        System.out.println(m & n);
        System.out.println(m | n);
    }
}