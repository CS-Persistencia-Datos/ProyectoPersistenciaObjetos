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
public class Producto {

    private int id_producto;
    private int id_clasificacion;
    private Proveedores id_proveedor;
    private int stock;
    private double precio_unitario;
    private String unidad;
    private ArrayList<ItemFactura> listaItmeFactura;

    public Producto() {
        listaItmeFactura = new ArrayList<>();
    }

    public Producto(int id_producto, int id_clasificacion, Proveedores id_proveedor, int stock, double precio_unitario, String unidad) {
        this.id_producto = id_producto;
        this.id_clasificacion = id_clasificacion;
        this.id_proveedor = id_proveedor;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public Proveedores getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedores id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public ArrayList<ItemFactura> getListaItmeFactura() {
        return listaItmeFactura;
    }

    public void setListaItmeFactura(ArrayList<ItemFactura> listaItmeFactura) {
        this.listaItmeFactura = listaItmeFactura;
    }


}
