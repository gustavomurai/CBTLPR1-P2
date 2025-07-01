import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    Scanner input = new Scanner(System.in);

    public Data() {
        setDia();
        setMes();
        setAno();
    }

    public Data(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAno(a);
    }

    public void setDia() {
        int d;
        do {
            System.out.print("Digite o dia: ");
            d = input.nextInt();
        } while (d < 1 || d > 31);
        this.dia = d;
    }

    public void setMes() {
        int m;
        do {
            System.out.print("Digite o mês: ");
            m = input.nextInt();
        } while (m < 1 || m > 12);
        this.mes = m;
    }

    public void setAno() {
        int a;
        do {
            System.out.print("Digite o ano: ");
            a = input.nextInt();
        } while (a < 1);
        this.ano = a;
    }

    public void setDia(int d) {
        if (d >= 1 && d <= 31)
            this.dia = d;
    }

    public void setMes(int m) {
        if (m >= 1 && m <= 12)
            this.mes = m;
    }

    public void setAno(int a) {
        if (a > 0)
            this.ano = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String mostra2() {
        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        return String.format("%02d/%s/%04d", dia, meses[mes - 1], ano);
    }

    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasTranscorridos() {
        int[] diasPorMes = { 31, bissexto() ? 29 : 28, 31, 30, 31, 30,
                             31, 31, 30, 31, 30, 31 };
        int total = 0;
        for (int i = 0; i < mes - 1; i++) {
            total += diasPorMes[i];
        }
        total += dia;
        return total;
    }

    public void apresentaDataAtual() {
        Date hoje = new Date();
        DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + formato.format(hoje));
    }
}
