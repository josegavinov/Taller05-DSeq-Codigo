package com.example;

import java.util.Date;

public class ActividadSumativa {
    protected String titulo;
    protected Date fechaEntrega;
    protected float maxPuntaje;
    protected String contenido;
    protected float calificacion;
    protected String id;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Date getFechaEntrega(){
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega){
        this.fechaEntrega = fechaEntrega;
    }

    public float getMaxPuntaje(){
        return maxPuntaje;
    }

    public void setMaxPuntaje(float maxPuntaje){
        this.maxPuntaje = maxPuntaje;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public float getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}

