package Week5;

public class Song
{
    private int id;
    private String fullName;
    private String artist;  
    private int count;
//Constrctor
    public Song(int id, String fullName, String artist, int count)
    {
        this.id = id;
        this.fullName = fullName;
        this.artist = artist; 
        this.count = count;
    }

    public void print()
    {
        System.out.println( " " + this.id  + " " + this.fullName + " " + this.artist + " " + this.count);

    }

    public static void add(Song song) {
    }
}