package nl.utwente.fmt.tt.practicum.part_1;

import de.learnlib.api.SUL;
import de.learnlib.api.SULException;

/**
 * A wrapper class for a Wolf-goat-cabbage implementation
 * See the SUL interface for more info:
 * https://github.com/LearnLib/learnlib/blob/develop/core/src/main/java/de/learnlib/api/SUL.java
 */
public class WGCSUL implements SUL<String, String> {    
    
    
	@Override
	public void pre() {
		// TODO: Implement a model reset before each Query (sequence of steps)
	}
	
	@Override
	public void post() {
	}

	@Override
	public String step(String input) throws SULException {
		// TODO: Implement single step, return output string.
		return "";
	}
}


