package app.data;

public class Buku{
   private String judulBuku;
   private String ISBN;
   private String penulis;
   private String penerbit;
   private int JmlHalaman;
   private int stok;

   public Buku(String judulBuku, String ISBN, String penulis, String penerbit, int JmlHalaman, int stok){
      this.judulBuku = judulBuku;
      this.ISBN = ISBN;
      this.penulis = penulis;
      this.penerbit = penerbit;
      this.JmlHalaman = JmlHalaman;
      this.stok = stok;
   }

   public String getJudulBuku() {
      return judulBuku;
   }

   public void setJudulBuku(String judulBuku) {
      this.judulBuku = judulBuku;
   }

   public String getISBN() {
      return ISBN;
   }

   public void setISBN(String iSBN) {
      ISBN = iSBN;
   }

   public String getPenulis() {
      return penulis;
   }

   public void setPenulis(String penulis) {
      this.penulis = penulis;
   }

   public String getPenerbit() {
      return penerbit;
   }

   public void setPenerbit(String penerbit) {
      this.penerbit = penerbit;
   }

   public int getJmlHalaman() {
      return JmlHalaman;
   }

   public void setJmlHalaman(int jmlHalaman) {
      this.JmlHalaman = jmlHalaman;
   }

   public int getStok() {
      return stok;
   }

   public void setStok(int stok) {
      this.stok = stok;
   }

   public void dipinjam(){
      this.stok--;
   }
}