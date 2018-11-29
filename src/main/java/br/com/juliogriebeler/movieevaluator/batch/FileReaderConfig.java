package br.com.juliogriebeler.movieevaluator.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import br.com.juliogriebeler.movieevaluator.dto.TitleDTO;

@Configuration
public class FileReaderConfig {
	
	@Bean
    ItemReader<TitleDTO> csvFileItemReader() {
        FlatFileItemReader<TitleDTO> csvFileReader = new FlatFileItemReader<>();
        csvFileReader.setResource(new ClassPathResource("data/students.csv"));
        csvFileReader.setLinesToSkip(1);
 
        LineMapper<TitleDTO> studentLineMapper = createStudentLineMapper();
        csvFileReader.setLineMapper(studentLineMapper);
 
        return csvFileReader;
    }
 
    private LineMapper<TitleDTO> createStudentLineMapper() {
        DefaultLineMapper<TitleDTO> studentLineMapper = new DefaultLineMapper<>();
 
        LineTokenizer studentLineTokenizer = createStudentLineTokenizer();
        studentLineMapper.setLineTokenizer(studentLineTokenizer);
 
        FieldSetMapper<TitleDTO> studentInformationMapper = createStudentInformationMapper();
        studentLineMapper.setFieldSetMapper(studentInformationMapper);
 
        return studentLineMapper;
    }
 
    private LineTokenizer createStudentLineTokenizer() {
        DelimitedLineTokenizer studentLineTokenizer = new DelimitedLineTokenizer();
        studentLineTokenizer.setDelimiter(";");
        studentLineTokenizer.setNames(new String[]{"name", "emailAddress", "purchasedPackage"});
        return studentLineTokenizer;
    }
 
    private FieldSetMapper<TitleDTO> createStudentInformationMapper() {
        BeanWrapperFieldSetMapper<TitleDTO> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
        studentInformationMapper.setTargetType(TitleDTO.class);
        return studentInformationMapper;
    }
	
	
}
