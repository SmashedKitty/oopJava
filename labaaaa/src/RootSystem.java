public class RootSystem extends Land{
    private int soilResources;
    private int abilityToSpeak;
    private int area;

    public RootSystem(int soilResources, int abilityToSpeak, int area,
                      String soilType, int soilQuality, int sunnyDaysPy, int midTemp) {
        super(soilType, soilQuality, sunnyDaysPy, midTemp);
        this.soilResources = soilResources;
        this.area = area;
        this.abilityToSpeak = abilityToSpeak;
    }

    public void replant(int soilResources, int area){
        this.soilResources = soilResources;
        this.area = area;
    }

    public void grow() {
        area += 10;
    }

    public void rootsNeeds() {
        if (soilResources < 50) {
            System.out.println("Trees must be fertilized");
        } else {
            System.out.println("Trees are satisfied");
        }
    }

    public void burn() {
        area = 0;
        abilityToSpeak = 0;
        soilResources = 0;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getSoilResources() {
        return soilResources;
    }

    public void setSoilResources(int soilResources) {
        this.soilResources = soilResources;
    }

    public int getAbilityToSpeak() {
        return abilityToSpeak;
    }

    public void setAbilityToSpeak(int abilityToSpeak) {
        this.abilityToSpeak = abilityToSpeak;
    }
}
