/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59398
 */
public class RolCompetencia {

    private Rol id_rol;
    private Competencia id_competencia;

    public RolCompetencia() {
    }

    public RolCompetencia(Rol id_rol, Competencia id_competencia) {
        this.id_rol = id_rol;
        this.id_competencia = id_competencia;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }

    public Competencia getId_competencia() {
        return id_competencia;
    }

    public void setId_competencia(Competencia id_competencia) {
        this.id_competencia = id_competencia;
    }

    @Override
    public String toString() {
        return this.id_rol.getRol()+" "+this.id_competencia.getNombre();
    }

}
