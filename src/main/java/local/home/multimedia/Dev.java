package local.home.multimedia;

public class Dev {
    private String url;
    private String name;
    private String bio;

    public Dev(String url, String name, String bio) {
        this.url = url;
        this.bio = bio;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
