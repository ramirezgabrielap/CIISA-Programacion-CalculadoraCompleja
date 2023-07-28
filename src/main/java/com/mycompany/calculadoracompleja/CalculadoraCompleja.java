package com.mycompany.calculadoracompleja;


public class CalculadoraCompleja {

    public static void main(String[] args) {
        //Inicializamos la clase Lógica, que contiene el menú principal y las acciones que podrá utilizar el usuario.
        Logica logic = new Logica();
        
        // Llamamos a los respectivos métodos para el funcionamiento de la aplicación.
        logic.welcome();
        logic.menuPrincipal();
        logic.opciones();
        
    }
}
