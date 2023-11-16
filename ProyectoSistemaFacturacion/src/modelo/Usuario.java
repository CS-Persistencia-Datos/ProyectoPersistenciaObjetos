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
public class Usuario {
    private int id_uuario;
    private Persona id_persona;
    private String usuario;
    private String password;
    private List<UsuarioRol> listaUsuarioRol;

    public Usuario() {
     listaUsuarioRol= new ArrayList<>();
    }

    public Usuario(int id_uuario, Persona id_persona, String usuario, String password) {
        this.id_uuario = id_uuario;
        this.id_persona = id_persona;
        this.usuario = usuario;
        this.password = password;
    }

    public int getId_uuario() {
        return id_uuario;
    }

    public void setId_uuario(int id_uuario) {
        this.id_uuario = id_uuario;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
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

    public List<UsuarioRol> getListaUsuarioRol() {
        return listaUsuarioRol;
    }

    public void setListaUsuarioRol(List<UsuarioRol> listaUsuarioRol) {
        this.listaUsuarioRol = listaUsuarioRol;
    }



}
