public class Land {
    private String soilType;
    private double soilQuality;//k that multiply tree grown speed
    private final int sunnyDaysPy;
    private final int midTemp;
    private boolean isFertile;

    // Конструктор
    public Land(String soilType, int soilQuality, int sunnyDaysPy, int midTemp) {
        this.soilType = soilType;
        this.soilQuality = soilQuality;
        this.sunnyDaysPy = sunnyDaysPy;
        this.midTemp = midTemp;
        this.isFertile = soilQuality >= 1;
    }

    public void isSunny() {
        if(sunnyDaysPy <= 100) {
            System.out.println("I almost have no Sun");
        } else if (sunnyDaysPy <= 200) {
            System.out.println("Im not Sunny");
        } else if (sunnyDaysPy <= 300) {
            System.out.println("Im Sunny");
        } else {
            System.out.println("Im very Sunny");
        }
    }

    public void fertilize(int fertilizePoints) {
        soilQuality += fertilizePoints;
        System.out.println("Im was fertilized, now my soil quality is: " + soilQuality);
        if(soilQuality >= 1) {
            this.isFertile = true;
            System.out.println("now im fertile");
        } else {
            System.out.println("im still not fertile");
        }
    }

    public void replaceSoil(String newSoil) {
        this.soilType = newSoil;
        System.out.println("my type soil now is: " + this.soilType);
    }

    public void temperatureLevel() {
        if(midTemp < 10){
            System.out.println("here is cold");
        } else if((midTemp > 25)){
            System.out.println("here is hot");
        } else {
            System.out.println("here is ok");
        }
    }

    public void isAlive() {
        if(isFertile) {
            System.out.println("im Alive");
        } else {
            System.out.println("im Dead");
        }
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public double getSoilQuality() {
        return soilQuality;
    }

    public int getSunnyDaysPy() {
        return sunnyDaysPy;
    }

    public int getMidTemp() {
        return midTemp;
    }

    public boolean isFertile() {
        return isFertile;
    }
}
