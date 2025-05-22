/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josuerexamenmediociclo;

/**
 *
 * @author User
 */
public class Consulta {
    private Date fecha;
    private String motivo;
    private Mascota mascota;

    public Consulta(Date fecha, String motivo, Mascota mascota) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
}

    public String mostrarConsulta() {
        return "Fecha: " + fecha + ", Motivo: " + motivo + ", Mascota: " + mascota.getNombre();
    }
}