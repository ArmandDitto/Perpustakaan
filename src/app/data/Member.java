package app.data;

public class Member{
    private String idMember;
    private String namaMember;
    private String alamatMember;
    private String noHP;

    public Member(String idMember, String namaMember, String alamatMember, String noHP){
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.alamatMember = alamatMember;
        this.noHP = noHP;
    }

    public void meminjamBuku() {
        System.out.println("Meminjam Buku");
    }

    public void mengembalikanBuku(){
        System.out.println("Mengembalikan Buku");
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getAlamatMember() {
        return alamatMember;
    }

    public void setAlamatMember(String alamatMember) {
        this.alamatMember = alamatMember;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}