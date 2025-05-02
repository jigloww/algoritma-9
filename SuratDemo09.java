import java.util.Scanner;
public class SuratDemo09 {
    public static void main(String[] args) {
        StackSurat09 stack = new StackSurat09(10);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat09 surat = new Surat09(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("----- Surat berhasil diterima -----");
                    break;

                case 2:
                    Surat09 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("----- Surat berikut diproses -----");
                        diproses.tampilkan();
                    }
                    break;

                case 3:
                    Surat09 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("----- Surat izin terakhir -----");
                        terakhir.tampilkan();
                    } else {
                        System.out.println("Belum ada surat.");
                    }
                    break;

                case 4:
                System.out.print("Masukkan nama mahasiswa yang dicari: ");
                String cariNama = sc.nextLine();
                Surat09 hasil = stack.cariSurat(cariNama);
                
                if (hasil != null) {
                    System.out.println("Surat ditemukan:");
                    System.out.println("ID Surat     : " + hasil.idSurat);
                    System.out.println("Nama         : " + hasil.namaMahasiswa);
                    System.out.println("Kelas        : " + hasil.kelas);
                    System.out.println("Jenis Izin   : " + (hasil.jenisIzin == 'S' ? "Sakit" : "Izin"));
                    System.out.println("Durasi       : " + hasil.durasi + " hari");
                    System.out.println();
                } else {
                    System.out.println("Surat dengan nama " + cariNama + " tidak ditemukan.");
                }
                break;
                

                case 0:
                    System.out.println("----- Keluar program -----");
                    System.out.println("----- Terimakasih -----");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
