import java.util.Scanner;

class QuestSwitch_0028{
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int nStrukturData,nPBO,nBasisData,nAlgoritmaPemro,nRPL;
        double nRataRata;

        System.out.println("Seleksi Pemilihan Asdos berdasarkan nilai akademik");
        System.out.println("Masukkan nilai akhir dari matakuliah dibawah ini");

        System.out.print("Struktur Data: ");
        nStrukturData = ns.nextInt();
        System.out.print("Pemrograman Berorientasi Object");
        nPBO = ns.nextInt();
        System.out.print("Basis Data");
        nBasisData = ns.nextInt();
        System.out.print("Algoritma dan Pemrograman");
        nAlgoritmaPemro = ns.nextInt();
        System.out.print("Rekayasa Perangkat Lunak");
        nRPL = ns.nextInt();
    }
}