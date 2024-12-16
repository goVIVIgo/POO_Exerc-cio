public class Agendamento {

    private int dia, mes,hora, ano;
    private Paciente paciente;
    private boolean conNormal;

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public boolean isConNormal(){
        return conNormal;
    }
    public void setConNormal(boolean conNormal) {
        this.conNormal = conNormal;
    }

}
