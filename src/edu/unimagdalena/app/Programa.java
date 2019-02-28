/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unimagdalena.app;

import edu.unimagdalena.logica.Fases;
import static edu.unimagdalena.logica.Fases.ANALISIS;
import static edu.unimagdalena.logica.Fases.DESPLIEGUE;
import static edu.unimagdalena.logica.Fases.DISENO;
import static edu.unimagdalena.logica.Fases.IMPLEMETACION;
import edu.unimagdalena.logica.Proyecto;
import edu.unimagdalena.logica.Tarea;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Estudiante
 */
public class Programa {

    
    public static void main(String[] args) {
        Tarea extReq = new Tarea("Extraccion de requisistos",12, Fases.ANALISIS);
        Tarea diseño = new Tarea("Definicion de casos de uso",8, Fases.ANALISIS);
        Tarea disMODe = new Tarea("Diseño de datos",10,Fases.DISENO);
        Tarea UI = new Tarea("Implementación de la UI",20,Fases.IMPLEMETACION);
        Tarea modelo = new Tarea("Implementación del modelo" ,20, Fases.IMPLEMETACION);
        Tarea pruebas = new Tarea("Implementación de las pruebas",8,Fases.IMPLEMETACION);
        Tarea base = new Tarea("Configuración de la base de datos",4,Fases.DESPLIEGUE);
        Tarea servidor = new Tarea("Instalación en el servidor",6,Fases.DESPLIEGUE);
        Tarea requisitos = new Tarea("Programación nuevos requisitos",20,Fases.MANTENIMIENTO);
        
        
        Proyecto proyecto = new Proyecto("mi primer proyecto",90);
        proyecto.crearTarea(extReq);
        proyecto.crearTarea(diseño);
        proyecto.crearTarea(disMODe);
        proyecto.crearTarea(UI);
        proyecto.crearTarea(modelo);
        proyecto.crearTarea(pruebas);
        proyecto.crearTarea(base);
        proyecto.crearTarea(servidor);
        proyecto.crearTarea(requisitos);
        
        
        
        ArrayList<Tarea> tareasProyecto = new ArrayList();
        tareasProyecto.addAll(proyecto.getTareas());
        Iterator<Tarea> it= tareasProyecto.iterator();
        for(Tarea t: tareasProyecto){
            if(t.getDuracion()<7){
                proyecto.borrarTarea(t);
                System.out.println("Tarea borrada"+t.getDescripcion());
            }else{
                System.out.println("Tarea no borrada"+t.getDescripcion());
            }
        }
        }
       
        
        ArrayList<Tarea> tareasAnalisis=proyecto.consultarTareas(Fases.ANALISIS);
        for(Tarea t: tareasAnalisis){
            if(proyecto.finalizarTarea(t)){
                System.out.println("Tanera no finalizada"+t.getDescripcion());
            }
        }
        
        
        System.out.println("nombre del proyecto"+proyecto.getNombre());
        System.out.println("");
        
        
                
        


        
        
    }
