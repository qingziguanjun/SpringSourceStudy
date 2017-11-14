package mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TestMapper {
	static SqlSessionFactory sqlSessionFactory = null;
	static{
		sqlSessionFactory = MyBatisUtil.getSqlsessionfactory();
	}
	public static void main(String[] args) {
		//testAdd();
		testGet();
	}
	public static void testAdd(){
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 try{
			 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			 User user = new User("haojiasb",5,"baintai");
			 userMapper.insertUser(user);
			 sqlSession.commit();
		 }finally{
			 sqlSession.close();
		 }
	}
	
	public static void testGet(){
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 try{
			 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			 User user = userMapper.getUser(2);
			 System.out.println("name: " + user.getName() + "sex: " + user.getSex());
		 }finally{
			 sqlSession.close();
		 }
	}
	
	
}
