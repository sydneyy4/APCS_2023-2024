public class Fibonacci
{
    public static void main (String[] args){
        int a = 0, b = 1, c;
        //print out first two terms, 0 and 1
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 15; i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        //make print 0 and 1
    }
}