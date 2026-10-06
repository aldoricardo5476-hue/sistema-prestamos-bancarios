package com.banco.prestamos.model;

import java.time.LocalDateTime;

public class Prestamo {
    private int id;
    private int idEmpleado;
    private String nombreCliente;
    private String dui;
    private double monto;
    private int plazoMeses;
    private double salario;
    private String motivo;
    private String estado;
    private LocalDateTime fechaSolicitud;
    private String observaciones;

    public Prestamo() {
    }

    public Prestamo(int id, int idEmpleado, String nombreCliente, String dui, double monto, 
                   int plazoMeses, double salario, String motivo, String estado, LocalDateTime fechaSolicitud) {
        this.id = id;
        this.idEmpleado = idEmpleado;
        this.nombreCliente = nombreCliente;
        this.dui = dui;
        this.monto = monto;
        this.plazoMeses = plazoMeses;
        this.salario = salario;
        this.motivo = motivo;
        this.estado = estado;
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", dui='" + dui + '\'' +
                ", monto=" + monto +
                ", estado='" + estado + '\'' +
                '}';
    }
}
