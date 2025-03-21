public class Tree extends Forest{
    private final String treeSpiece;
    private int growSpeed;
    private int height;
    private boolean isSick;

    public Tree(String treeSpiece, int height, String soilType, int soilQuality, int sunnyDaysPy, int midTemp, int midHeight, String typeForest, int ageForest) {
        super(soilType, soilQuality, sunnyDaysPy, midTemp, midHeight, typeForest, ageForest);
        this.growSpeed = soilQuality;
        this.treeSpiece = treeSpiece;
        this.height = height;
        this.isSick = false;
    }

    public void checkNeeds(){
        if(super.getMidHeight() > height){
            System.out.println("Im Small and need more light");
        }
        if(super.getMidTemp() < 10){
            System.out.println("there is cold");
        }
        if (isSick) {
            System.out.println("I'm sick and need treatment.");
        }
    }

    @Override
    public void fertilize(int fertilizePoints) {
        growSpeed += fertilizePoints;
        System.out.println("MMM I love fertilizing, now my grow speed is: " + growSpeed);
    }

    public void grow(){
        if(!isSick) {
            height += growSpeed;
            if((int)(Math.random() * 10) == 0 ){
                this.isSick = true;
                System.out.println("I dont feel good");
            }
        } else {
            System.out.println("I dont feel good");
        }
    }

    public void chop() {
        this.height = 0;
        System.out.println("Now im stump");
        if((int)(Math.random() * 10) == 0 ){
            this.isSick = true;
            System.out.println("I dont feel good");
        }
    }

    public void heal() {
        if (isSick) {
            isSick = false;
            System.out.println("I've been healed!");
        } else {
            System.out.println("I'm not sick.");
        }
    }


    public String getTreeSpiece() {
        return treeSpiece;
    }

    public int getHeight() {
        return height;
    }

    public int getGrowSpeed() {
        return growSpeed;
    }
}
