
package edu.unimagdalena.logica;

import java.util.ArrayList;


public class Proyecto {
    
    private String nombre;
    private  ArrayList<Tarea> tareas;
    private  ArrayList<Tarea> tareasFinalizadas;
    private int duracion; 

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public ArrayList<Tarea> getTareasFinalizadas() {
        return tareasFinalizadas;
    }

    public int getDuracion() {
        return duracion;
    }

    public Proyecto(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tareas = new ArrayList<Tarea>();
        this.tareasFinalizadas = new ArrayList<Tarea>();
        
    }

    
    
   public ArrayList<Tarea> consultarTareas (Fases fase){
   
      ArrayList<Tarea>tareasporFase=null;
      tareasporFase=new ArrayList<Tarea>();
       for (Tarea t: this.tareas){
           if(t.getFase().equals(fase)){
              tareasporFase.add(t);
              
        }
           
     }
       return tareasporFase; 
   }
    
  public Tarea crearTarea(String nombre,Fases fase,int duracion){
  
         Tarea nuevaTarea;
         
         nuevaTarea= new Tarea(nombre, duracion,fase);
         this.tareas.add(nuevaTarea);
         return nuevaTarea;
  
  }
  
  public void crearTarea(Tarea nuevaTarea){
         this.tareas.add(nuevaTarea);
  
  }


   public boolean borrarTarea(Tarea tarea){    
   
    boolean borrado=false;
    borrado = this.tareas.remove(tarea);
    return borrado;
}


public boolean finalizarTarea(Tarea tarea){
    
    boolean finalizada =false;
    if(this.tareas.contains(tarea) && !this.tareasFinalizadas.contains(tarea)){
        this.tareasFinalizadas.add(tarea);
        finalizada = true;
    }
    return finalizada;
}  
    
}

