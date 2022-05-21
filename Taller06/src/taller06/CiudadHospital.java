/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06;

/**
 *
 * @author SALA I
 */
public class CiudadHospital {
    
    private String nombreCiudad;
    private String provinciaCiudad;
    
    public CiudadHospital(String nCiudad, String pCiudad){
        
        nombreCiudad = nCiudad;
        provinciaCiudad = pCiudad;
        
    }
    
    public void establecerNombreCiudad(String c){
        nombreCiudad = c;
    }
    public void establecerProvinciaCiudad(String c){
        provinciaCiudad = c;
    }
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public String obtenerProvinciaCiudad(){
        return provinciaCiudad;
    }
    
}
