package game;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

	

	@RequestMapping("/")
	public String index() {
		return "Willkommen bei Stein Schere Papier!";
	}

	
	@RequestMapping(value="/game", method=RequestMethod.GET)
	public @ResponseBody GameResult moveByPlayer(@RequestParam(value="sign") String sign) {
		return new GameResult(sign);
	}
	

	@RequestMapping(value="/game", method=RequestMethod.PUT)
	public @ResponseBody GameResult moveByPlayerJson(@RequestBody String sign) {
		return new GameResult(sign);
	}
}
