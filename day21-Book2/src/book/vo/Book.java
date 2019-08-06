package book.vo;

/**
 * å �� ���� ������ ��� Ŭ����
 * ----------------------------
 * �Ϸù�ȣ  : sequence  : int
 * ISBN      : isbn      : String
 * ����      : title     : String
 * ����      : author    : String
 * ���ǻ�    : company   : String
 * ������ �� : totalPage : int
 * ����      : price     : int
 * ������  : quantity  : int
 * ----------------------------
 * ������ �ߺ�����
 * (�⺻������ ���, �Ű����� ������ �ߺ�����)
 * ----------------------------
 * �޼ҵ� :
 * -- ��� �޼ҵ� 
 * void print() : å�� ������ ����ϴ� �޼ҵ�
 * void buy(int amount)  : amount ��ŭ å�� ��� �ø��� �޼ҵ�
 * void sell(int amount) : amount ��ŭ å�� ��� ���̴� �޼ҵ�
 * 
 * -- �� �ʵ带 �����ϴ� �޼ҵ�
 * -- �ڹ� ����(Java Beans) �԰ݿ� ���� ������/������ �޼ҵ�
 * -- getter/setter
 * 
 * getter �ۼ��� �޼ҵ� �̸� �԰�
 *  ==> get���� �����ϰ� ��������ʵ��� ù���ڸ� �빮�ڷ� ����
 *      �Ű������� ����.
 *      ����Ÿ���� �ش� ������� �ʵ��� Ÿ�԰� ����
 * 
 * ��) sequence �ʵ��� getter �� ������ �԰��� ���´�.
 * int getSequnece() {
 * 		return this.requence;
 * }
 * 
 * setter �ۼ��� �޼ҵ� �̸� �԰�
 *  ==> set���� �����ϰ� ������� �ʵ��� ù���ڸ� �빮�ڷ� ����
 *      �Ű������� �ش� ������� �ʵ�� ���� Ÿ�԰� ������ �޴´�.
 *      ���ϰ��� ���� �ۼ�
 * void setSequence(int sequence) {
 *      this.sequcne = sequence;
 * }
 * 
 * ���� ������� �ʵ尡 boolean Ÿ���̶�� getter�� �̸���
 * get���� �������� �ʰ� is�� �����Ѵ�.
 * ==================================================
 * 1. ĸ��ȭ ���� : ��������� private
 *                  ������, �޼ҵ�� public
 *                  
 * 2. �޼ҵ� ������ : toString(), 
 *                    equals() & hashCode() ������
 *                    ==> sequence �ʵ� ���� ������  
 *                    
 * 3. �޼ҵ� ���� : print() �޼ҵ�� this ��ü ����ڵ�� ����                                     
 * ==================================================
 * @author 304
 *
 */
public class Book {
	private int sequence;
	private String isbn;
	private String title;
	private String author;
	private String company;
	private int totalPage;
	private int price;
	private int quantity;
	
	public Book() {
		
	}
	
	public Book(int sequence) {
		this();
		setSequence(sequence);
	}
	
	public Book(int sequence, String isbn) {
		this(sequence);
		setIsbn(isbn);
	}
	
	public Book(int sequence, String isbn, String title) {
		this(sequence, isbn);
		this.title = title;
	}
	
	public Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price,
			int quantity) {
		super();
		this.sequence = sequence;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.company = company;
		this.totalPage = totalPage;
		this.price = price;
		this.quantity = quantity;
	}

	// sequence ��� ������ getter
	public int getSequence() {
		return sequence;
	}
	
	// sequence �� setter
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	// isbn������� �ʵ忡 ���� getter
	public String getIsbn() {
		return isbn;
	}
	
	// isbn�� setter
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void print() {
		System.out.println(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sequence;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (sequence != other.sequence)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String message = "å ����[�Ϸù�ȣ:%d, ISBN:%s"
	             + ", ����:%s, ����:%s"
	             + ", ���ǻ�:%s, ������:%d"
	             + ", ����:%d, ���:%d]";
		
		return String.format(message, sequence, isbn, title, author, company, totalPage, price, quantity);
	}
	
	
	
	
}



