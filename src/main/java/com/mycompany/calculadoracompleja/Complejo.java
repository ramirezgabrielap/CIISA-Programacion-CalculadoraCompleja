package com.mycompany.calculadoracompleja;


public class Complejo {
    //Inicializamos los números reales e imaginarios en cero
    private double parteReal = 0.0;
    private double parteImaginaria = 0.0;

    
    
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    
    
    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    
    
    @Override
    public String toString() {
        return "Complejo{" + "parteReal=" + parteReal + ", parteImaginaria=" + parteImaginaria + '}';
    }
  
    
    // devuelve: (numeroReal1 + numeroReal2) , (numeroImaginario1 + numeroImaginario2)
    // ejemplo: (a, b) + (c, d) = (a + c, b + d);
    public Complejo calcularSuma(Complejo numero){
        Complejo suma = new Complejo(parteReal + numero.getParteReal(), parteImaginaria + numero.getParteImaginaria());
        return suma; 
    }
    
    
    // devuelve: (numeroReal1 - numeroReal2) , (numeroImaginario1 - numeroImaginario2)
    // ejemplo: (a, b) - (c, d) = (a - c, b - d);
    public Complejo calcularResta(Complejo numero){
        Complejo resta = new Complejo(parteReal - numero.getParteReal(), parteImaginaria - numero.getParteImaginaria());
        return resta; 
    
    }
        
    
    // devuelve: (numeroReal1 * numeroReal2 - numeroImaginario1 * numeroImaginario2) , (numeroReal1 * numeroImaginario2 + numeroReal2 * numeroImaginario1)
    // ejemplo: (a, b) * (c, d) = (a*c – b*d, a*d + b*c)
    public Complejo calcularMultiplicacion(Complejo numero){
        Complejo multip = new Complejo(((parteReal * numero.getParteReal()) - (parteImaginaria * numero.getParteImaginaria())), ((parteReal * numero.getParteImaginaria()) + (numero.getParteReal() * parteImaginaria)));
        return multip;
    
    }
            
      
    // devuelve: (numeroReal1 * numeroReal2 + numeroImaginario1 * numeroImaginario2) / ((numeroReal2 * 2) + (numeroImaginario2 * 2)), (numeroImaginario1 * numeroReal2 - numeroReal1 * numeroImaginario2) / (numeroReal2 * 2) + (numeroImaginario2 * 2))
    // ejemplo: (a, b) / (c, d) = ((a*c + b*d) / (c2 + d2) , (b*c – a*d) / (c2 + d2))
    public Complejo calcularDivision(Complejo numero){
        Complejo divi = new Complejo(((parteReal * numero.getParteReal()) + (parteImaginaria * numero.getParteImaginaria())) / ((numero.getParteReal() * numero.getParteReal()) + (numero.getParteImaginaria() * numero.getParteImaginaria())), ((parteImaginaria * numero.getParteReal()) - (parteReal * numero.getParteImaginaria())) / ((numero.getParteReal()*numero.getParteReal()) + (numero.getParteImaginaria()*numero.getParteImaginaria())));
        return divi;
    
    }
    
    
}
