package com.example.jobs_analysis.files_controller;


public class JobsPOJO {
    
    private String title;
    private String company;
    private String location;
    private String type;
    private String level;
    private String yearsOfExp;
    private String country;
    private String skills;
    
    
    public JobsPOJO(String title, String company, String location,String type
                                        ,String level, String yearsOfExp, String country, String skills ) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.type = type;
        this.level = level;
        this.yearsOfExp = yearsOfExp;
        this.country = country;
        this.skills = skills;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }    
    
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    
    public String getYearsOfExp() {
        return yearsOfExp;
    }
    public void setYearsOfExp(String yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
    
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }    

    @Override
    public String toString() {
        return "JobsPOJO{" + "title=" + title + ", company=" + company + ", location=" + location + ", type=" + type + ", level=" + level + ", yearsOfExp=" + yearsOfExp + ", country=" + country + ", skills=" + skills + '}';
    }
    



    
}
