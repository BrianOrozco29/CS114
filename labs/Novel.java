package labs;

public class Novel extends ReadingMaterial{
	String[] characters;
	
	public Novel(String[] characters, String title, String author, int numPages){
		super(title, author, numPages);
		this.characters = characters;
	}
	
	public void listCharacters(){
		for(int i = 0; i < characters.length;i++){
			System.out.println(characters[i]);
		}
	}
}
