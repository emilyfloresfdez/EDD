package RECURSIVIDAD;

/* @author emily */
public class EJERCICIO2 
{
    public static void main(String[] args) 
    {
        System.out.println("NUMERO: |3154|   NUMERO MINIMO: |" + getMinDigit(3154)+"|");
    }

    public static int getMinDigit(int num)
    {
        return getMinDigit(String.valueOf(num),Integer.MAX_VALUE);
    }
    public static int getMinDigit(String str, int mn)
    {
        if(str.length() == 0)
        {
            return mn;
        }
        char frst = str.charAt(0);
        int digit = (int) frst - 48;
        if(digit<mn)
        {
            return getMinDigit(str.substring(1, str.length()),digit);
        }
        else
        {
            return getMinDigit(str.substring(1, str.length()),mn);
        }
    }
}
