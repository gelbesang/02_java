package mybatis.member.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

/**
 * Member 테이블에서 조회하는 클래스
 * @author Taim
 *
 */
public class SelectMemberTest {

	public static void main(String[] args) {
		// 1. factory 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession();
		
		try {
			// 3. 세션을 통해 쿼리 실행
			// (1) 전체 조회 쿼리 아이디
			//     mybatis.member.mapper.MemberMapper.selectAll
			List<Member> members =
					session.selectList("mybatis.member.mapper.MemberMapper.selectAll");
		
			// 조회 결과 foreach 출력
			for (Member member : members) {
				// 맵의 모든 데이터 출력
//				System.out.println(member);
				// 사번, 이름만 맵에서 추출
			 System.out.println(member);
			}
			System.out.println("========================================");
			
			
			// (2) member 1명 조회
//		     mybatis.member.mapper.MemberMapper.selectMember
			Member member =
					session.selectOne("mybatis.member.mapper.MemberMapper.selectMember","M002");
			System.out.println(member);
		}finally {
			// 4. 닫기
						if (session != null)
							session.close();
		}

	}

}
