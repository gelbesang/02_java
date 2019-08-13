package product.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import product.mybatis.MybatisClient;
import product.vo.Price;
import product.vo.PrimaryKey;
import product.vo.Product;

public class ProductDao {

	// (1) 멤버변수 SqlSessionFactory factory 선언
	SqlSessionFactory factory;

	// (2) 생성자
	// factory 변수를 MybatisClient 를 사용하여 초기화 진행
	public ProductDao() {
		factory = MybatisClient.getFactory();
	}

	// (3) 메소드
	// 1) selectProducts() : List<Product>
	// 조회 쿼리 아이디 : selectAllProducts
	// 리턴타입 , 메소드이름 , 아규먼트 리스트
	public List<Product> selectProducts() {
		SqlSession session = factory.openSession(true);
		List<Product> products = new ArrayList<>();
		try {
			products = session.selectList("product.mapper.productmapper.selectAllProducts");

		} finally {
			if (session != null) {
				session.close();
			}

		}
		return products;

	}

	// 2) selectProduct(PrimaryKey pk) : Product
	// 조회 쿼리 아이디 : selectProduct
	public Product selectProduct(PrimaryKey pk) {
		SqlSession session = factory.openSession(true);
		Product product = new Product();
		try {
			product = session.selectOne("product.mapper.ProductMapper.selectProduct", pk);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return product;

	}

	// 3) insertProduct(Product product) : int
	// 조회 쿼리 아이디 : insertProduct
	public int insertProduct(Product product) {
		SqlSession session = factory.openSession(true);
		int iscount = -1;
		try {
			iscount = session.insert("product.mapper.ProductMapper.insertProduct", product);
		} finally {
			if (session != null) {
				session.close();

			}
		}
		return iscount;

	}

	// 4) updateProduct(PrimaryKey pk, Product product) : int
	// 조회 쿼리 아이디 : updateProduct
	public int updateProduct(PrimaryKey pk, Product product) {
		SqlSession session = factory.openSession(true);
		int upcount = -1;
		try {
			upcount = session.update("product.mapper.ProductMapper.updateProduct",product);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return upcount;
	}

	// 5) deleteProduct(PrimaryKey pk) : int
	// 조회 쿼리 아이디 : deleteProduct
	public int deleteProduct(PrimaryKey pk) {
		SqlSession session = factory.openSession(true);
		int decount = -1;
		try {
			decount = session.delete("product.mapper.ProductMapper.deleteProduct",pk);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return decount;
	}

	// 6) selectProducts(String name) : List<Product>
	// 조회 쿼리 아이디 : selectByName
	public List<Product> selectProducts(String name) {
		SqlSession session = factory.openSession();
		List<Product> sbn = new ArrayList<>();

		try {
			sbn = session.selectList("product.mapper.ProductMapper.selectByName", name);

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return sbn;
	}

	// 7) selectProducts(Price price) : List<Product>
	// 조회 쿼리 아이디 : selectByPrice
	public List<Product> selectProducts(Price price) {
		SqlSession session = factory.openSession(true);
		List<Product> sbp = new ArrayList<>();
		try {
			sbp = session.selectList("product.mapper.ProductMapper.selectByPrice", price);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return sbp;
	}

	// 8) selectProductsByMinPrice(int min) : List<Product>
	// 조회 쿼리 아이디 : selectExpensiveThan
	public List<Product> selectProductsByMinPrice(int min) {
		SqlSession session = factory.openSession(true);
		List<Product> set = new ArrayList<>();
		try {
			set = session.selectList("product.mapper.ProductMapper.selectExpensiveThan",min);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return set;
	}

	// 9) selectProductsByMaxPrice(int max) : List<Product>
	// 조회 쿼리 아이디 : selectCheapThan
	public List<Product> selectProductsByMaxPrice(int max) {
		SqlSession session = factory.openSession(true);
		List<Product> sct = new ArrayList<>();
		try {
			sct = session.selectList("product.mapper.ProductMapper.selectCheapThan",max);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return sct;
	}

	// 10) selectMostExpensive() : List<Product>
	// 조회 쿼리 아이디 : selectMostExpensive
	public List<Product> selectMostExpensive() {
		SqlSession session = factory.openSession(true);
		List<Product> sme = new ArrayList<>();
		try {
			sme = session.selectList("product.mapper.ProductMapper.selectMostExpensive");
		} finally {

		}
		return sme;
	}

	// 11) selectMostAmount() : List<Product>
	// 조회 쿼리 아이디 : selectMostQuantity
	public List<Product> selectMostQuantity() {
		SqlSession session = factory.openSession(true);
		List<Product> smq = new ArrayList<>();
		try {
			smq = session.selectList("product.mapper.ProductMapper.selectMostQuantity");
		} finally {

		}
		return smq;
	}
}
