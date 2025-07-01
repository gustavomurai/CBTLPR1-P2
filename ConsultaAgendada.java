public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    public ConsultaAgendada() {
        data = new Data();
        hora = new Hora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        data = new Data(d, m, a);
        hora = new Hora(h, mi, s);
        nomePaciente = p;
        nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        data = d;
        hora = h;
        nomePaciente = p;
        nomeMedico = med;
        quantidade++;
    }

    public void setData(int d, int m, int a) {
        data = new Data(d, m, a);
    }

    public void setData() {
        data = new Data();
    }

    public void setHora(int h, int m, int s) {
        hora = new Hora(h, m, s);
    }

    public void setHora() {
        hora = new Hora();
    }

    public void setNomePaciente() {
        System.out.print("Digite o nome do paciente: ");
        nomePaciente = new java.util.Scanner(System.in).nextLine();
    }

    public void setNomePaciente(String p) {
        nomePaciente = p;
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do médico: ");
        nomeMedico = new java.util.Scanner(System.in).nextLine();
    }

    public void setNomeMedico(String m) {
        nomeMedico = m;
    }

    public String getData() {
        return data.mostra1();
    }

    public String getHora() {
        return hora.getHoraCompleta();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static int getQuantidade() {
        return quantidade;
    }
}
