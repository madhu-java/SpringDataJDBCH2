package com.madhu.SpringDataJdbcH2.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	@Autowired
private SpringJdbcApp app;
	
	@Override
	public void run(String... args) throws Exception {
		app.insert();
		app.insert(new CourseInfo(2,"spring"));
		app.insert(new CourseInfo(3,"Juint"));
		app.deleteById(2);
		app.update( "SpringBoot",1);
		CourseInfo info=app.findById(3);
		System.out.println(info);

	}

}
