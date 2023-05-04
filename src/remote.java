public class remote {
    private String name;
    private int speed;
    public String direction ;
    
    public remote(String name) {
        this.name = name;
        this.speed = 0;
        this.direction = "Depan";
    }
    
    public void maju(int speed) {
        this.speed = speed;
        this.direction = "Maju";
        System.out.println(this.name + " sedang bergerak maju dengan kecepatan " + this.speed + " km/jam");
    }
    
    public void mundur(int speed) {
        this.speed = speed;
        this.direction = "Mundur";
        System.out.println(this.name + " sedang bergerak mundur dengan kecepatan " + this.speed + " km/jam");
    }
    
    public void kanan() {
        this.direction = "Kanan";
        System.out.println(this.name + " sedang berbelok ke kanan");
    }
    
    public void kiri() {
        this.direction = "Kiri";
        System.out.println(this.name + " sedang berbelok ke kiri");
    }
    
    public void berhenti() {
        this.speed = 0;
        this.direction = "Berhenti";
        System.out.println(this.name + " sudah berhenti");
    }
    
    public static void main(String[] args) {
        remote mobil1 = new remote("Mobil A");
        mobil1.maju(80);
        mobil1.kanan();
        mobil1.mundur(20);
        mobil1.kiri();
        mobil1.berhenti();
        
        remote mobil2 = new remote("Mobil B");
        mobil2.maju(70);
        mobil2.mundur(20);
        mobil2.berhenti();
    }
}
