/**
 * Buku20
 */
public class Buku20 {

    String judul, pengarang;
    int halaman, stok, harga;
    
    void tampilInformasi(){
        System.out.println("judul buku =" +judul);
        System.out.println("pengarang =" +pengarang);
        System.out.println("jumlah halaman =" +halaman);
        System.out.println("sisa stok =" + stok);
        System.out.println("harga =" +harga);
    
    }
    void terjual (int jml) [
            stok -= jml;
    ]
void restock (int jml) {
    stok += jml;
}
void gantiHarga (int hrg){
    harga = hrg;
}
}