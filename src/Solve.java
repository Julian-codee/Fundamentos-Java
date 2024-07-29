import java.util.Scanner;

public class Solve {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{

            String message = "\n\nElige un Menu:\n\n";
            message += "1. Casteo\n";
            message += "2. Casteo \n";
            message += "3. Casteo \n";
            message += "4. Casteo \n";
            message += "5. Casteo \n";
            message += "6. Casteo \n";
            message += "7. Casteo\n";
            message += "8. Casteo\n";
            message += "9. Casteo\n";
            message += "10. Casteo\n\n";
            message += "11. Operadores de Asignación \n";
            message += "12. Operadores de Asignación \n";
            message += "13. Operadores de Asignación\n";
            message += "14. Operadores de Asignación\n";
            message += "15. Operadores de Asignación\n\n";
            message += "16. Operadores de Incremento y Decremento\n";
            message += "17. Operadores de Incremento y Decremento\n";
            message += "18. Operadores de Incremento y Decremento\n";
            message += "19. Operadores de Incremento y Decremento\n";
            message += "20. Operadores de Incremento y Decremento\n\n";
            message += "21. Ejercicios Combinados\n";
            message += "22. Ejercicios Combinados\n";
            message += "23. Ejercicios Combinados\n";
            message += "24. Ejercicios Combinados\n";
            message += "25. Ejercicios Combinados\n";
            message += "26. Ejercicios Combinados\n";
            message += "27. Ejercicios Combinados\n";
            message += "28. Ejercicios Combinados\n";
            message += "29. Ejercicios Combinados\n";
            message += "30. Ejercicios Combinados\n\n";
            message += "31. Salir..\n\n";

            System.out.println(message);

            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println(Main.operacion1());
                    break;
                case 2:
                    System.out.println( Main.operacion2());
                    break;
                case 3:
                    System.out.println( Main.operacion3());
                    break;
                case 4:
                    System.out.println( Main.operacion4());
                    break;
                case 5:
                    System.out.println( Main.operacion5());
                    break;
                case 6:
                    System.out.println( Main.operacion6());
                    break;
                case 8:
                    System.out.println( Main.operacion8());
                    break;
                case 9:
                    System.out.println( Main.operacion9());
                    break;
                case 10:
                    System.out.println( Main.operacion10());
                    break;
                case 11:
                    System.out.println( Main.operacion11());
                    break;
                case 12:
                    System.out.println( Main.operacion12());
                    break;
                case 13:
                    System.out.println( + Main.operacion13());
                    break;
                case 14:
                    System.out.println( + Main.operacion14());
                    break;
                case 15:
                    System.out.println( Main.operacion15());
                    break;
                case 16:
                    System.out.println( Main.operacion16());
                    break;
                case 17:
                    System.out.println( Main.operacion17());
                    break;
                case 18:
                    System.out.println( Main.operacion18());
                    break;
                case 19:
                    System.out.println( Main.operacion19());
                    break;
                case 20:
                    System.out.println( Main.operacion20());
                    break;
                case 21:
                    System.out.println( Main.operacion21());
                    break;
                case 22:
                    System.out.println(Main.operacion22());
                    break;
                case 23:
                    System.out.println( Main.operacion23());
                    break;
                case 24:
                    System.out.println(Main.operacion24());
                    break;
                case 25:
                    System.out.println( Main.operacion25());
                    break;
                case 26:
                    System.out.println( Main.operacion26());
                    break;
                case 27:
                    System.out.println( Main.operacion27());
                    break;
                case 28:
                    System.out.println( Main.operacion28());
                    break;
                case 29:
                    System.out.println( Main.operacion29());
                    break;
                case 30:
                    System.out.println( Main.operacion30());
                    break;
                case 31:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion !=31);


    }
}