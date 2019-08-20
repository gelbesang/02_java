package mybatis.emp.mapper;

import java.util.List;
import java.util.Map;

import mybatis.emp.vo.Emp;

/**
 * EmpMapper.xml 에 정의되어 있는
 * 각 쿼리 아이디를 메소드 이름으로하는
 * 
 * 추상 메소드들을 매핑하는 인터페이스
 * 
 * @author 304
 *
 */
public interface EmpMapper {

	/**
	 * 1건 혹은 전체 조회결과를 내는 동적쿼리를 수행하는 메소드
	 * @param emp
	 * @return
	 */
	public abstract List<Emp> select(Emp emp);
	
	/**
	 * keyword 에 의한 이름 유사 검색 조회 결과를 내거나
	 * keyword 가 생략(null) 인 경우 전체 검색 결과를 내는 
	 * 동적쿼리를 수행하는 메소드
	 * @param keyword
	 * @return
	 */
	public abstract List<Emp> selectByName(String keyword);
	
	/**
	 * Emp 전체 목록 조회
	 * Emp 한 사람의 정보를 Map 형태로 만들어서
	 * 그 Map의 목록(List) 으로 리턴하는 메소드
	 * 
	 * @return Emp Map 의 List
	 */
	public abstract List<Map<String, Object>> selectAll();
	
	/**
	 * 매개변수로 입력된 사번(empnoo)에 해당하는
	 * 직원 한명의 모든 정보를 조회
	 * 
	 * @param empno : int : 조회할 직원의 사번
	 * @return 직원 1명의 상세 정보 : Map
	 */
	public abstract Map<String, Object> selectEmp(int empno);
	
	
	/**
	 * 직원 정보 1건을 삽입하는 메소드
	 * 
	 * @param empMap : Map : 추가할 직원의 정보가 담긴 Map 객체
	 * @return 추가에 성공한 행의 개수
	 */
	public abstract int insert(Map<String, Object> empMap);
	
	
	/**
	 * 직원의 정보 1건을 수정
	 * @param empMap : Map : 수정할 직원의 정보가 담긴 Map 객체
	 * @return 수정에 성공한 행의 개수
	 */
	public abstract int update(Map<String, Object> empMap);
	
	
	/**
	 * 직원의 정보 1건을 사번을 사용하여 삭제하는 메소드
	 * 
	 * @param empno : int : 삭제할 직원의 사번
	 * @return 삭제에 성공한 행의 개수
	 */
	public abstract int delete(int empno);
	
	/**
	 * Emp 전체 직원 목록 조회하는 메소드
	 * 
	 * @return 직원 전체 목록을 Emp 타입의 
	 *         목록(List)으로 리턴함
	 */
	public abstract List<Emp> selectAll2();
	
	
	/**
	 * 직원정보 1건을 조회하는 메소드
	 * 입력값으로 Emp 타입의 객체를 받아서 조회한다.
	 * 이 때, 매개변수로 받은 Emp 타입 객체에서
	 * empno 를 추출하여 PK(empno)와 비교하는 쿼리 수행
	 * 
	 * @param emp
	 * @return 조회된 직원 1명의 전체 정보
	 */
	public abstract Emp selectEmp2(Emp emp);
	
	/**
	 * 추가할 직원의 전체 정보가 담겨있는 Emp 타입의 객체
	 * emp 를 매개변수로 받아 insert 를 수행하는 메소드
	 * 
	 * @param emp : Emp : 추가할 직원의 정보가 담긴 객체
	 * @return 삽입(insert) 에 성공한 행의 개수
	 */
	public abstract int insert2(Emp emp);
	
	/**
	 * 수정 할 컬럼을 if 구문으로 동적으로 지정 할 수 있는 
	 * 동적 update 쿼리를 실행하는 메소드 
	 * @param emp : Emp : 수정 할 값이 담긴 객체
	 * @return 수정 (update)에 성공 한 행의 개수
	 */
	public abstract int update2(Emp emp);
	/**
	 * 수정할 직원의 전체 정보가 담겨있는 Emp 타입의 객체
	 * emp 를 매개변수로 받아 update 를 수행하는 메소드
	 * 
	 * @param emp : Emp : 수정할 직원의 정보가 담긴 객체
	 * @return 수정(update)에 성공한 행의 개수
	 */
	public abstract int update3(Emp emp);
	/**
	 * 삭제할 직원의 정보가 담겨있는 Emp 타입의 객체
	 * emp 를 매개변수로 받아 delete 를 수행하는 메소드
	 * 
	 * @param emp : Emp : 삭제할 직원의 정보가 담긴 객체
	 * @return 삭제(delete)에 성공한 행의 개수
	 */
	public abstract int delete2(Emp emp);
	
}