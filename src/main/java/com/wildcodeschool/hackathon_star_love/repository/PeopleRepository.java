package com.wildcodeschool.hackathon_star_love.repository;

import com.wildcodeschool.hackathon_star_love.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PeopleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public People findLoveGlobal() {

        try {

            Connection connection = jdbcTemplate.getDataSource().getConnection();
            String request = "SELECT people.*, planet.name AS origin FROM people JOIN planet ON planet.id = people.planet_id ORDER BY rand() LIMIT 1;";
            PreparedStatement statement = connection.prepareStatement(request);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("people.name");
                int height = resultSet.getInt("height");
                float mass = resultSet.getFloat("mass");
                String hairColor = resultSet.getString("hair_color");
                String skinColor = resultSet.getString("skin_color");
                String eyeColor = resultSet.getString("eye_color");
                String gender = resultSet.getString("gender");
                String planetName = resultSet.getString("origin");

                People people = new People();
                people.setId(id);
                people.setName(name);
                people.setHeight(height);
                people.setMass(mass);
                people.setHairColor(hairColor);
                people.setSkinColor(skinColor);
                people.setEyeColor(eyeColor);
                people.setGender(gender);
                people.setPlanetName(planetName);

                return people;
            }
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }

    public People findLovePlanet(String planetName) {

        try {

            Connection connection = jdbcTemplate.getDataSource().getConnection();

            String request = "SELECT people.*, planet.name AS origin FROM people JOIN planet ON planet.id = people.planet_id WHERE planet.name = ? ORDER BY rand() LIMIT 1;";
            PreparedStatement statement = connection.prepareStatement(request);

            statement.setString(1, planetName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("people.name");
                int height = resultSet.getInt("height");
                float mass = resultSet.getFloat("mass");
                String hairColor = resultSet.getString("hair_color");
                String skinColor = resultSet.getString("skin_color");
                String eyeColor = resultSet.getString("eye_color");
                String gender = resultSet.getString("gender");
                String origin = resultSet.getString("origin");

                People people = new People();
                people.setId(id);
                people.setName(name);
                people.setHeight(height);
                people.setMass(mass);
                people.setHairColor(hairColor);
                people.setSkinColor(skinColor);
                people.setEyeColor(eyeColor);
                people.setGender(gender);
                people.setPlanetName(origin);

                return people;
            }
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }

    public People findLoveChoice(String planetName, String gender, String eyeColor, String hairColor) {

        try {

            Connection connection = jdbcTemplate.getDataSource().getConnection();

            String request = "SELECT people.*, planet.name AS origin FROM people JOIN planet ON planet.id = people.planet_id WHERE planet.name = ? AND people.gender = ? AND people.eye_color = ?" +
                    "AND people.hair_color = ? ORDER BY rand() LIMIT 1;";
            PreparedStatement statement = connection.prepareStatement(request);

            statement.setString(1, planetName);
            statement.setString(2, gender);
            statement.setString(3, eyeColor);
            statement.setString(4, hairColor);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("people.name");
                int height = resultSet.getInt("height");
                float mass = resultSet.getFloat("mass");
                String skinColor = resultSet.getString("skin_color");
                String origin = resultSet.getString("origin");

                People people = new People();
                people.setId(id);
                people.setName(name);
                people.setHeight(height);
                people.setMass(mass);
                people.setHairColor(hairColor);
                people.setSkinColor(skinColor);
                people.setEyeColor(eyeColor);
                people.setGender(gender);
                people.setPlanetName(origin);

                return people;
            }
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }
}
