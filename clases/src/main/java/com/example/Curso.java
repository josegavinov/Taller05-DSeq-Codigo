package com.example;

public class Curso {
    private String nombre;
    private String id;
    private boolean estadoDisponible;
    private ActividadSumativa actividadesSumativas;
    private java.util.Collection foros;
    private java.util.Collection estudiantesInscritos;
    private java.util.Collection estudiantesEnEspera;
    private Profesor responsable;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public boolean isEstadoDisponible(){
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible){
        this.estadoDisponible = estadoDisponible;
    }

    public ActividadSumativa getActividadesSumativas(){
        return actividadesSumativas;
    }

    public void getActividadesSumativas(ActividadSumativa actividadesSumativas){
        this.actividadesSumativas = actividadesSumativas;
    }

    public java.util.Collection getForos(){
        return foros;
    }

    public void setForos(java.util.Collection foros){
        this.foros = foros;
    }

    public java.util.Collection getEstudiantesInscritos(){
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(java.util.Collection estudiantesInscritos){
        this.estudiantesInscritos = estudiantesInscritos;
    }
    public java.util.Collection getEstudiantesEnEspera(){
        return estudiantesEnEspera;
    }

    public void setEstudiantesEnEspera(java.util.Collection estudiantesEnEspera){
        this.estudiantesEnEspera = estudiantesEnEspera;
    }

    public Profesor getResponsable(){
        return responsable;
    }

    public void setResponsable(Profesor responsable){
        this.responsable = responsable;
    }
}
