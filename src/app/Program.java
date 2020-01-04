package app;
import app.data.Buku;
import java.util.HashMap;

public class Program{
    public static void main(String[]args){

        HashMap<String, Buku> lemariBuku = new HashMap<String,Buku>();
        lemariBuku.put("978-3-16-23131", new Buku ("Lupin III","978-3-16-23131","Shingen Tokugawa","Gramedia",1004));
        lemariBuku.put("976-3-15-23144", new Buku ("Petualangan Tintin","976-3-15-23144","James Wadsworth","Elex Media Komputindo",89));
        lemariBuku.put("763-9-89-32785", new Buku ("Art of War","763-9-89-32785","Zhuge Liang","Erlangga",372));


        int no=1;
        for(String key: lemariBuku.keySet()){
            String judul = lemariBuku.get(key).getJudulBuku();
            String isbn = lemariBuku.get(key).getISBN();
            String penulis = lemariBuku.get(key).getPenulis();
            int halaman = lemariBuku.get(key).getJmlHalaman();

            System.out.println("Nomor       : "+no++);
            System.out.println("Judul       : "+judul);
            System.out.println("ISBN        : "+isbn);
            System.out.println("Penulis     : "+penulis);
            System.out.println("Tebal buku  : " +halaman);
            System.out.println();
        }
    }


}     