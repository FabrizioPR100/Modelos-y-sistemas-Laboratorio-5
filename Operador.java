/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Informatica7
 */
public class Operador extends Empleado{
    private int sueldoBasico = 750;
    private int horasTrabajadas = 200;
    private int plusProduccion = sueldoBasico/10;

        
    @Override
    public void calcularSalario(int horasExtra) {
        int sueldoHorasExtra = (sueldoBasico/horasTrabajadas) * horasExtra;
        int sueldo = sueldoBasico + sueldoHorasExtra +plusProduccion;
                System.out.println(sueldo);
    }
    
}
