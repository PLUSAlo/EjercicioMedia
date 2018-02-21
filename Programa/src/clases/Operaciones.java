
package clases;

import java.util.Scanner;

/**
 *
 * @author Alondra Guerra Quintero
 */
public class Operaciones {
    static double media;
    static double desviacion;
    
    static double varianza;    
    static int numero;
    
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);//Clase para leer los valores de entrada
          System.out.println("¿Cuántos números?");
          numero = sc.nextInt();//Se lee la siguiente línea, donde establece de que tamaño va a ser el arreglo
          
          double numeros[] = new double[numero];//Se declara el arreglo del tamaño de la variable "numero"
          
          for(int i=0;i<numero;i++){//Ciclo definido por el tamaño del arreglo
              System.out.println("Ingrese número: "+(i+1)+":");//Se va a imprimir este texto indicando la inserción de cada número (del tamaño del arreglo)
              numeros[i] = sc.nextDouble();//Se inserta el número
          }
          
          double suma = 0;//Declaración de la variable suma
          for(double i : numeros){
              suma = suma+i;//Se va a ir incrementando la suma, de los valores dentro del for
          }
          media = suma/numero;//Se saca la media
          double redondeo = Math.rint(media*100)/100;//Se redondea la media
          System.out.println("Media: "+ redondeo);//Se imprime la media
          
          double rango;
          for(int i=0;i<numero;i++){//Ciclo por cada número del arreglo
              rango = Math.pow(numeros[i] - media,2);
              varianza = varianza + rango;
          }
          
          varianza = varianza / (numero-1);//Suma de diferencias sobre "n" o "n - 1"
          
          desviacion = Math.sqrt(varianza);//El valor de la desviación es la raíz cuadrada de "var"
          double redondeo2 = Math.rint(desviacion*100)/100;//Se redondea la desviación
          System.out.println("La desviación estandar es: "+redondeo2);//Se imprime la desviación
    }
}
