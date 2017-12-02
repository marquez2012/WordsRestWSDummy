package selflearning.words;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Word")
public class WordsDayService {

	
	@GET
	@Path("/getWordDay")
	public String getWordOfDay() {
		return "step1";
	}
	
}
//http://localhost:8080/WordDay/rest/Word/getWordDay