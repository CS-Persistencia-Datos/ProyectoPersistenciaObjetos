/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 59398
 */
public class Factura {

    private int id_factura;
    private Persona id_persona;
    private TipoPago id_tipo_pago;
    private String ruc;
    private Date fecha;
    private double descuento;
    private double total;
    private ArrayList<ItemFactura> listaItemFactura;

    public Factura() {
    listaItemFactura=new ArrayList<>();
    }

    public Factura(int id_factura, Persona id_persona, TipoPago id_tipo_pago, String ruc, Date fecha, double descuento, double total) {
        this.id_factura = id_factura;
        this.id_persona = id_persona;
        this.id_tipo_pago = id_tipo_pago;
        this.ruc = ruc;
        this.fecha = fecha;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }

    public TipoPago getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(TipoPago id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<ItemFactura> getListaItemFactura() {
        return listaItemFactura;
    }

    public void setListaItemFactura(ArrayList<ItemFactura> listaItemFactura) {
        this.listaItemFactura = listaItemFactura;
    }






}
