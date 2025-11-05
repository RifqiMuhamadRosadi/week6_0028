import java.util.Scanner;

class QuestSwitch_0028 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String predikat;
        String matkul = "anda belum memilih";
        String statusKelulusan = "belum memenuhi syarat untuk posisi tersebut";
        int pilihanMatkul;
        float nRataRata, nIPK, nStrukturData, nPBO, nBasisData, nAlgoritmaPemro, nRPL;

        System.out.println("Seleksi Pemilihan asisten berdasarkan nilai akademik");
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

        if (predikat.equals("A (sangar baik)") || predikat.equals("AB (baik sekali)")) {
            System.out.println("Selamat predikat anda mencukupi dan anda lolos tahap pertama");
            System.out.println("silahkan lanjut memilih matkul yang kamu inginkan untuk menjadi asisten");
            System.out.println("");
            System.out.println("Daftar Mata Kuliah:");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
            System.out.print("pilih (1-5): ");
            pilihanMatkul = ns.nextInt();

            switch (pilihanMatkul) {
                case 1:
                    if (nStrukturData >= 75) {
                        statusKelulusan = "eligible";
                        matkul = "struktur data";
                    } else {
                        statusKelulusan = "belum memenuhi syarat";
                        matkul = "struktur data";
                    }
                    break;

                case 2:
                    if (nPBO >= 75) {
                        statusKelulusan = "eligible";
                        matkul = "pemrograman berorientasi objek";
                    } else {
                        statusKelulusan = "belum memenuhi syarat";
                        matkul = "pemrograman berorientasi objek";
                    }
                    break;

                case 3:
                    if (nBasisData >= 75) {
                        statusKelulusan = "eligible";
                        matkul = "basis data";
                    } else {
                        statusKelulusan = "belum memenuhi syarat";
                        matkul = "basis data";
                    }
                    break;

                case 4:
                    if (nAlgoritmaPemro >= 75) {
                        statusKelulusan = "eligible";
                        matkul = "algoritma dan pemrograman";
                    } else {
                        statusKelulusan = "belum memenuhi syarat";
                        matkul = "algoritma dan pemrograman";
                    }
                    break;

                case 5:
                    if (nRPL >= 75) {
                        statusKelulusan = "eligible";
                        matkul = "rekayasa perangkat lunak";
                    } else {
                        statusKelulusan = "belum memenuhi syarat";
                        matkul = "rekayasa perangkat lunak";
                    }
                    break;

                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
            System.out.println("");
            System.out.print("anda dinyatakan " + statusKelulusan);
            System.out.print(" menjadi asisten pada matkul " + matkul);

        } else {
            System.out.println("mohon maaf, predikat anda masih belum memenuhi kriteria predikat akademik maka anda"
                    + statusKelulusan);
        }
    }
}