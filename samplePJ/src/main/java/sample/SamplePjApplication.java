package sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("sample.common.dao.mapper")
public class SamplePjApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplePjApplication.class, args);
	}

}
