package model;

import java.sql.Date;

public class ReporteDiario {

    private int idReporte;
    private Date fecha;
    private String consultorio;
    private String especialidad;
    private String nombreMedico;
    private String nombrePaciente;
    private String motivoConsulta;

    public ReporteDiario() {
    }

    public ReporteDiario(int idReporte, Date fecha,
                         String consultorio,
                         String especialidad,
                         String nombreMedico,
                         String nombrePaciente,
                         String motivoConsulta) {

        this.idReporte = idReporte;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.especialidad = especialidad;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
        this.motivoConsulta = motivoConsulta;
    }
}