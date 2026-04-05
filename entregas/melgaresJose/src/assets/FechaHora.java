package assets;

public class FechaHora {
    int dia;
    int mes;
    int año;
    int hora;
    int minuto;

    public FechaHora(int dia, int mes, int año, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minuto = minuto;
    }

    public FechaHora(int dia, int mes, int año) {
        this(dia, mes, año, 0, 0);
    }

    public FechaHora(FechaHora fechaHora) {
        this(
            fechaHora.dia,
            fechaHora.mes,
            fechaHora.año,
            fechaHora.hora,
            fechaHora.minuto
        );
    }
}