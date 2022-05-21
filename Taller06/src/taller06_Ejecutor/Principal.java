/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller06_Ejecutor;

import java.util.Scanner;
import taller06.CiudadHospital;
import taller06.Doctor;
import taller06.Enfermero;
import taller06.Hospital;
public class Principal {
    
    public static void main(String[] args) {
        
        Doctor[] doctor;
        Enfermero[] enfermero;
        CiudadHospital cHospital;
        String doc = "";
        double sueldo = 0;
        String especialidad = "";
        String enf = "";
        double sueldo2 = 0;
        String especialidad2 = "";
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del hospital: ");
        String nHospital = sc.nextLine();
        System.out.println("Ingrese la dirección: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese la provincia: ");
        String provincia = sc.nextLine();
        System.out.println("Ingrese cuantos doctores tiene: ");
        int emDoctor= sc.nextInt();
        
        cHospital = new CiudadHospital(ciudad, provincia);
        doctor = new Doctor[emDoctor];
        sc.nextLine();
        for(int i = 0; i <= emDoctor-1; i++){
            
            System.out.printf("Ingrese el nombre del doctor %d: \n", i+1);
            doc = sc.nextLine();
            System.out.printf("Ingrese el sueldo mensual: \n");
            sueldo = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Ingrese la especialidad: \n");
            especialidad = sc.nextLine();
            System.out.println("-----------------------------");
           Doctor doc2 = new Doctor(doc,especialidad,sueldo);
            
            
            doctor[i] = doc2;
            
        }
        
        System.out.println("Ingrese cuántos(tas) enfermeros(ras) tiene: ");
        int enfer = sc.nextInt();
        
        enfermero = new Enfermero[enfer];
        sc.nextLine();
        for(int i = 0; i <= enfer-1; i++){
            
            System.out.printf("Ingrese el nombre del(de la) enfermero(ra) %d: \n", i+1);
            enf = sc.nextLine();
            System.out.printf("Ingrese el sueldo mensual: \n");
            sueldo2 = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Ingrese el tipo de enfermero: \n");
            especialidad2 = sc.nextLine();
            System.out.println("-----------------------------");
            
           Enfermero enfer2 = new Enfermero(enf, especialidad2, sueldo2);
            
            
            enfermero[i] = enfer2;
        }
        
        Hospital hos = new Hospital(nHospital,cHospital, doctor, enfermero, direccion);
        hos.establecerSueldoTotal();
        hos.establecerTotalEspecialidad();
        System.out.printf("\n%s\n", hos);
        
    }
    
}
