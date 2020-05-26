package sudoku.parsing;

import java.util.List;

public class JSONBoardObject {
	List<List<String>> rows;

	public JSONBoardObject(List<List<String>> rows) {
		this.rows = rows;
	}

	public List<List<String>> getRows() {
		return rows;
	}

	public void setRows(List<List<String>> rows) {
		this.rows = rows;
	}
	
	
}
