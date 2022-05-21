/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06;

/**
 *
 * @author SALA I
 */
public class Enfermero {
    
    private String nombreEnfermero;
    private String tipo;
    private double sueldoMensual;
    
    public Enfermero(String nEnfermero, String tip, double sMensual){
        nombreEnfermero = nEnfermero;
        tipo = tip;
        sueldoMensual = sMensual;
    }
    
    public void establecerNombreEnfermero(String n){
        nombreEnfermero = n;
    }
    public void establecerTipo(String n){
        if (n.equals("Contrato")||n.equals("contrato")){
            tipo = "Contrato";
        } else if (n.equals("Nombramiento")||n.equals("nombramiento")) {
            tipo = "Nombramiento";
        } else {
            tipo = "No definido";
        }
    }
    
    public void establecerSueldoMensual(double c){
        sueldoMensual = c;
    }
    public String obtenerNombreEnfermero(){
        return nombreEnfermero;
    }
    public String obtenerTipo(){
        return tipo;
    }
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
            
}
