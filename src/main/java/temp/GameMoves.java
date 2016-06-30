package temp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GameMoves {

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Sign
{
    STONE(1, "Stein"), SCISSOR(2, "Schere"), PAPER(3, "Papier");
	 
	private Integer id;
	private String name;

	private Sign(final Integer id, final String name) {
		this.id = id;
	    this.name = name;
	}
	

	public String getName(){
		return name;
	}
    public void setName(String name){
	    this.name = name;
	}
	 public String toString() {
	 	return name;
	}
	public Integer getId(){
	    return id;
	}
    public void setId(Integer id){
	    this.id = id;
	}

}

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Result 
{
	WON(1, "Gewonnen"), LOST(2, "Verloren"), DRAW(3, "Unentschieden");
	private Integer id;
	private String name;

	private Result(final Integer id, final String name) {
		this.id = id;
	    this.name = name;
	}
	
    public String getName(){
    	return name;
	}
	public void setName(String name){
    	this.name = name;
	}
    public Integer getId(){
    	return id;
	}
	public void setId(Integer id){
    	this.id = id;
	}
	public String toString() {
	 	return name;
	}
}
}
