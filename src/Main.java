
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);


    // CASTEO Y OPERADORES
    public static int operacion1(){
        int x = (int) 5.89 + (int) 3.45;

        System.out.println("Casteo Ejercicio 1: " + x);
        return x;
    }

    public static int operacion2(){
        char c = 'A';
        int entero = (int)c;

        System.out.println("Casteo Ejercicio 2: " + entero);
        return entero;
    }

    public static int operacion3(){
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println("Casteo Ejercicio 3: " +i);
        return i;
    }

    public static int operacion4(){
        String text = "28";
        int number = Integer.parseInt(text);
        System.out.println("Casteo Ejercicio 4: " + number);
        return number;
    }

    public static  int operacion5(){
        int result = (int) (char) (byte) -1;
        System.out.println("Casteo Ejercicio 5: " + result);
        return result;
    }

    public static char operacion6(){
        int num = 65;
        char letter = (char)65;
        System.out.println("Casteo Ejercicio 6: " + letter);
        return letter;
    }

    /*Esto generara un error ya que LONG(64bits) no se puede asignar a un INT(32bits) debido a la posible
     * perdida de datos*/

    //   public static String operacion7(){
    //      long longValue = 123456789L;
    //      int value = longValue; // Esto causará un error de compilación
    //  }

    public static float operacion8(){
        float num2 = 300;
        String text2 = String.valueOf(num2);
        System.out.println("Casteo Ejercicio 8: " + num2);
        return num2;
    }

    public static int operacion9(){
        int x = (int) Math.round(3.7);
        System.out.println("Casteo Ejercicio 9: " +x);
        return x;
    }

    public static int operacion10(){
        byte b = 50;
        short a = (short)b;
        System.out.println("Casteo Ejercicio 10: " +a);
        return a;
    }

    //OPERADORES DE ASIGNACION

    public static int operacion11(){
        int x = 10;
        x += 5;
        System.out.println("Asignacion Ejercicio 1: " +x);
        return x;
    }

    public static int operacion12(){
        int y = 4;
        int x = 2;
        int resultado = y * (x + 5);
        System.out.println("Asignacion Ejercicio 2: " + resultado);
        return resultado;
    }

    public static int operacion13(){
        int a = 15;
        a %= 4;
        System.out.println("Asignacion Ejercicio 3: " +a);
        return a;
    }

    public static int operacion14(){
        int x = 12;
        int y = 3;
        int s = x += y;
        System.out.println("Asignacion Ejercicio 4: " +s);
        return s;
    }

    public static int operacion15(){
        int x = 4;
        int result = x ^= 2;
        System.out.println("Asignacion Ejercicio 5: " +result);
        return result;
    }

    //OPERADORES DE INCREMENTO Y DECREMENTO

    public static int operacion16(){
        int x = 5; int y = ++x;
        System.out.println("Incremento y Decremento Ejercicio 1: " +y);
        return y;
    }

    public static int operacion17(){
        int a = 5; System.out.println(a++); System.out.println(a);
        System.out.println("Incremento y Decremento Ejercicio 2: " +a);
        return a;
    }

    public static int operacion18(){

        for (int count = 5; count >= 1; count--){
            System.out.println("count = " + count);
        }
        return 0;
    }

    /* ++i (Pre-incremento): Se suele utilizar cuando necesitas el valor incrementado inmediatamente en la misma expresión.
    * int i = 5;
    int j = ++i; // i se incrementa a 6, y luego j toma el valor de 6
*/
    /* i++ (Post-incremento): Se usa cuando necesitas el valor actual antes de que se incremente.
    * int i = 5;
    int j = i++; // j toma el valor de 5, y luego i se incrementa a 6
*/

    public static int operacion19(){

        int i = 3;
        int a = ++i;// a es 4, i es 4
        int b = i++; // b es 4, i es 5
        return i;
    }

    public static int operacion20(){
        int x = 3; x = x++;
        System.out.println("Incremento y Decremento Ejercicio 5: " +x);
        return x;
    }

    //EJERCICIOS COMBINADOS

    public static int operacion21(){
        int i = 5;
        i += ++i + i++ + ++i;
        return i;
    }

    public static int operacion22(){
        double x = 2.34;
        int y = (int)x;
        y++;
        return y;
    }

    public static int operacion23(){
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);
        return i;
    }

    public static int operacion24(){
        int x = 10;
        double y = 0.0;

        y += (double) x / 2.0;

        System.out.println("Resultado después de la división: " + y);
        return 0;
    }

    public static int operacion25(){
        char c = 'X';
        c += 32;
        System.out.println(c);
        return 0;   //El char es retornado a 120 = "x";
    }

    public static int operacion26(){
        long x = 12345;
        short y = (short)x;

        System.out.println("Valor original del short: " + y);

        y *= 3;

        System.out.println("Valor después de la multiplicación: " + y);

        return y;
    }

    public static int operacion27(){
        int x = 10;
        x += (x++) + (++x);
        return x;
    }

    public static int operacion28(){
        float x = 23.23f;
        byte y = (byte)x;

        System.out.println("Valor original del byte: " + y);
        --y;
        System.out.println("Valor después del predecremento: " + y);
        return y;
    }

    public static int operacion29(){
        int i = 257;
        byte b = (byte)i;
        System.out.println(b);
        return b;
    }

    public static int operacion30(){
        double x = 10.75;
        int y = (int)x;

        y += 5;
        y ++;

        System.out.println("Resultado final: " + y);
        return y;
    }

}