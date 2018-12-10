package br.com.juliogriebeler.movieevaluator.threads;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import br.com.juliogriebeler.movieevaluator.enums.FilePathEnum;
import br.com.juliogriebeler.movieevaluator.model.Title;

public class FileReaderThread {

	public FileReaderThread() {
	}

	public void run() throws FileNotFoundException, IOException {
		Long fileTotalLines = Files.lines(Paths.get(FilePathEnum.LOCAL_NAME_BASIC.url())).count();
		System.out.println(fileTotalLines);
		Long linesToSkip = 1L;
		Long lineLimit = 500L;
		
		while(linesToSkip<fileTotalLines) {
			List<String> lista = Files.lines(Paths.get(FilePathEnum.LOCAL_NAME_BASIC.url())).skip(linesToSkip).limit(lineLimit)
					.filter(line -> line.contains("a")).collect(Collectors.toList());
			for(String line : lista) {
				System.out.println(line);
			}
			linesToSkip+=lineLimit;
		}
	}
	
	private Title parseLineToTitle() {
		Title title = new Title();
		return title;
	}

}
