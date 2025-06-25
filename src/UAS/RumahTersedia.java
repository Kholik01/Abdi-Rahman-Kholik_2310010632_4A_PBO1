package UAS;

// 8. Inheritance
public class RumahTersedia extends Rumah {
    private boolean sensorListrik;
    private boolean sensorAir;

    public RumahTersedia(String pemilik, String tipe, double luas, boolean sensorListrik, boolean sensorAir) {
        super(pemilik, tipe, luas);
        this.sensorListrik = sensorListrik;
        this.sensorAir = sensorAir;
    }

    public void setSensorListrik(boolean sensorListrik) {
        this.sensorListrik = sensorListrik;
    }

    public void setSensorAir(boolean sensorAir) {
        this.sensorAir = sensorAir;
    }

    public boolean isSensorListrik() {
        return sensorListrik;
    }

    public boolean isSensorAir() {
        return sensorAir;
    }

    // 9. Polymorphism (override)
    @Override
    public String displayInfo() {
        String listrikStatus = sensorListrik ? "Aktif" : "Tidak Aktif";
        String airStatus = sensorAir ? "Aktif" : "Tidak Aktif";

        return super.displayInfo() + 
               "\nSensor Listrik: " + listrikStatus + 
               "\nSensor Air   : " + airStatus;
    }
}
