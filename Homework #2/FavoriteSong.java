package package1;

/*
 * 		
This file gives as many details about my favourite song.
Whenever the data describing the song is not obvious from the name
I have added additional info to the right.
		
 */
public class FavoriteSong {
	public static void main(String[] args) {


		String SongTitle = "Enjoy the silence";
		String Artist = "Depeche Mode";
		String Genre = "Synth-pop";
		String AlbumTitle = "Violator";
		char side = 'B';
		int YearRecorded = 1989;
		int YearReleased = 1990;
		int Length = 372;                        // duration of song in seconds
		String Studio = "Puk (Gjerlev, Denmark)";   // the name of the studio
		String Songwriter = "Martin Gore";
		String LabelName = "Mute Records Ltd.";
		double VinylSize = 7.0;                     // the size in inches of the vinyl disk

		System.out.println("Song Title: " + SongTitle);
		System.out.println("Artist: " + Artist);
		System.out.println("Genre: " + Genre);
		System.out.println("Album title: " + AlbumTitle);
		System.out.println("Side: " + side);
		System.out.println("Year recorded: " + YearRecorded);
		System.out.println("Year released: " + YearReleased);
		System.out.println("Duration of song: " + Length + " seconds");
		System.out.println("Name of studio: " + Studio);
		System.out.println("Songwriter: " + Songwriter);
		System.out.println("Label name: " + LabelName);
		System.out.println("Vinyl disk size: " + VinylSize + " inches");

	}
}
