package app.data;

public class Buku{
   private String judulBuku;
   private String ISBN;
   private String penulis;
   private String penerbit;
   private int JmlHalaman;

   public Buku(String judulBuku, String ISBN, String penulis, String penerbit, int JmlHalaman){
      this.judulBuku = judulBuku;
      this.ISBN = ISBN;
      this.penulis = penulis;
      this.penerbit = penerbit;
      this.JmlHalaman = JmlHalaman;
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
      JmlHalaman = jmlHalaman;
   }
}