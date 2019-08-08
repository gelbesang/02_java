package book.dao;

import static book.dao.ConnectionInfo.DIRVER;
import static book.dao.ConnectionInfo.PASSWORD;
import static book.dao.ConnectionInfo.URL;
import static book.dao.ConnectionInfo.USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class JdbcBookShelf implements BookShelf {

	// 커넥션 정보 : ConnnectionInfo 의 static 필드로 사용
	
	// 2. 생성자 
	public JdbcBookShelf() {
		// 1. 드라이버 로드
		try {
			Class.forName(DIRVER);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 오류!" 
		                      + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Override
	public int add(Book book) throws DuplicateException {
		// INSERT 필요 객체 선언
		Connection conn = null;	
		PreparedStatement pstmt= null;
		try {
		// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			// 3. 쿼리 준비
			
			String sql = "INSERT INTO BOOK b (b.sequence ,b.isbn, b.title, b.autor, b.company, b.total_page, b.price, b.quantity)"
					+ "   VALUES (?, ? ,? ,? ,? ,? ,? ,?)";
			
			
			//매핑
			pstmt.setInt(1, 1);
			pstmt.setString(2,"9788936433598");
			pstmt.setString(3,"채식주의자");
			pstmt.setString(4,"한강");
			pstmt.setString(5,"창비");
			pstmt.setInt(2,247);
			pstmt.setInt(2,10800);
			pstmt.setInt(2,10);
			
			// 4. 쿼리 실행
			int addCnt = pstmt.executeUpdate();
			if (addCnt > 0) {
				System.out.printf("%d 행이 입력되었습니다.%n", addCnt);
			}
			
		} catch (SQLException e) {
			System.err.println("SQL 구문 오류! " + e.getMessage());
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
		return 1;
	}

	@Override
	public int set(Book book) throws NotFoundException {
		// UPDATE 필요 객체 선언
		Connection conn = null;	
		PreparedStatement pstmt= null;
		
		try {
		// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// 3. 쿼리 준비
			String sql = "UPDATE Book b " 
					+ "       SET b.sequence = ?  "
					+ "         , b.isbn = ?  "
					+ "         , b.title = ?"  
					+ "         , b.autor = ?" 
					+ "         , b.company = ?" 
					+ "         , b.total = ?" 
					+ "         , b.total_page = ?" 
					+ "         , b.price =?" 
					+ "     WHERE b.sequence =?";
		
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setInt(1, 1);
					pstmt.setString(2,"9788936433598");
					pstmt.setString(3,"채식주의자");
					pstmt.setString(4,"한강");
					pstmt.setString(5,"창비");
					pstmt.setInt(2,247);
					pstmt.setInt(2,10800);
					pstmt.setInt(2,10);
		
					// 4. 쿼리 실행
					int addCnt = pstmt.executeUpdate();
					if (addCnt > 0) {
						System.out.printf("%d 행이 업데이트 되었습니다.", addCnt);
					}
					
				} catch (SQLException e) {
					System.err.println("SQL 구문 오류! " + e.getMessage());
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
				return 1;
			}

	@Override
	public int remove(Book book) throws NotFoundException {
		// DELETE 필요 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rmCnt = -1;
		// 2. 커넥션 맺기
		try {
			
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
			//매핑
			
			String sql = "DELETE Book b " 
					+    " WHERE b.sequence = ?  ";
			
			Book Book = new Book();
			book.setSequence(1);
			
			pstmt = conn.prepareStatement(sql);
			
			
			rmCnt = pstmt.executeUpdate();
			
			if (rmCnt > 0) {
				System.out.printf("%d 행이 삭제되었습니다.%n", rmCnt);
			}
			
		} catch (SQLException e) {
			System.err.println("SQL 구문 오류! " + e.getMessage());
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
		return rmCnt;
	}

	@Override
	public Book get(Book book) throws NotFoundException {
		// SELECT 1건 필요 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		Book foundBook = null;
		
		
		// 2. 커넥션 맺기
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// 3. 쿼리 준비
			String sql =  "SELECT b.sequence "
					+ "         , b.isbn "
					+ "         , b.title "  
					+ "         , b.autor" 
					+ "         , b.company" 
					+ "         , b.total" 
					+ "         , b.total_page" 
					+ "         , b.price" 
					+ "      FROM Book b"
					+ "     WHERE b.sequence = ?";
		
			pstmt = conn.prepareStatement(sql);
			
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
				
			// 4. 쿼리 실행
			result = pstmt.executeQuery();
			
			// 5. 결과 처리
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		// 6. 자원 해제
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// SELECT 전체행 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return null;
	}
	
	
	private boolean isExists(Book book) {
		boolean exists = false;
		// SELECT 1건 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return exists;
	}

	@Override
	public List<Book> getBooksByTitle(String title) {
		// SELECT title 포함된 책 목록 필요 객체 선언
		
				// 2. 커넥션 맺기
				
				// 3. 쿼리 준비
				
				// 4. 쿼리 실행
				
				// 5. 결과 처리
				
				// 6. 자원 해제
		return null;
	}

	@Override
	public List<Book> getBooksByPrice(String title) {
		// SELECT price min ~max 사이인
		// min, max 값 포하마 책목록 조회
		// 필요 객체 선언
		
				// 2. 커넥션 맺기
				
				// 3. 쿼리 준비
				
				// 4. 쿼리 실행
				
				// 5. 결과 처리
				
				// 6. 자원 해제
		return null;
	}

}

