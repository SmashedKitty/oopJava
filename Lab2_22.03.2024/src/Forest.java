public class Forest extends Land{
    private int midHeight;
    private String typeForest;
    private int ageForest;

    public Forest(
            String soilType, int soilQuality, int sunnyDaysPy, int midTemp,
            int midHeight, String typeForest, int ageForest) {
        super(soilType, soilQuality, sunnyDaysPy, midTemp);
        this.midHeight = midHeight;
        this.typeForest = typeForest;
        this.ageForest = ageForest;
    }

    public void replant(String typeForest){
        this.typeForest = typeForest;
        this.midHeight = 0;
        this.ageForest = 0;
    }

    public void growForest() {
        ageForest += 1;
        midHeight += 2;
        System.out.println("Forest has grown. Age: " + ageForest + ", Mid Height: " + midHeight);
    }

    public void checkForestHealth() {
        if (ageForest > 50) {
            System.out.println("Forest is old and needs care.");
        } else {
            System.out.println("Forest is healthy.");
        }
    }
    public void burn() {
        midHeight = 0;
        ageForest = 0;
        System.out.println("Forest has burned down.");
    }

    public int getMidHeight() {
        return midHeight;
    }

    public String getTypeForest() {
        return typeForest;
    }

    public int getAgeForest() {
        return ageForest;
    }
}
