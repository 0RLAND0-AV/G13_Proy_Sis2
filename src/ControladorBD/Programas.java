/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorBD;

/**
 *
 * @author hp
 */
//qp.insertarPrograma(NombreCampo.getText(), FechaInicioCampo.getText(), FechaInicioCampo.getText(),Integer.parseInt(CostoCampo.getText().trim()) , null, DetallesCampo.getText(), Integer.parseInt(MaximoInscritosCampo.getText().trim()), 1);

public class Programas {
    public int id;
    public String nombre;
    public int inscritos;
    public String horario;
    public boolean estado;

    public Programas(int id, String nombre, int inscritos, String horario, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.inscritos = inscritos;
        this.horario = horario;
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getInscritos() {
        return inscritos;
    }

    public String getHorario() {
        return horario;
    }

    public boolean isEstado() {
        return estado;
    }
    
    
}
