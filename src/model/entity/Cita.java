import java.sql.Date;
import java.sql.Time;

public class Cita {

    private int idCita;
    private Date fecha;
    private Time hora;
    private Time horaFin;
    private String motivoCancelacion;
    private String observaciones;
    private String consultorio;

    private EstadoCita estadoCita;
    private Paciente paciente;
    private Medico medico;

    public Cita() {
    }

    public Cita(int idCita, Date fecha, Time hora,
                Time horaFin, String motivoCancelacion,
                String observaciones, String consultorio,
                EstadoCita estadoCita,
                Paciente paciente,
                Medico medico) {

        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.horaFin = horaFin;
        this.motivoCancelacion = motivoCancelacion;
        this.observaciones = observaciones;
        this.consultorio = consultorio;
        this.estadoCita = estadoCita;
        this.paciente = paciente;
        this.medico = medico;
    }
}