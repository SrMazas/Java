package exercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Collection games = new Collection();

		String saveValue = "";
		String[] splitValues;

		File f = new File(System.getProperty("user.home") + "/save.txt");

		

			try (Scanner s = new Scanner(f)) {
				while (s.hasNext()) {
					saveValue += s.nextLine();
				}
			} catch (IOException e) {
			}

			if (!saveValue.equals("")) {

				splitValues = saveValue.split("~@-#~");
				
				if(splitValues[0]=="-" && splitValues[1]=="-" && splitValues[2]=="-"){
					
				}

				for (int i = 0; i < splitValues.length; i += 3) {
					Videogame game = new Videogame(splitValues[i], Integer.parseInt(splitValues[i + 1]),
							splitValues[i + 2]);
					games.getVideogames().add(game);

				}
			}

			System.out.print("\033[H\033[2J");
			System.out.flush();

			games.menu();

	}
}	
