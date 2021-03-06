package sudoku.parsing.config;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.junit.Test;

import sudoku.common.test.utils.CommonTestUtils;

public class ConfigFileReaderTest {

	@Test
	public void testReadConfigFile() throws FileNotFoundException, IOException, ParseException {
		File configFile = CommonTestUtils.getTestFile("config.json");
		List<TestFileParsedInfo> testFiles = ConfigFileReader.readConfigFile(configFile);
		assertNotEquals(0, testFiles.size());

		for (TestFileParsedInfo testFileInfo : testFiles) {
			assertNotNull(testFileInfo.getId());
			assertNotNull(testFileInfo.getBoardtype());
			assertNotNull(testFileInfo.getPuzzle());
			assertNotNull(testFileInfo.getAnswer());
		}
	}

}
