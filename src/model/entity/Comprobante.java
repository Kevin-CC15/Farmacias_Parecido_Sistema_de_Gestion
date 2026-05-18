package model;

import java.sql.Date;

public class Comprobante {

    private int idComprobante;

    private Consulta consulta;
    private Pago pago;

    private String numeroConsulta;
    private String nombrePaciente;
    private String especialidad;
    private String metodoPago;
    private Date fecha;
    private float monto;

    public Comprobante() {
    }

    public Comprobante(int idComprobante,
                       Consulta consulta,
                       Pago pago,
                       String numeroConsulta,
                       String nombrePaciente,
                       String especialidad,
                       String metodoPago,
                       Date fecha,
                       float monto) {

        this.idComprobante = idComprobante;
        this.consulta = consulta;
        this.pago = pago;
        this.numeroConsulta = numeroConsulta;
        this.nombrePaciente = nombrePaciente;
        this.especialidad = especialidad;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.monto = monto;
    }
}