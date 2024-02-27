/**
 * bukuMain20
 */
public class bukuMain20 {

    public static void main(String[] args) {
        Buku20 bk1 = new Buku20();
        bk1.judul = "Today Ends Tommorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
    
Buku20 bk2 = new Buku20("Self reward" , "Maheera ayesha", 160, 29 ,59000);
bk2.terjual(11);
bk2.tampilInformasi();
        
 Buku20 Ircham = new Buku20("Galuh Ayu" , "Muhammad ircham", 1000, 99, 80000);
 Ircham.gantiHarga(90000000);
 Ircham.terjual(98);
 Ircham.tampilInformasi();
 int terjual = Ircham.terjual(8);
        int hargaTotal = Ircham.hitungHargaTotal(terjual);
        int diskon = Ircham.hitungDiskon(hargaTotal);
        Ircham.hitungHargaBayar(hargaTotal, diskon);

    }   
}
    
