package com.luna.domain;

import java.util.List;
import java.util.UUID;

/**
 * Created by xuhao on 2017/5/29.
 */
public class UserInfo {

    private UUID userId;
    private String oneWordIntroduction;
    private String hobbies;
    private String dream;

    private String city;
    private String company;
    private boolean hasHouse;
    private String userName;
    private String idCard;
    private String education;//学历
    private String school;

    private String fondMusics;
    private String fondBooks;
    private String fondCities;
    private String fondExercises;//运动
    private String fondPets;

    private int trustValue;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getOneWordIntroduction() {
        return oneWordIntroduction;
    }

    public void setOneWordIntroduction(String oneWordIntroduction) {
        this.oneWordIntroduction = oneWordIntroduction;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getDream() {
        return dream;
    }

    public void setDream(String dream) {
        this.dream = dream;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isHasHouse() {
        return hasHouse;
    }

    public void setHasHouse(boolean hasHouse) {
        this.hasHouse = hasHouse;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFondMusics() {
        return fondMusics;
    }

    public void setFondMusics(String fondMusics) {
        this.fondMusics = fondMusics;
    }

    public String getFondBooks() {
        return fondBooks;
    }

    public void setFondBooks(String fondBooks) {
        this.fondBooks = fondBooks;
    }

    public String getFondCities() {
        return fondCities;
    }

    public void setFondCities(String fondCities) {
        this.fondCities = fondCities;
    }

    public String getFondExercises() {
        return fondExercises;
    }

    public void setFondExercises(String fondExercises) {
        this.fondExercises = fondExercises;
    }

    public String getFondPets() {
        return fondPets;
    }

    public void setFondPets(String fondPets) {
        this.fondPets = fondPets;
    }

    public int getTrustValue() {
        return trustValue;
    }

    public void setTrustValue(int trustValue) {
        this.trustValue = trustValue;
    }
}
