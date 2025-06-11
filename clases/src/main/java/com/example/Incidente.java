package com.example;
import java.util.Date;

public class Incidente {
    protected int id;
    protected Date fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected java.util.Collections logActualizaciones;
    protected Date fechaCerrado;
    protected String tipo;
    protected PersonalAcademico beneficiario;
    private Usuario responsable;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFechaReportado() {
        return fechaReportado;
    }
    public void setFechaReportado(Date fechaReportado) {
        this.fechaReportado = fechaReportado;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public java.util.Collections getLogActualizaciones() {
        return logActualizaciones;
    }
    public void setLogActualizaciones(java.util.Collections logActualizaciones) {
        this.logActualizaciones = logActualizaciones;
    }
    public Date getFechaCerrado() {
        return fechaCerrado;
    }
    public void setFechaCerrado(Date fechaCerrado) {
        this.fechaCerrado = fechaCerrado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public PersonalAcademico getBeneficiario() {
        return beneficiario;
    }
    public void setBeneficiario(PersonalAcademico beneficiario) {
        this.beneficiario = beneficiario;
    }
    public Usuario getResponsable() {
        return responsable;
    }
    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

}