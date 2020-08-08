package jlexdev.com.firebaservdemo;

public class Movie {

    private String name;
    private String duration;    // Probar int
    private String description;
    private String cover;       // Foto portada (storage)

    public Movie(String name, String duration, String description, String cover) {
        this.name = name;
        this.duration = duration;
        this.description = description;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
