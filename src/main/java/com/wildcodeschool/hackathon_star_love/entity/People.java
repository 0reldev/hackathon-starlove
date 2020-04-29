package com.wildcodeschool.hackathon_star_love.entity;

public class People {



    private int id;
    private String name;
    private int height;
    private float mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String gender;
    private int planetId;


    public People() {
    }


    public int getId() { return id; }
    public String getName() { return name; }
    public int getHeight() { return height; }
    public float getMass() { return mass; }
    public String getHairColor() { return hairColor; }
    public String getSkinColor() { return skinColor; }
    public String getEyeColor() { return eyeColor; }
    public int getPlanetId() { return planetId; }


    public void setId() { this.id = id; }
    public void setName() { this.name = name; }
    public void setHeight() { this.height = height; }
    public void setMass() { this.mass = mass; }
    public void setHairColor() { this.hairColor = hairColor; }
    public void setSkinColor() { this.skinColor = skinColor; }
    public void setEyeColor() { this.eyeColor = eyeColor; }
    public void setPlanetId() { this.planetId = planetId; }


}
