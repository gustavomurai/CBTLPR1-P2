import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Criando p1 com valores diretos (sem digitar)
        ConsultaAgendada p1 = new ConsultaAgendada(
            14, 30, 0,         // hora
            10, 7, 2024,       // data
            "Carlos Souza",    // paciente
            "Dra. Paula"       // médico
        );

        System.out.println("=== Consulta p1 (antes de alterar) ===");
        p1.exibirTudo();

        // Criando p2 com entrada pelo teclado
        System.out.println("\n=== Criando p2 (usuário digita os dados) ===");
        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("\n=== Consulta p2 ===");
        p2.exibirTudo();

        // Alterando os dados de p1
        System.out.println("\n=== Alterando dados da p1 ===");
        p1.setData(20, 8, 2025);
        p1.setHora(9, 15, 0);
        p1.setNomePaciente("Fernanda Lima");
        p1.setNomeMedico("Dr. Henrique");

        System.out.println("\n=== Consulta p1 (depois de alterar) ===");
        p1.exibirTudo();

        // Quantidade de consultas criadas
        System.out.println("\nTotal de consultas criadas: " + ConsultaAgendada.getAmostra());

        // EXERCÍCIO 04 - SALVAR DADOS EM UM ARQUIVO .TXT
        try {
            FileWriter arquivo = new FileWriter("resultado_consulta.txt"); // cria o arquivo
            PrintWriter gravar = new PrintWriter(arquivo); // prepara para escrever

            gravar.println("=== Consulta Agendada ===");
            gravar.println("Paciente: " + p1.getNomePaciente());
            gravar.println("Médico: " + p1.getNomeMedico());
            gravar.println("Data da Consulta: " + p1.getData());
            gravar.println("Hora da Consulta: " + p1.getHora());
            gravar.println("Total de Consultas: " + ConsultaAgendada.getAmostra());

            gravar.close(); // fecha e salva
            System.out.println("\nArquivo 'resultado_consulta.txt' salvo com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
