import java.util.ArrayList;

public class Clinica {

    ArrayList<Paciente> pacientes =  new ArrayList<>();
    ArrayList<Agendamento> agendamentos =  new ArrayList<>();


    public void cadastraPaciente(Paciente p) {
        if(verificaCodigo(p.getCodigo())){
            System.out.println("codigo existente tente outro");
        }
        pacientes.add(p);
    }

    public void cadastraAgendamento(Agendamento a) {
        if(verificaAgendamento(a.getDia(),a.getMes(),a.getAno(),a.getHora())){
            System.out.println("codigo existente tente outro");
        }
        agendamentos.add(a);
    }


    public boolean verificaCodigo(String codigo){
        for(Paciente p: pacientes){
            if(p.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }

    public boolean verificaAgendamento(int dia, int mes, int hora, int ano){
        for(Agendamento a: agendamentos){
            if(a.getDia() == dia && a.getMes() == mes && a.getHora() == hora && a.getAno() == ano){
                return true;
            }
        }
        return false;
    }
}
