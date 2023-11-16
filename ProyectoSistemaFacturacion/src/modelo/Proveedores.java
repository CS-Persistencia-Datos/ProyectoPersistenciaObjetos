/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 59398
 */
public class Proveedores {
    private int id_proveedores;
    private String ruc;
    private String telefono;
    private String pais;
    private String correo;
    private String moneda;
    private ArrayList<Producto> listaProductos;

    public Proveedores() {
     listaProductos= new ArrayList<>();
    }

    public Proveedores(int id_proveedores, String ruc, String telefono, String pais, String correo, String moneda, ArrayList<Producto> listaProductos) {
        this.id_proveedores = id_proveedores;
        this.ruc = ruc;
        this.telefono = telefono;
        this.pais = pais;
        this.correo = correo;
        this.moneda = moneda;
        this.listaProductos = listaProductos;
    }

    public int getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(int id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }





}
