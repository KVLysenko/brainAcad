package Labs.Lab10;

public class Film {
    private String name;
    private double duration;
    private String genre;
    public static final String GENRE_COMEDY = "Comedy";
    public static final String GENRE_FANTASTIC = "Fantastic";
    public static final String GENRE_HORRORS = "Horrors";


    public Film(String name, double duration, String genre){
        {
            System.out.println("Создается новый Фильм");
        }
        this.name = name;
        this.duration = duration;
        switch (genre){
            case(GENRE_FANTASTIC):
                this.genre = GENRE_FANTASTIC;
                break;
            case(GENRE_COMEDY):
                this.genre = GENRE_COMEDY;
                break;
            case(GENRE_HORRORS):
                this.genre = GENRE_HORRORS;
                break;
            default:
                this.genre = "Unknown";
        }
        System.out.println("Фильм " + this.name + ", успешно создан.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
