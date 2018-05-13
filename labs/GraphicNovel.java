package labs;

public class GraphicNovel extends Novel{
	String illustrator;
	
	public GraphicNovel(String[] characters, String title, String illustrator, String author, int numPages){
		super(characters, title, author, numPages);
		this.illustrator = illustrator;
	}
	
	public void summary(){
		System.out.println(title + ", written by " + author + ", illustrated by " + illustrator);
	}
}
