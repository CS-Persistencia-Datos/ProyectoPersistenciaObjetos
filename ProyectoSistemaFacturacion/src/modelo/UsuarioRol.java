/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59398
 */
public class UsuarioRol {

    private Usuario id_usuario;
    private Rol id_rol;

    public UsuarioRol() {
    }

    public UsuarioRol(Usuario id_usuario, Rol id_rol) {
        this.id_usuario = id_usuario;
        this.id_rol = id_rol;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }

    @Override
    public String toString() {
        return  this.id_usuario.getUsuario()+ this.id_rol.getRol();
    }

}
