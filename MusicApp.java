package Week5;
import helpers.ConsoleColours;
import helpers.InputReader;
import java.util.ArrayList;

public class MusicApp
{
    private static ArrayList<Song> songs = new ArrayList<>();
    public static void main(String[] args)
    {
    
        System.out.println(ConsoleColours.CONSOLE_CLEAR);
        
        addSong();
        printHeading();
    
        executeMenuChoice();
    }



    private static void executeMenuChoice()
    {
        boolean appIsRunning = true;

        while(appIsRunning == true)
        {
            int choice = getMenuChoice();

            switch(choice)
            {
            
                case 1: createSong(); break;
                case 2: RemoveSong(); break;
                case 3: printAllSongs(); break;
                case 4: PrintPopSongs(); break;
                case 5: appIsRunning = false; break;
            }
        }
    }

private static void PrintPopSongs() {

    int choice = InputReader.getInt("/n select top 1 to 5 songs from list (1 to 5) > ");

    int count = 0;
    for(Song song : songs)
    {
        if (count < choice)
            song.print();
        count++;
    }
    }

private static void printAllSongs()
{
    for(Song song : songs)
    {
        song.print();
    }
}

private static void RemoveSong()
{
    // for (Song songs: songs);


    // {
    //  System.out.println();
    // }


 

    int id = InputReader.getInt("Please enter id");
    songs.remove(id);
}

private static void addSong() 
{
    Song song1 = new Song (1, "Broken" ,  "Deno", 99999999);
    Song song2 = new Song (2, "Umbrella" ,  "Rihanna", 88888888);
    Song song3 = new Song (3, "Runner-Up" ,  "Unfaithful", 77777777);
    Song song4 = new Song (4, "Love Lockdown" ,  "Kanye West", 66666666);
    Song song5 = new Song (5, "BM(London View)" ,  "OTP", 55555555);
    Song song6 = new Song (6, "He's Dead" ,  "Rap cartel", 44444444);
    Song song7 = new Song (7, "Nice to Meet yh" ,  "Wes Nelson & Yxng Bane", 33333333);
    Song song8 = new Song (8, "Overpriced" ,  "M Huncho", 22222222);
    Song song9 = new Song (9, "Pretty One" ,  "Koomz", 11111111);
    Song song10 = new Song (10,"Darling" ,  "D-Block Europe", 00000000);
/*
 * Added 10 different Songs 
 */



    songs.add(song1);
    songs.add(song2);
    songs.add(song3);
    songs.add(song4);
    songs.add(song5);
    songs.add(song6);
    songs.add(song6);
    songs.add(song7);
    songs.add(song8);
    songs.add(song9);
    songs.add(song10);




    //song = new Song(title: null, artist:null, count:0);
}
/**
 * @return
 */
private static int getMenuChoice()
{
   printTitle(" My Best Music App of 2022");

    int choice = 0;
    boolean isvalid = false;

    while(isvalid == false)
    {
    
        System.out.println(" 1. Create Songs");
        System.out.println(" 2. Remove Song");
        System.out.println(" 3. Print All Songs");
        System.out.println(" 4. Print Popular Songs");
        System.out.println(" 5. Quit");

        choice = InputReader.getInt("/n Enter your selection here (1 to 5) > ");
        if(choice < 1 || choice > 5)
        {
            System.out.println("\n Try again with another option!\n");
        }
        else isvalid = true;
    }

    return choice;
}

private static void createSong()
{
    System.out.println("/n Adding new song");
    int id = InputReader.getInt("please enter your Song Id");
    String fullName  = InputReader.getString("Please enter your Song FullName");
    String artist = InputReader.getString("Please enter your Song Artist");
    int count = InputReader.getInt("please enter your Song count");

    //Song song = new Song(id, name, artist, count);
    Song mySong = new Song(id,fullName, artist, count);
    songs.add(mySong);
   
     
}

   
private static void printHeading() 
    {
        //System.out.println(ConsoleColours.ANSI_BRIGHT_BG_BLUE);

        System.out.println(" ===================================");
        System.out.println(" CO452 Prograsmming Concepts 2022-23");
        System.out.println(" ===================================");
        System.out.println();
        System.out.println(" by Mohammad Qasim Matloob");

        printTitle("MyMusicApp");

    }
    
private static void printTitle(String title)
{
    //System.out.println(ConsoleColours.ANSI_BRIGHT_WHITE);        
    System.out.println();
    System.out.println(title);
    System.out.println(" -----------------");
    System.out.println();
    //System.out.println(ConsoleColours.ANSI_BRIGHT_BLACK);
}




    
}