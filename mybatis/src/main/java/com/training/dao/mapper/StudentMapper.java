package com.training.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import com.training.domain.Student;

public interface StudentMapper {
	@Insert("insert into student (id_student, name, dob, address_street) values (#{idStudent},#{name}, #{dob}, #{addressStreet})")
	void insert(Student student);
}
