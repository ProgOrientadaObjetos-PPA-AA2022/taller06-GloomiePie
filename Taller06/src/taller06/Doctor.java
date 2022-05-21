/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06;

/**
 *
 * @author SALA I
 */
public class Doctor {
    
    private String nombreDoctor;
    private String especialidad;
    private double sueldoMensual;
    
    public Doctor(String nDoctor, String especial, double sMensual){
        nombreDoctor = nDoctor;
        especialidad = especial;
        sueldoMensual = sMensual;
    }
    
    public void establecerNombreDoctor(String c){
        nombreDoctor = c;
    }
    public void establecerEspecialidad(String c){
        especialidad = c;
    }
    public void establecerSueldoMensual(double c){
        sueldoMensual = c;
    }
    public String obtenerNombreDoctor(){
        return nombreDoctor;
    }
    public String obtenerEspecialidad(){
        return especialidad;
    }
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
}
