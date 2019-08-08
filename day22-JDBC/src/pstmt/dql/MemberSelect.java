package pstmt.dql;

import static jdbc.ConnectionInfo.DIRVER;
import static jdbc.ConnectionInfo.PASSWORD;
import static jdbc.ConnectionInfo.URL;
import static jdbc.ConnectionInfo.USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberSelect {

	public  List<Member> getAllMembers() {
		// 필요한 변수들 먼저 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		List<Member> members = new ArrayList<>();
		
		try {
			// 1. 드라이버 로드
			Class.forName(DIRVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT m.member_id " 
			           + "     , m.member_name " 
					   + "     , m.phone " 
			           + "     , TO_CHAR(m.reg_date, 'YYYY-MM-DD') reg_date" 
					   + "     , m.address " 
			           + "     , m.major " 
					   + "     , m.birth_month " 
			           + "     , m.gender " 
					   + "  FROM MEMBER m"
			           + " ORDER BY m.member_id";
			
			pstmt = conn.prepareStatement(sql);
			
			// 4. 쿼리 실행 
			result = pstmt.executeQuery();
			
			// 5. DQL 결과 처리 : 
			// MEMBER 테이블의 컬럼과 똑같은 멤버 변수를 가지는
			// Member 클래스 인스턴스 포장 후
			// 여러 건을 List 에 담아
			// 생성된 리스트를 출력
			
			
			while (result.next()) {
				// (1) 조회된 행의 각 컬럼을 변수로 받는다.
				String memberId = result.getString(1);
				String memberName = result.getString(2);
				String phone = result.getString(3);
				String regDate = result.getString(4);
				String address = result.getString(5);
				String major = result.getString(6);
				int birthMonth = result.getInt(7);
				String gender = result.getString(8);
				
				// (2) 각 변수의 값으로 Member 클래스 인스턴스 포장
				Member member = new Member();
				member.setMemberId(memberId);
				member.setMemberName(memberName);
				member.setPhone(phone);
				member.setRegDate(regDate);
				member.setAddress(address);
				member.setMajor(major);
				member.setBirthMonth(birthMonth);
				member.setGender(gender);
				
				// (3) Member 의 리스트인 members 에 추가
				members.add(member);
			}
			
			// (4) 반복처리에 의해 모든 회원 정보가 담긴
//			//     members 리스트를 출력
//			for (Member member: members) {
//				System.out.println(member);
//			}
			
		} catch (SQLException e) {
			System.err.println("SQL 구문 오류! " + e.getMessage());
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 오류 ! " + e.getMessage());
			e.printStackTrace();
			
		} finally {
			// 6. 자원 해제
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 해제 오류! " + e.getMessage());
				e.printStackTrace();
			}
		}
		
		return members;
	}// end method getAllMember

}