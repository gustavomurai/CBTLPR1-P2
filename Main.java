import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 9, 2024, "Lucas", "Dr. João");
        exibirConsulta(p1);

        ConsultaAgendada p2 = new ConsultaAgendada();
        exibirConsulta(p2);

        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();
        exibirConsulta(p1);

        System.out.println("Total de consultas agendadas: " + ConsultaAgendada.getQuantidade());

        try {
            FileWriter fw = new FileWriter("resultado.txt");
            fw.write("Consulta 1:\n");
            fw.write("Data: " + p1.getData() + "\n");
            fw.write("Hora: " + p1.getHora() + "\n");
            fw.write("Paciente: " + p1.getNomePaciente() + "\n");
            fw.write("Médico: " + p1.getNomeMedico() + "\n");

            fw.write("\nConsulta 2:\n");
            fw.write("Data: " + p2.getData() + "\n");
            fw.write("Hora: " + p2.getHora() + "\n");
            fw.write("Paciente: " + p2.getNomePaciente() + "\n");
            fw.write("Médico: " + p2.getNomeMedico() + "\n");

            fw.write("\nTotal de consultas: " + ConsultaAgendada.getQuantidade() + "\n");

            fw.close();
            System.out.println("Resultado salvo em 'resultado.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void exibirConsulta(ConsultaAgendada consulta) {
        System.out.println("Data: " + consulta.getData());
        System.out.println("Hora: " + consulta.getHora());
        System.out.println("Paciente: " + consulta.getNomePaciente());
        System.out.println("Médico: " + consulta.getNomeMedico());
        System.out.println("--------------------------");
    }
}
