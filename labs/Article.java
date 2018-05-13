package labs;

public class Article extends ReadingMaterial{
	String publication;
	
	public Article(String publication, String title, String author, int numPages){
		super(title, author, numPages);
		this.publication = publication;
	}
	
	public void summary(){
		System.out.println(title + ", written by " + author + ", published in " + publication);
	}
}
