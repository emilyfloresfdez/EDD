package RECURSIVIDAD;

/* @author emily */
public class EJERCICIO4 
{
    public static void main(String[] args)
    {
        int n=10;
        System.out.println("N:     MISTERIO:  ");
        System.out.println(+n+"        " +misterio(n));
    }
    
    public static int misterio(int n)
    {
        if (n==1 || n==0)
            return n;
        else
            return 10*misterio(n/2)+n%2;
    }   
}
