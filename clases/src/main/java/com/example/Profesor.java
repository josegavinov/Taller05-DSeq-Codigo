package com.example;
public class Profesor extends PersonalAcademico{
    private java.util.Collection cursosACargo;

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //throw new UnsupportedOperationException();
    }

    public float calificarActividadSumativa(Curso curso,Estudiante estudiante,ActividadSumativa actividadSumativa){
        throw new UnsupportedOperationException();
    }

    public void aceptarinscripcion(Curso curso,String usuarioEstudiante){
        //throw new UnsupportedOperationException();
    }

    public void crearNuevoForo(Foro foro){
        //throw new UnsupportedOperationException();
    }

    public java.util.Collection getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(java.util.Collection cursosACargo) {
        this.cursosACargo = cursosACargo;
    }
}
