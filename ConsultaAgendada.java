import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    Scanner input = new Scanner(System.in);

    
    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    
    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    
    public void setData() {
        this.data = new Data();
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setNomePaciente() {
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = input.nextLine();
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = input.nextLine();
    }

    
    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setHora(int h, int m, int s) {
        this.hora = new Hora(h, m, s);
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    
    public static int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.mostra1(); 
    }

    public String getHora() {
        return hora.getHoraFormatada(); 
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    
    public void exibirTudo() {
        System.out.println("Paciente: " + getNomePaciente());
        System.out.println("Médico: " + getNomeMedico());
        System.out.println("Data da Consulta: " + getData());
        System.out.println("Hora da Consulta: " + getHora());
    }
}
