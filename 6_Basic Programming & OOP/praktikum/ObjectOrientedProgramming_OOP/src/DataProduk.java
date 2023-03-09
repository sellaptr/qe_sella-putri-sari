public class DataProduk {
//    membuat atribut
    private String nama;
    private String deskripsi;
    private int harga;
    private int stok;

//    membuat method setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setStok(int stok){
        this.stok= stok;
    }

//    membuat method get
    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void getInfo() {
        System.out.println("===\nINFO PRODUK\nnama: " + nama + "\nDeskripsi: " + deskripsi + "\nHarga: " + harga + "\nJumlahStok: " + stok + "\n===");
    }

    public static void main(String[] args) {
        DataProduk coffee = new DataProduk();
        coffee.setNama("coffee");
        coffee.setDeskripsi("this is coffee");
        coffee.setHarga(15000);
        coffee.setStok(10);
        coffee.getInfo();

        DataProduk milk = new DataProduk();
        milk.setNama("milk");
        milk.setDeskripsi("this is fresh milk");
        milk.setHarga(25000);
        milk.setStok(10);
        milk.getInfo();

        DataProduk appleJuice = new DataProduk();
        appleJuice.setNama("apple juice");
        appleJuice.setDeskripsi("this is juice");
        appleJuice.setHarga(18000);
        appleJuice.setStok(20);
        appleJuice.getInfo();
    }
}


