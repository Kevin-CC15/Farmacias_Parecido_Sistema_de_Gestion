package model.entity;

import model.enums.MetodoPago;

import java.sql.Date;

public class Pago {

    private int idPago;
    private Consulta consulta;
    private MetodoPago metodoPago;
    private float monto;
    private Date fecha;

    public Pago() {
    }

    public Pago(int idPago, Consulta consulta,
                MetodoPago metodoPago,
                float monto,
                Date fecha) {

        this.idPago = idPago;
        this.consulta = consulta;
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.fecha = fecha;
    }
}