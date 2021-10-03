
package test;

import domain.Empleado;
import domain.Gerente;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado emp_1 = new Empleado("Jan",6000);
        Gerente ger_1 = new Gerente("Ana", 7000, "Sistemas");
        imprimir(emp_1);
        imprimir(ger_1);  
        
        
    }
    
    public static void imprimir(Empleado a){
        System.out.println("Detalles:  " + a.obtenerDetalles() );
    }
}
