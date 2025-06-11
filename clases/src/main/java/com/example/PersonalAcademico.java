package com.example;

public class PersonalAcademico extends Usuario{
    protected java.util.AbstractCollection incidentes;

    public void reportarError(String email,String contenido){
        //throw new UnsupportedOperationException();
    }

    public boolean solicitarAsesoramientoDelSistema(String email, String contenido){
        return true;
    }

    public void comentarEnForo(Foro foro,String comentario){
        //throw new UnsupportedOperationException();
    }

    public java.util.AbstractCollection getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(java.util.AbstractCollection incidentes) {
        this.incidentes = incidentes;
    }
}