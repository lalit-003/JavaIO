package com_bridgelabz_IO;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestEmployeePayroll {

	private static String HOME = "D:\\BridgeLabz-Fellowship";
	private static String PLAY_WITH_NIO = "TempPlayGround";
	
	@Test
	public void givenPathWhenCheckedThenConfirm() throws IOException
	{
		Path homePath = Paths.get(HOME);
		assertTrue(Files.exists(homePath));
	}
	
	@Test
	public void deleteFilesAndThenCreateDirectory() throws IOException {
		//Delete Files/Directory if Exists
		Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NIO);

		//deleting files in TempPlayGround
		 if(Files.exists(playPath))
		 {
	     FileUtils.deleteFiles(playPath.toFile());
		 }
		Assert.assertTrue(Files.notExists(playPath));
	
	
	//creating Directory
	Files.createDirectory(playPath);
	Assert.assertTrue(Files.exists(playPath));
	
	//Create 10 files
	IntStream.range(1, 10).forEach(cntr -> {
		Path tempFile = Paths.get(HOME + "/" + PLAY_WITH_NIO + "/temp" + cntr);
		assertTrue(Files.notExists(tempFile));
		try {
			Files.createFile(tempFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(Files.exists(tempFile));

	});

	// Listing files
	Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
	Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().startsWith("temp"))
			.forEach(System.out::println);
}

	
}
