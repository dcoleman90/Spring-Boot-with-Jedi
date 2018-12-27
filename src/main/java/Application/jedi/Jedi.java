package Application.jedi;

public class Jedi {
    private String name;
    private String race;
    private int age;
    private String lightSaberColor;
    private String rank;

    public Jedi(String name, String race, int age, String lightSaberColor, String rank) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.lightSaberColor = lightSaberColor;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLightSaberColor() {
        return lightSaberColor;
    }

    public void setLightSaberColor(String lightSaberColor) {
        this.lightSaberColor = lightSaberColor;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
