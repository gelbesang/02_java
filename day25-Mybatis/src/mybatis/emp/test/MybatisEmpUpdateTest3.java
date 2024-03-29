package mybatis.emp.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;

/**
 * EMP 테이블에서 직원 정보 1건을 수정하는 
 * 쿼리를 Mybatis로 실행하는 테스트 클래스
 * ----------------------------------------
 * 수정 : 선 조회 -> 후 수정
 * 
 * 1. 직원 사번으로 1명의 정보를 조회하고 
 * 2. 조회 된 내용이 맵으로 전달 
 * 3. 2의 맵에 수정 할 키(컬럼 명)만 새로 put
 * 4. 3에서 변경 된 맵 객체로 update 실행 
 * 
 * @author Taim
 *
 */
public class MybatisEmpUpdateTest3 {

	public static void main(String[] args) {
		// 1. 팩토리 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession(true);
		try {
			// 조회에 사용 할 객체 선언
			Emp inputEmp = new Emp();
			inputEmp.setEmpno(1111);
			
			// 3. 세션에서 매퍼 인터페이스 객체 얻어서 메소드 호출
		// (1) 매퍼 인터페이스 변수 언언
		EmpMapper mapper;
		mapper = session.getMapper(EmpMapper.class);
		// (2) 인터페이스 변수에 매퍼 객체 얻기
		mapper = session.getMapper(EmpMapper.class);
		// (3) 한건 조회 메소드 호출	
		Emp emp = mapper.selectEmp2(inputEmp);
//		Emp emp = session.selectOne("mybatis.emp.mapper.EmpMapper.selectEmp2", inputEmp);
		// 맵 객체인 emp에 담긴 내용
		// 1111 박준석 SALESMAN   19/08/10
		System.out.println(emp);
		
		// 수정 할 컬럼 = 값
		// mgr = 7698 , sal = 1250, comm = 400, deptno= 30
		emp.setMgr(7698); // auto-boxing
		emp.setSal(1250);
		emp.setComm(400);
		emp.setDeptno(30);
		
		// (2) 조회 된 직원 정보 일부 수정
		 int setCnt = mapper.update2(emp);
		if(setCnt > 0) {
			
			System.out.printf("%d 직원의 정보가 %d건 수정 되었습니다.%n"
					, emp.getEmpno()  ,setCnt);
		}
		
		// (3) 조회 된 정보 재조회
		Emp selectEmp = new Emp();
		selectEmp.setEmpno(1111);
		
		// 매퍼에 selectEmp2 (emp) 호출
		Emp newEmp = mapper.selectEmp2(selectEmp);
		
		
		System.out.println("수정된 정보");
		System.out.println(newEmp);
		
		}finally {			
		// 4. 세션 닫기
			if(session != null) {
			   session.close();
			}
		}
	}

}
