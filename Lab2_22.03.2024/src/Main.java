// Базовый класс Vehicle


public void main() {

        Land land = new Land("Loam", 2, 250, 20);
        System.out.println("Land created: " + land.getSoilType() + ", Fertile: " + land.isFertile());

        Forest forest = new Forest("Loam", 2, 250, 20, 15, "Deciduous", 30);
        System.out.println("Forest created: " + forest.getTypeForest() + ", Age: " + forest.getAgeForest());

        Tree tree = new Tree("Oak", 10, "Loam", 2, 250, 20, 15, "Deciduous", 30);
        System.out.println("Tree created: " + tree.getTreeSpiece() + ", Height: " + tree.getHeight());

        land.isSunny();
        land.fertilize(1);
        land.temperatureLevel();

        forest.replant("Coniferous");
        forest.growForest();
        forest.checkForestHealth();
        forest.burn();

        tree.fertilize(2);
        tree.grow();
        tree.checkNeeds();
        tree.heal();
}

