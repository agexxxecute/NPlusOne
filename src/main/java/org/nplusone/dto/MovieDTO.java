package org.nplusone.dto;

public class MovieDTO {
    private Integer id;
    private String title;
    private int year;
    private boolean isSerial;

    public MovieDTO() {
    }

    public MovieDTO(Integer id, String title, int year, boolean isSerial) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.isSerial = isSerial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSerial() {
        return isSerial;
    }

    public void setSerial(boolean serial) {
        isSerial = serial;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", isSerial=" + isSerial +
                '}';
    }
}
