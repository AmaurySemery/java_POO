package com.academiews;

public class Draw {
    public void draw(IBuildingTool buildingTool) {
        buildingTool.decorate();
        System.out.println("Décoration réalisée !");
    }
}
