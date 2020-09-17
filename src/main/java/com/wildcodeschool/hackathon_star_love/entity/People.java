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

    private String planetName;

    public People() {
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public int getHeight() { return height; }

    public float getMass() { return mass; }

    public String getHairColor() { return hairColor; }

    public String getSkinColor() { return skinColor; }

    public String getEyeColor() { return eyeColor; }

    public String getGender() { return gender; }

    public String getPlanetName() { return planetName; }

    public void setId(int id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setHeight(int height) { this.height = height; }

    public void setMass(float mass) { this.mass = mass; }

    public void setHairColor(String hairColor) { this.hairColor = hairColor; }

    public void setSkinColor(String skinColor) { this.skinColor = skinColor; }

    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor; }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPlanetName(String planetName) { this.planetName = planetName; }
}
