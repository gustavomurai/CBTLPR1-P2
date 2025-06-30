import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    Scanner input = new Scanner(System.in);

    public Hora() {
        setHora();
        setMinuto();
        setSegundo();
    }

    public Hora(int h, int m, int s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    public void setHora(int h) {
        while (h < 0 || h > 23) {
            System.out.print("Hora inválida. Digite novamente: ");
            h = input.nextInt();
        }
        this.hora = h;
    }

    public void setMinuto(int m) {
        while (m < 0 || m > 59) {
            System.out.print("Minuto inválido. Digite novamente: ");
            m = input.nextInt();
        }
        this.minuto = m;
    }

    public void setSegundo(int s) {
        while (s < 0 || s > 59) {
            System.out.print("Segundo inválido. Digite novamente: ");
            s = input.nextInt();
        }
        this.segundo = s;
    }

    public void setHora() {
        System.out.print("Digite a hora (0 a 23): ");
        int h = input.nextInt();
        setHora(h);
    }

    public void setMinuto() {
        System.out.print("Digite o minuto (0 a 59): ");
        int m = input.nextInt();
        setMinuto(m);
    }

    public void setSegundo() {
        System.out.print("Digite o segundo (0 a 59): ");
        int s = input.nextInt();
        setSegundo(s);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
