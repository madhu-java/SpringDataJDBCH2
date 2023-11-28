package com.madhu.SpringDataJdbcH2.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class SpringJdbcApp {
	private static final String INSERT_QUERY = """
			INSERT INTO COURSE(ID,CNAME)VALUES(?,?);
			""";
	private static final String DELETE_QUERY = """
			DELETE FROM COURSE WHERE ID=?;
			""";
	private static final String UPDATE_QUERY = """
			UPDATE COURSE SET CNAME=? WHERE ID=?;
			""";
	private static final String SELECT_QUERY = """
			SELECT * FROM COURSE WHERE ID=?;
			""";
	@Autowired
	private JdbcTemplate springJdbc;
	public void insert() {
		springJdbc.update(
				"""
						insert into course(id,cname) values(1,'java');
						
						""");
	}
	public void insert(CourseInfo course) {
		springJdbc.update(INSERT_QUERY,course.getId(),course.getCname());
	}
   public void deleteById(int id) {
	   springJdbc.update(DELETE_QUERY,id);
   }
   public void update(String cname,int id) {
	   springJdbc.update(UPDATE_QUERY,cname,id);
	   
   }
   public CourseInfo findById(long id) {
	   return springJdbc.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(CourseInfo.class),id);
	   
   }
   
 
}
