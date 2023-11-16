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
public class Clasificacion {

    private int id_clasifiacion;
    private String grupo;
    private ArrayList<Producto> listaProductosClasificacion;

    public Clasificacion() {
        listaProductosClasificacion = new ArrayList<>();
    }

    public Clasificacion(int id_clasifiacion, String grupo) {
        this.id_clasifiacion = id_clasifiacion;
        this.grupo = grupo;
    }

    public int getId_clasifiacion() {
        return id_clasifiacion;
    }

    public void setId_clasifiacion(int id_clasifiacion) {
        this.id_clasifiacion = id_clasifiacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Producto> getListaProductosClasificacion() {
        return listaProductosClasificacion;
    }

    public void setListaProductosClasificacion(ArrayList<Producto> listaProductosClasificacion) {
        this.listaProductosClasificacion = listaProductosClasificacion;
    }

}
