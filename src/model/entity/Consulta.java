package model;

public class Consulta {

    private int idConsulta;

    private Cita cita;
    private Enfermero enfermero;

    private String motivoConsulta;
    private float estatura;
    private float peso;
    private float temperatura;

    private String observacionesClinicas;
    private String diagnostico;
    private String tratamiento;
    private String estudiosSolicitados;
    private String medicamentos;

    public Consulta() {
    }

    public Consulta(int idConsulta, Cita cita,
                    Enfermero enfermero,
                    String motivoConsulta,
                    float estatura,
                    float peso,
                    float temperatura,
                    String observacionesClinicas,
                    String diagnostico,
                    String tratamiento,
                    String estudiosSolicitados,
                    String medicamentos) {

        this.idConsulta = idConsulta;
        this.cita = cita;
        this.enfermero = enfermero;
        this.motivoConsulta = motivoConsulta;
        this.estatura = estatura;
        this.peso = peso;
        this.temperatura = temperatura;
        this.observacionesClinicas = observacionesClinicas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.estudiosSolicitados = estudiosSolicitados;
        this.medicamentos = medicamentos;
    }
}