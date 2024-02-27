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
    }
//     public static void main(String[] args) {
            
//         String judul, pengarang;
//         int halaman, stok, harga;
        
//         void tampilInformasi(){
//             System.out.println("judul buku =" +judul);
//             System.out.println("pengarang =" +pengarang);
//             System.out.println("jumlah halaman =" +halaman);
//             System.out.println("sisa stok =" + stok);
//             System.out.println("harga =" +harga);
        
//         void terjual(int jml) {
//             if (stok > 0) {
//             // Stok cukup, lakukan pengurangan
//             stok -= jml;
//             System.out.println("Penjualan " + jml + " buku berhasil!");
//             System.out.println("Sisa stok: " + stok);
//             } else {
//             // Stok tidak cukup, tampilkan pesan error
//             System.out.println("Stok buku tidak mencukupi!");
//             System.out.println("Sisa stok: " + stok);
//             }
//         }
      
//         void restock (int jml) {
//             stok += jml;
//         }
//         void gantiHarga (int hrg){
//             harga = hrg;
//         }
// }

}
    
