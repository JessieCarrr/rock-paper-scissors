package game;

import java.util.Random;

public class GameResult {

	private String playerSign;
	private String computerSign;
	private String result;

	private static final String ROCK = "Stein";
	private static final String SCISSORS = "Schere";
	private static final String PAPER = "Papier";
	private static final String WON = "Gewonnen";
	private static final String DRAW = "Unentschieden";
	private static final String LOST = "Verloren";

	public GameResult(String move) {
		this.computerSign = getRandomComputerMove();
		this.playerSign = move;
		this.result = evaluateGame();
	}

	private String getRandomComputerMove() {
		Random rn = new Random();
		int answer = rn.nextInt(3) + 1;
		switch (answer) {
		case 1:
			return ROCK;
		case 2:
			return SCISSORS;
		case 3:
			return PAPER;

		}
		return null;
	}

	public String evaluateGame() {
		if (this.playerSign.equals(this.computerSign)) {
			return DRAW;
		}
		if (this.playerSign.equals(ROCK)) {
			return evaluateStone();
		}
		if (this.playerSign.equals(SCISSORS)) {
			return evaluateScissors();
		}
		if (this.playerSign.equals(PAPER)) {
			return evaluatePaper();
		}
		return "Falsche Eingabe! Erlaubte Werte sind nur 'Stein', 'Schere' und 'Papier'!";
	}

	private String evaluateStone(){
		return computerSign.equals(SCISSORS)? WON : LOST;
		
	}
	
	private String evaluateScissors(){
		return computerSign.equals(PAPER)? WON : LOST;
		
	}
	
	private String evaluatePaper(){
		return computerSign.equals(ROCK)? WON : LOST;
		
	}
	
	public String getComputerSign() {
		return this.computerSign;
	}

	public void setComputerSign(String computerSign) {
		this.computerSign = computerSign;
	}

	public String getPlayerSign() {
		return this.playerSign;
	}

	public void setPlayerSign(String playerSign) {
		this.playerSign = playerSign;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
