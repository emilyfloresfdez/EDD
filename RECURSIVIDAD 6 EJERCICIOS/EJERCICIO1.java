package RECURSIVIDAD;

/* @author emily */
public class EJERCICIO1 
{   
    public static void main(String[] args)
    {
        int a =18, b=12;
        System.out.println("PARAMETROS:     RETORNO:  ");
        System.out.println(" "+a+" , "+b+"           " + MCD(a,b));
    }
    
    static int MCD(int a,int b)
    {
        if(b==0)
            return a;
        else
            return MCD(b,a%b);
    }
}
