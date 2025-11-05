import java.util.Scanner;

class QuestSwitch_0028{
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int pilihanMatkul;
        float nRataRata,nStrukturData,nPBO,nBasisData,nAlgoritmaPemro,nRPL;

        System.out.println("Seleksi Pemilihan Asdos berdasarkan nilai akademik");
        System.out.println("Masukkan nilai akhir dari matakuliah dibawah ini");

        System.out.print("Struktur Data: ");
        nStrukturData = ns.nextFloat();

        System.out.print("Pemrograman Berorientasi Object: ");
        nPBO = ns.nextFloat();

        System.out.print("Basis Data: ");
        nBasisData = ns.nextFloat();

        System.out.print("Algoritma dan Pemrograman: ");
        nAlgoritmaPemro = ns.nextFloat();

        System.out.print("Rekayasa Perangkat Lunak: ");
        nRPL = ns.nextFloat();
    }
}