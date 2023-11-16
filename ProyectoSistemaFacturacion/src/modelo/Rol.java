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
public class Rol {

    private int id_rol;
    private String rol;
    private Boolean estado;
    private List<UsuarioRol> listaRolUsuario;
    private List<RolCompetencia> listaRolCompetencia;

    public Rol() {
        listaRolUsuario= new ArrayList<>();
        listaRolCompetencia= new ArrayList<>();
    }

    public Rol(int id_rol, String rol, Boolean estado) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.estado = estado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<UsuarioRol> getListaRolUsuario() {
        return listaRolUsuario;
    }

    public void setListaRolUsuario(List<UsuarioRol> listaRolUsuario) {
        this.listaRolUsuario = listaRolUsuario;
    }

    public List<RolCompetencia> getListaRolCompetencia() {
        return listaRolCompetencia;
    }

    public void setListaRolCompetencia(List<RolCompetencia> listaRolCompetencia) {
        this.listaRolCompetencia = listaRolCompetencia;
    }

    @Override
    public String toString() {
        return " ROL: " + this.getRol();
    }

}
