package mybatis.emp.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;

/**
 * EMP 테이블에서 
 * 직원 정보 1건을 삭제하는 클래스
 * Mybatis 를 사용하여 삭제한다. 
 *
 * @author Taim
 *
 */
public class MybatisEmpDeleteTest3 {

	public static void main(String[] args) {
		// 1. 팩토리 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession(true);
		
		try {
			// 3. 쿼리 실행 및 결과 받기
			Emp rmEmp = new Emp();
			rmEmp.setEmpno(1111);

			// 매퍼 인터페이스 변수 선언
			EmpMapper mapper;
			
			// 변수 초기화
			mapper = session.getMapper(EmpMapper.class);
			
			// 사용 : 변수.메소드() ;
			int rmCnt = mapper.delete2(rmEmp);
//			int rmCnt = session.delete("mybatis.emp.mapper"
//					                + ".EmpMapper.delete2", rmEmp);
			
			if (rmCnt > 0) {
				System.out.printf("직원정보 %d 건이 삭제되었습니다.", rmCnt);
			} else {
				System.out.println("삭제된 정보가 없습니다.");
			}
			
		} finally {
			// 4. 세션 닫기
			if (session != null) {
				session.close();
			}
		}
		
	}

}