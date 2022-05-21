/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06;

/**
 *
 * @author SALA I
 */
public class Hospital {
    
    private CiudadHospital ciudadHospital;
    private String nombreHospital;
    private Doctor[] doctor;
    private Enfermero[] enfermero;
    private double sueldoTotal;
    private String direccion;
    private int totalEspecialidad;
    
    public Hospital(String nombre,CiudadHospital cHospital, Doctor[] doc, Enfermero[] enfer, String direc){
       
       nombreHospital = nombre;
       ciudadHospital = cHospital;
       doctor = doc;
       enfermero = enfer;
       direccion = direc;
       
    }
    public void establecerCiudadHospital(CiudadHospital n){
        ciudadHospital = n;
    }
    public void establecerNombreHospital(String n){
        nombreHospital = n;
    }
    public void establecerDoctor(Doctor[] n){
        doctor = n;
    }
    public void establecerEnfermero(Enfermero[] n){
        enfermero = n;
    }
    public void establecerSueldoTotal(){
        double valor = 0;
        for (int i = 0; i < obtenerDoctor().length; i++){
            valor = valor + obtenerDoctor()[i].obtenerSueldoMensual();
        }
        for (int i = 0; i < obtenerEnfermero().length; i++){
            valor = valor + obtenerEnfermero()[i].obtenerSueldoMensual();
        }
        sueldoTotal = valor;
    }
    public void establecerDireccion(String n){
        direccion = n;
    }
    public void establecerTotalEspecialidad(){
        totalEspecialidad = obtenerDoctor().length + obtenerEnfermero().length;
    }
    public CiudadHospital obtenerCiudadHospital(){
        return ciudadHospital;
    }
    public String obtenerNombreHospital(){
        return nombreHospital;
    }
    public Doctor[] obtenerDoctor(){
        return doctor;
    }
    public Enfermero[] obtenerEnfermero(){
        return enfermero;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    public String obtenerDireccion(){
        return direccion;
    }
    public int obtenerTotalEspecialidad(){
        return totalEspecialidad;
    }
    @Override
    public String toString(){
        String cadena = String.format("HOSPITAL %s\nDirección: "
                + "%s\nCiudad: %s\nProvincia: %s\nNúmero de especialidades: "
                + "%d\nListado de médicos\n",obtenerNombreHospital().toUpperCase(), obtenerDireccion(), 
                obtenerCiudadHospital().obtenerNombreCiudad(),
                obtenerCiudadHospital().obtenerProvinciaCiudad(), obtenerTotalEspecialidad());
        
        for (int i = 0; i < obtenerDoctor().length;i++){
            cadena = String.format("%s\n- %s - sueldo: %.2f - %s\n",cadena,
                    obtenerDoctor()[i].obtenerNombreDoctor(),
                    obtenerDoctor()[i].obtenerSueldoMensual(),
                    obtenerDoctor()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nListado de enfermeros(ras)\n", cadena);
        for(int i = 0; i < obtenerEnfermero().length;i++){
            cadena = String.format("%s\n- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerEnfermero()[i].obtenerNombreEnfermero(), 
                    obtenerEnfermero()[i].obtenerSueldoMensual(), 
                    obtenerEnfermero()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",cadena,
                obtenerSueldoTotal());
        return cadena;
    }
}
