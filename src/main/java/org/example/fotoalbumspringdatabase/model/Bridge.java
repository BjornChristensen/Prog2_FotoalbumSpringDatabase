package org.example.fotoalbumspringdatabase.model;

public class Bridge {
    private String name;
    private String imageFileName;
    private String description;

    public Bridge(){}

    public Bridge(String name, String imageFileName, String description) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImageFileName() {
        return imageFileName;
    }
    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "Bridge [name=" + name + ", imageFileName=" + imageFileName + "]";
    }
}
