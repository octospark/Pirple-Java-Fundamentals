package package1;

import java.util.HashMap;
import java.util.Map;

public class Homework4 {
	public static void main(String[] args) {
		String[] labels = {"SongTitle", "Artist", "Genre", "AlbumTitle", "side", "YearRecorded", 
				"YearReleased", "Length", "Studio", "Songwriter", "LabelName", "VinylSize"};
		String[] data = {"Enjoy the silence", "Depeche Mode", "Synth-pop", "Violator", "B", "1989",
				"1990", "372 seconds", "Puk (Gjerlev, Denmark)", "Martin Gore", "Mute Records Ltd.",
				"7 inches"};
		
		//Create a hash map and put the data into it
		Map<String, String> songData = new HashMap<>();
		for (int i = 0; i < labels.length; i++)
			songData.put(labels[i], data[i]);
		
		
		// Print all the data from the HashMap using the keys from the labels array
		for (int i = 0; i < labels.length; i++)
			System.out.println(labels[i] + ": " + songData.get(labels[i]));
		
	}
}


