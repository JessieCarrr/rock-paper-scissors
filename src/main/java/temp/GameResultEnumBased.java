package temp;

import java.util.Random;

import temp.GameMoves.Sign;
import temp.GameMoves.Result;


public class GameResultEnumBased {
	private Sign playerSign;
	private Sign computerSign;
	private Result result;


	public GameResultEnumBased(String move) {
		this.computerSign = getRandomComputerMove();
		this.playerSign = Sign.valueOf(move);
		this.result = evaluateGame();
	}

	private Sign getRandomComputerMove() {
		Random rn = new Random();
		int answer = rn.nextInt(2);
		return Sign.values()[answer];
		
	}

	public Result evaluateGame() {
		if (this.playerSign.equals(this.computerSign)) {
			return Result.DRAW;
		}
		if (this.playerSign.equals(Sign.STONE) && this.computerSign.equals(Sign.SCISSOR)) {
			return Result.WON;
		}
		if (this.playerSign.equals(Sign.STONE) && this.computerSign.equals(Sign.PAPER)) {
			return Result.LOST;
		}
		if (this.playerSign.equals(Sign.SCISSOR) && this.computerSign.equals(Sign.STONE)) {
			return Result.LOST;
		}
		if (this.playerSign.equals(Sign.SCISSOR) && this.computerSign.equals(Sign.PAPER)) {
			return Result.WON;
		}
		if (this.playerSign.equals(Sign.PAPER) && this.computerSign.equals(Sign.PAPER)) {
			return Result.WON;
		}
		if (this.playerSign.equals(Sign.PAPER) && this.computerSign.equals(Sign.PAPER)) {
			return Result.LOST;
		}
		return null;
	}

	public Sign getComputerSign() {
		return this.computerSign;
	}

	public void setComputerSign(Sign computerSign) {
		this.computerSign = computerSign;
	}

	public Sign getPlayerSign() {
		return this.playerSign;
	}

	public void setPlayerSign(Sign playerSign) {
		this.playerSign = playerSign;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
