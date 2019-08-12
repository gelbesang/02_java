package mybatis.member.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

/**
 * 상용이를 업데이트 하는 클래스
 * @author Taim
 *
 */
public class UpdateMemberTest {

	public static void main(String[] args) {
		// 1. 팩토리 얻기
		SqlSessionFactory factory =MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession(true);
		try {
			
			// 3. 세션에서 쿼리 실행
			//(1) 한명 조회
			//mybatis.member.mapper.MemberMapper.updateMember
			Member member =
					session.selectOne("mybatis.member.mapper.MemberMapper.selectMember","M011");
			
		System.out.println(member);
		
		//수정
		member.setPhone(6598);
		member.setAddress("아산시");
		member.setGender("M");
		
		// (2) 조회 된 member 정보 일부 수정
		
		int setCnt=
				session.update("mybatis.member.mapper.MemberMapper.updateMember",member);
		
		if(setCnt > 0) {
			
			System.out.printf("%s member의 정보가 %d건 수정 되었습니다.%n"
					, member.getMemberId()  ,setCnt);
		}
		
		// (3) 조회 된 정보 재조회
		Member selectMember = new Member();
		selectMember.setMemberId("M011");
		Member newMember= session.selectOne("mybatis.member.mapper.MemberMapper.selectMember",selectMember);
		System.out.println(newMember);
		
		}
		finally {			
			// 4. 세션 닫기
				if(session != null) {
				   session.close();
				}
			}
	}

}
