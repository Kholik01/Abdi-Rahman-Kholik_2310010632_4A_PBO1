package UAS;

public class Rumah {
    // 3. Atribut (dengan enkapsulasi)
    private String pemilik;
    private String tipe;
    private double luas;

    // 4. Constructor
    public Rumah(String pemilik, String tipe, double luas) {
        this.pemilik = pemilik;
        this.tipe = tipe;
        this.luas = luas;
    }

    // 5. Mutator
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    // 6. Accessor
    public String getPemilik() {
        return pemilik;
    }

    public String getTipe() {
        return tipe;
    }

    public double getLuas() {
        return luas;
    }

    // 9. Polymorphism (method ini akan dioverride)
    public String displayInfo() {
        return "Pemilik: " + pemilik + "\nTipe: " + tipe + "\nLuas: " + luas + " m2";
    }
}
