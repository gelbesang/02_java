package book.mybatis.client;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Mybatis의 커넥션인 세션을 생성하는
 * sqlSessionFactory 클래스 인스턴스를 
 * 생성하고 생성한 인스턴스를
 * 싱글턴 으로 관리하는 클래스
 * ------------------------------------
 * 싱글턴 : 디자인 패턴
 * 
 * 어떤 인스턴스 프로그램이 실행되는 동안
 * 단 한개로 유지되는 기법
 * 
 * 1. 싱글턴으로 유지할 타입의 변수를 public static 하게 선언
 * 2. 생성자를 private 변경
 * 3. 싱글턴으로 유지 할 타입을 리턴하는 public static 메소드 
 * 	  getInstance() 등을 선언하고
 *    이 메소드 내부엥서만 생성자 호출을 하도록 구성
 * ------------------------------------
 * @author Taim
 *
 */
public class MybatisClient {
	// 1. 
	// 싱글 턴으로 관리할 타입(sqlSessionFactory)의
	// static 변수를 선언
	private static SqlSessionFactory factory;
	
	
	// 2. 싱글 턴으로 관리할 변수를 초기화
	// public MaybatisClient(){
//		mybati-config.xml 파일을 InputScream으로 읽어서
//		sqlSessionFactory 생성
	String resource ="m";
	
	// 3. 
	// 싱글턴으로 관리 할 타입 을 리턴하는 
	// static 메소드 getFactory() 를 선언
	public static SqlSessionFactory getFactory() {
		if(factory == null) {
			new MybatisClient();
		}
		return factory;
	}
}
