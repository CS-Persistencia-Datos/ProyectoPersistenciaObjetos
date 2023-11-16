/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59398
 */
public class Competencia {

    private int id_competencia;
    private String nombre;
    private String descripcion;
    private List<RolCompetencia> listaCompetenciaRol;

    public Competencia() {
        listaCompetenciaRol = new ArrayList<>();
    }

    public Competencia(int id_competencia, String nombre, String descripcion) {
        this.id_competencia = id_competencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_competencia() {
        return id_competencia;
    }

    public void setId_competencia(int id_competencia) {
        this.id_competencia = id_competencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<RolCompetencia> getListaCompetenciaRol() {
        return listaCompetenciaRol;
    }

    public void setListaCompetenciaRol(List<RolCompetencia> listaCompetenciaRol) {
        this.listaCompetenciaRol = listaCompetenciaRol;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
