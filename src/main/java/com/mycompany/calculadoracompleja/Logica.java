package com.mycompany.calculadoracompleja;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Logica {
    Complejo primerNumero, segundoNumero;
        
        double r1; //PARTE REAL DEL PRIMER NUMERO
        double img1; //PARTE IMAGINARIA DEL 1er NUMERO
        double r2; //PARTE REAL DEL SEGUNDO NUMERO
        double img2; //PARTE IMAGINARIA DEL 2do NUMERO
        int opcion, numeroEntero;
        Complejo suma, resta, multiplicacion, division;

    
    
    public Logica() {

        
    }
    
    
    //Saludo para dar la bienvenida a la aplicación
    public void welcome() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Bienvenido a CIISA");
        System.out.println("-----------------------------------------------------------");
    }
    
    
    // Menú principal donde se encuentran las principales opciones de la aplicación
    public void menuPrincipal() {
        System.out.println("Escoja la opción a utilizar: ");
        System.out.println("1.- SUMAR");
        System.out.println("2.- RESTAR");
        System.out.println("3.- MULTIPLICAR");   
        System.out.println("4.- DIVIDIR"); 
        System.out.println("5.- SALIR"); 
    }
    
    
    // Acá es donde se captura la opción ingresada por el usuario
    public void opciones(){
        int opcion = 0;
        do {    
            try {
                Scanner scr = new Scanner(System.in);
                System.out.print("OPCION: ");
                opcion = scr.nextInt(); 
            }catch (Exception err){
                System.out.println("INGRESE UNA OPCION ENTRE EL 1 Y EL 5!");
                opcion=0;
            }       
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5); 

        switch (opcion){
            case 1: // SUMA
                opcion1();
                break;
            case 2: // RESTA
                opcion2();
                break;
            case 3: // MULTIPLICACION
                opcion3();
                break;
            case 4: // DIVISION
                opcion4();
                break;
            case 5: // SALIR
                despedida();
        }
    }
    
    
    // Lógica de la opción 1 del menú principal
    public void opcion1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la parte REAL del primer número complejo: ");
        r1 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img1 = sc.nextDouble();
        System.out.println("Digite la parte REAL del segundo número complejo: ");
        r2 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img2 = sc.nextDouble();
        
        primerNumero = new Complejo(r1, img1);
        segundoNumero = new Complejo(r2, img2);
        suma = primerNumero.calcularSuma(segundoNumero);
        System.out.println("-----------------------------------------------------------");
        System.out.println("LA SUMA ES: " + suma.getParteReal() + " + " + suma.getParteImaginaria() + "i");
                
        volver();
    }
    
    
    // Lógica de la opción 2 del menú principal
    public void opcion2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la parte REAL del primer número complejo: ");
        r1 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img1 = sc.nextDouble();
        System.out.println("Digite la parte REAL del segundo número complejo: ");
        r2 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img2 = sc.nextDouble();
        
        primerNumero = new Complejo(r1, img1);
        segundoNumero = new Complejo(r2, img2);
        resta = primerNumero.calcularResta(segundoNumero);
        System.out.println("-----------------------------------------------------------");
        System.out.println("LA RESTA ES: " + resta.getParteReal() + " + " + resta.getParteImaginaria() + "i");
        
        volver();
    }
    
    
    // Lógica de la opción 3 del menú principal
    public void opcion3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la parte REAL del primer número complejo: ");
        r1 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img1 = sc.nextDouble();
        System.out.println("Digite la parte REAL del segundo número complejo: ");
        r2 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img2 = sc.nextDouble();
        
        primerNumero = new Complejo(r1, img1);
        segundoNumero = new Complejo(r2, img2);
        multiplicacion = primerNumero.calcularMultiplicacion(segundoNumero);
        System.out.println("-----------------------------------------------------------");
        System.out.println("EL RESULTADO DE LA MULTIPLICACIÓN ES: " + multiplicacion.getParteReal() + " + " + multiplicacion.getParteImaginaria() + "i");
        
        volver();
    }
    
    
    // Lógica de la opción 4 del menú principal
    public void opcion4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la parte REAL del primer número complejo: ");
        r1 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img1 = sc.nextDouble();
        System.out.println("Digite la parte REAL del segundo número complejo: ");
        r2 = sc.nextDouble();
        System.out.println("Digite la parte IMAGINARIA: ");
        img2 = sc.nextDouble();
        
        primerNumero = new Complejo(r1, img1);
        segundoNumero = new Complejo(r2, img2);
        division = primerNumero.calcularDivision(segundoNumero);
        System.out.println("-----------------------------------------------------------");
        System.out.println("EL RESULTADO DE LA DIVISIÓN ES: " + division.getParteReal() + " + " + division.getParteImaginaria() + "i");
        volver();
    }
    
    
    // Menú que se muestra al finalizar cada consulta, para saber si el usuario desea terminar o volver a consultar
    public void volver(){
    Scanner sc = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("¿Desea volver al menú principal para realizar más calculos?");
            System.out.println("Indique: 1 = SI, 2 = SALIR");
            System.out.print("OPCION: ");
            int resp = sc.nextInt();
            if (resp == 2){
                System.out.println("-----------------------------------------------------------");
                System.out.println("Hasta Pronto");
                System.out.println("Adiós!");
                System.exit(0);
            }
            if (resp == 1){
                menuPrincipal();
                opciones();
            }
            if (resp <1 || resp >2) {
                System.out.println("Ingrese una opción VALIDA entre 1 y 2 !");
                volver();
            }
        }catch (InputMismatchException err){
            System.out.println("Ingrese una opción VALIDA entre 1 y 2");
            int resp = 0;
            volver();
        }
    }
    
    
    // Despedida que se despliega en caso de que el usuario no quiera seguir utilizando la aplicación
    public void despedida() {
        System.out.println("-----------------------------------------");
        System.out.println("Gracias por calcular con CIISA");
        System.out.println("Hasta pronto ;)");
        System.exit(0);

    } 
    
}
