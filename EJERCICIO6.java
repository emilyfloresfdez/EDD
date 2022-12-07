package RECURSIVIDAD;

/* @author emily */

public class EJERCICIO6 
{
    public static void main(String[] args) 
    {
       int[]Arreglo = {2,3,4,5,6,7,8,9,10};
       System.out.println("Valor Minimo del Arreglo {2,3,4,5,6,7,8,9,10} es: "+ValorMinimo(Arreglo));
    }   
    
    public static int ValorMinimo(int [] Arreglo)
    {
        return ValorMinimo(Arreglo, 0, Integer.MAX_VALUE);
    }
    
    public static int ValorMinimo(int [] Arreglo, int pos, int min)
    {
        if(pos == Arreglo.length){
            return min;
        }
        if(Arreglo[pos]<min){
            min = Arreglo[pos];
        }
        return ValorMinimo(Arreglo, pos+1, min);
    }
}
