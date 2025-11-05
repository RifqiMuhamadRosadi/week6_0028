import java.util.Scanner;

class QuestSwitch_0028 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String predikat;
        int pilihanMatkul;
        float nRataRata, nIPK, nStrukturData, nPBO, nBasisData, nAlgoritmaPemro, nRPL;

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

        nRataRata = (nStrukturData + nPBO + nBasisData + nAlgoritmaPemro + nRPL) / 5;
        nIPK = nRataRata / 25;

        if (nIPK >= 3.75) {
            predikat = "A (sangar baik)";
        } else if (nIPK >= 3.5) {
            predikat = "AB (baik sekali)";
        } else if (nIPK >= 3) {
            predikat = "B (baik)";
        } else if (nIPK >= 2.5) {
            predikat = "BC (cukup)";
        } else {
            predikat = "C (kurang)";
        }

        System.out.println("");
        System.out.println("IPK: " + nIPK);
        System.out.println("predikat nilai: " + predikat);

        if(predikat.equals("A (sangar baik)")||predikat.equals("AB (baik sekali)")){
            System.out.println("Selamat predikat anda mencukupi dan anda lolos tahap pertama");
        }else{
            System.out.println("Mohon maaf, predikat anda masih belum memenuhi kriteria");
        }

    }
}