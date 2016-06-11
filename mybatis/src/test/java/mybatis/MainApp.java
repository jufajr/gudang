package mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.training.dao.mapper.StudentMapper;
import com.training.domain.Student;

public class MainApp {
	public static void main(String[] args) throws IOException, SQLException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			System.out.println("Going to insert record.....");
			Student student = new Student("10123", "Zara", new Date(), "Jl. Suryo 56");
			
			// First option (using mapper name)
			//session.insert("com.training.dao.mapper.StudentMapper.insert", student);
			
			// Second option (using mapper class)
			 StudentMapper mapper = session.getMapper(StudentMapper.class);
			 mapper.insert(student);
			session.commit();
			
			System.out.println("Record Inserted Successfully ");
		} finally {
			session.close();
		}
	}
}
