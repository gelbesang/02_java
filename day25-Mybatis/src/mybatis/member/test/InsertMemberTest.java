package mybatis.member.test;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

/**
 * member 테이블에 한명을 추가하는 클래스
 * @author Taim
 *
 */
public class InsertMemberTest {

	public static void main(String[] args) {
		// 1.factory 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		// 2. session 얻기
		SqlSession session = factory.openSession(true);
		
		try {
			// 3. 세션 통해서 쿼리 실행 & 결과 받기
			// mybatis.member.mapper.MemberMapper.insertMember
			
			// 객체 생성
			Member member = new Member();
			member.setMemberId("M011");
			member.setMemberName("박상용");
			member.setMajor("일본어학과");
			
			//DML 수행에 성공한 건수를 리턴
			int addCnt = session.insert("mybatis.member.mapper.MemberMapper.insertMember",member);
		
			if (addCnt > 0) {
				System.out.println("직원정보=" + member);
				System.out.printf("%d 행이 삽입되었습니다.%n", addCnt);
			}
			
		} finally {
			// 4. 세션 닫기(해제)
			if (session != null)
				session.close();
		}
	}

}
