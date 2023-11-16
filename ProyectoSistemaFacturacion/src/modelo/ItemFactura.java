/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author 59398
 */
public class ItemFactura {
    private int id_item_factura;
    private Factura id_factura;
    private Producto id_producto;
    private int cantidad;
    private double precio;
    private double iva;
    private double subTotal;

    public ItemFactura() {
    }

    public ItemFactura(int id_item_factura, Factura id_factura, Producto id_producto, int cantidad, double precio, double iva, double subTotal) {
        this.id_item_factura = id_item_factura;
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
        this.subTotal = subTotal;
    }

    public int getId_item_factura() {
        return id_item_factura;
    }

    public void setId_item_factura(int id_item_factura) {
        this.id_item_factura = id_item_factura;
    }

    public Factura getId_factura() {
        return id_factura;
    }

    public void setId_factura(Factura id_factura) {
        this.id_factura = id_factura;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }



}
