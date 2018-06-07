package com.telusko.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.telusko.beans.Student;

@Component
public class Account {
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<Student> getStudents() {
		return jdbc.query("select * from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt("stud_id"));
				s.setName(rs.getString("stud_name"));
				s.setAge(rs.getString("stud_age"));
				s.setMarks(rs.getString("stud_marks"));
				s.setCity(rs.getString("stud_city"));
				return s;
			}
		});

	}

	public List<Student> getStudent1() {
		return jdbc.query(
				"SELECT stud_name,stud_marks,stud_age,stud_city FROM student HAVING stud_age BETWEEN 10 AND 20\r\n"
						+ "ORDER BY stud_marks DESC LIMIT 0,5",
				new RowMapper<Student>() {

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						Student s = new Student();
						s.setName(rs.getString("stud_name"));
						s.setMarks(rs.getString("stud_marks"));
						s.setAge(rs.getString("stud_age"));
						s.setCity(rs.getString("stud_city"));
						return s;
					}
				});
	}

	public List<Student> getStudent2() {
		return jdbc.query(
				"SELECT stud_name,stud_marks,stud_age,stud_city FROM student HAVING stud_age BETWEEN 20 AND 30\r\n"
						+ "ORDER BY stud_marks DESC LIMIT 0,5",
				new RowMapper<Student>() {

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						Student s = new Student();
						s.setName(rs.getString("stud_name"));
						s.setMarks(rs.getString("stud_marks"));
						s.setAge(rs.getString("stud_age"));
						s.setCity(rs.getString("stud_city"));
						return s;
					}
				});
	}

	public List<Student> getStudent3() {
		return jdbc.query(
				"SELECT stud_name,stud_marks,stud_age,stud_city FROM student HAVING stud_age BETWEEN 30 AND 40\r\n"
						+ "ORDER BY stud_marks DESC LIMIT 0,5",
				new RowMapper<Student>() {

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						Student s = new Student();
						s.setName(rs.getString("stud_name"));
						s.setMarks(rs.getString("stud_marks"));
						s.setAge(rs.getString("stud_age"));
						s.setCity(rs.getString("stud_city"));
						return s;
					}
				});
	}

}
