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
    void terjual(int jml) {
        if (stok > 0) {
          // Stok cukup, lakukan pengurangan
          stok -= jml;
          System.out.println("Penjualan " + jml + " buku berhasil!");
          System.out.println("Sisa stok: " + stok);
        } else {
          // Stok tidak cukup, tampilkan pesan error
          System.out.println("Stok buku tidak mencukupi!");
          System.out.println("Sisa stok: " + stok);
        }
      }
      
void restock (int jml) {
    stok += jml;
}
void gantiHarga (int hrg){
    harga = hrg;
}
}