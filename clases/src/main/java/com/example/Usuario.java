package com.example;

public abstract class Usuario {
    protected String usuario;
    protected String password;
    protected String nombre;
    protected String apellido;
    protected java.util.Collection incidentes;


    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public java.util.Collection getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(java.util.Collection incidentes) {
        this.incidentes = incidentes;
    }

    
}
