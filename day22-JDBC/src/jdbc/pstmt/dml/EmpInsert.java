package jdbc.pstmt.dml;

import static jdbc.ConnectionInfo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * EMP테이블에 
 * 1행을 삽입하는 INSERT쿼리를 
 * JDBC를 통해서 처리하는 클래스
 * ---------------------------------------- 
 * 1. 드라이버 로드(5번째 Class.forName(..))
 * 2. 커넥션 맺기(DriverMangager 클래스 사용)
 * 3. 쿼리 준비 (PreparedStatement 사용)
 * 4. 쿼리 실행 (executeQuery(), executeUpdata())
 * 5. 결과 처리 (while, 리턴 값에 따라 적절한 처리)
 * 6. 자원 해제 (오픈한 역순)
 * 
 * 모든 과정에서 SQLException 처리
 * ---------------------------------------- 
 * @author Taim
 *
 */
public class EmpInsert {

	public static void main(String[] args) {
		// 필요한 변수들 먼저 선언
		Connection conn = null;	
		PreparedStatement pstmt= null;
		
		try {
		// 1. 드라이버 로드
		Class.forName(DIRVER);
		
		// 2. 커넥션 맺기
		conn = DriverManager.getConnection(URL,USER,PASSWORD);
		
		// 3. 쿼리 준비
		String sql = "INSERT INTO EMP(EMPNO, ENAME ) VALUES (?,?)";
		pstmt = conn.prepareStatement(sql);
		
		// ? 매핑
		System.out.println("사번을 숫자 네자리로 입력하세요");
		pstmt.setInt(1, new Scanner(System.in).nextInt());
		
		System.out.println("사원 이름을 입력하세요");
		pstmt.setString(2, new Scanner(System.in).nextLine());
		
		
		// 4. 쿼리 실행 : ? 가 모두 매핑 된
		//    pstmt 개게를 통해서 쿼리실행
		int addCnt = pstmt.executeUpdate();
		
		// 5. DML의 결과 처리 executeUpdate()를 통해서
		//    몇 건의 데이터가 처리 되었는지를 나타내는
		//    정수 리턴값으로 처리 가능
		if (addCnt > 0) {
			System.out.printf("%d행이 입력 되었습니다.%n", addCnt);
		}
		}catch(SQLException e){
			System.err.println("SQL 구문 오류!" + e.getMessage() );
		}catch(ClassNotFoundException e){
			System.err.println("드라이버 오류 !" + e.getMessage());
			e.printStackTrace();
			
		}finally {
			// 6. 자원 해체
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException e){
				System.err.println("자원 해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}
		
		

	}

}
