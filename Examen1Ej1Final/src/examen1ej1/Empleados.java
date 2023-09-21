/*
CLASE CONTENEDORA DE EMPLEADOS
 */
package examen1ej1;

/**
 * @author Ingrid
 */
public class Empleados {
    private String nombre;
    private int tipo;
    private double horas;
    private double cuota;
    
    //constructor
    public Empleados(String nombre, int tipo, double horas, double cuota){
        this.nombre = nombre;
        this.tipo = tipo;
        this.horas = horas;
        this.cuota = cuota;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public void setHoras(double horas){
        this.horas = horas;
    }
    
    public void setCuota(double cuota){
        this.cuota = cuota;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public int getTipo(){
        return this.tipo;
    }
    
    public double getHoras(){
        return this.horas;
    }
    
    public double getCuota(){
        return this.cuota;
    }
    
}
