package RECURSIVIDAD;

/* @author emily */

public class EJERCICIO5  
{
    public static void main(String[] args) 
    {
        int number=1111;
        System.out.println("NUMERO BINARIO = " +number);
        System.out.println("NUMERO DECIMAL = "+Decimal(number));
    }
    
    public static int Decimal(int number)
    {
        return Decimal(String.valueOf(number));
    }
    
    public static int Decimal(String Number)
    {
        if(Number.length() == 0)
        {
            return 0;
        }
        else
        {
            return ((int) Math.pow(2,Number.length()-1) * (Number.charAt(0)-48)) + Decimal(Number.substring(1));
        }
    }
}
