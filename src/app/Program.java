package app;
import app.data.Buku;
import app.data.Member;
import java.util.HashMap;

public class Program{
    public static void main(String[]args){

        //DB Buku
        HashMap<String, Buku> lemariBuku = new HashMap<String,Buku>();
        lemariBuku.put("978-3-16-23131", new Buku ("Lupin III","978-3-16-23131","Shingen Tokugawa","Gramedia",1004));
        lemariBuku.put("976-3-15-23144", new Buku ("Petualangan Tintin","976-3-15-23144","James Wadsworth","Elex Media Komputindo",89));
        lemariBuku.put("763-9-89-32785", new Buku ("Art of War","763-9-89-32785","Zhuge Liang","Erlangga",372));
        //End of DB Buku

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
        
        //DB Member
        HashMap<String, Member> daftarMember = new HashMap<String, Member>();
        daftarMember.put("MQ-0001", new Member("MQ-0001", "Rohman Alamin", "BSD", "089978095949"));
        daftarMember.put("MQ-0002", new Member("MQ-0002", "Zubaidah Alamix", "Ciledug", "082276565999"));
        daftarMember.put("MQ-0003", new Member("MQ-0003", "Rohmatoni Mogigi", "Depok", "081277790249"));
        //End of DB Member

        int noM=1;
        for(String key: daftarMember.keySet()){
            String idMember = daftarMember.get(key).getIdMember();
            String namaMember = daftarMember.get(key).getNamaMember();
            String alamatMember = daftarMember.get(key).getAlamatMember();
            String telpMember = daftarMember.get(key).getNoHP();

            System.out.println("Nomor     : "+noM++);
            System.out.println("ID Member : "+idMember);
            System.out.println("Nama      : "+namaMember);
            System.out.println("Alamat    : "+alamatMember);
            System.out.println("Telepon   : "+telpMember);
            System.out.println();

        }
    }


}     