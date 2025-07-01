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

    public void setHora() {
        int h;
        do {
            System.out.print("Digite a hora: ");
            h = input.nextInt();
        } while (h < 0 || h > 23);
        this.hora = h;
    }

    public void setMinuto() {
        int m;
        do {
            System.out.print("Digite o minuto: ");
            m = input.nextInt();
        } while (m < 0 || m > 59);
        this.minuto = m;
    }

    public void setSegundo() {
        int s;
        do {
            System.out.print("Digite o segundo: ");
            s = input.nextInt();
        } while (s < 0 || s > 59);
        this.segundo = s;
    }

    public void setHora(int h) {
        if (h >= 0 && h <= 23) this.hora = h;
    }

    public void setMinuto(int m) {
        if (m >= 0 && m <= 59) this.minuto = m;
    }

    public void setSegundo(int s) {
        if (s >= 0 && s <= 59) this.segundo = s;
    }

    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public int getSegundo() { return segundo; }

    public String getHoraCompleta() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
