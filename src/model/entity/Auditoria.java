package model;

import java.sql.Timestamp;

public class Auditoria {

    private int idAuditoria;

    private Usuario usuario;

    private String entidadAuditada;
    private int idEntidad;
    private String accion;

    private Timestamp fechaHora;

    public Auditoria() {
    }

    public Auditoria(int idAuditoria,
                     Usuario usuario,
                     String entidadAuditada,
                     int idEntidad,
                     String accion,
                     Timestamp fechaHora) {

        this.idAuditoria = idAuditoria;
        this.usuario = usuario;
        this.entidadAuditada = entidadAuditada;
        this.idEntidad = idEntidad;
        this.accion = accion;
        this.fechaHora = fechaHora;
    }
}