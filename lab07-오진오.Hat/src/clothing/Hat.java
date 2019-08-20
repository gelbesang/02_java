package clothing;

/**
 * 프로젝트명 : lab07-Hat 패키지 이름 : clothing 클래스 이름 : Hat
 * ---------------------------------- 
 * 멤버변수 : 
 * hatId : String : 모자제품의 일련 번호(ht001로 일련번호를 줄 용도) 
 * type : String : 모자의 종류(스포츠캡, 페도라, 중절모, 썬캡, 베레모, 후드, 카우보이 등)
 * material : String : 모자의 소재(가죽, 플라스틱, 천, 라탄 등) 
 * size : double : 모자 둘레 길이(단위 :cm) 
 * color : String : 모자의 색상 
 * price : double : 모자의 가격 
 * quantity : int : 재고 수량
 * gender : char : 사용성별 (M:남성, F:여성, U:공용 으로 설정)
 * ----------------------------------- 
 * 생성자 1. 기본생성자 2. 매개변수를 받는 생성자(멤버 변수 1개씩
 * 증가시키며 모두) 중복 정의 
 * --------------------------------------------- 
 * 메소드
 * 
 * 1. public double discount(int amount) : amount 만큼 할인한 가격을 리턴. 원래 가격보다 큰 값 할인은
 * 불가능하도록 설정. 할인가가 원래 제품가격보다 크면 "제품 가격보다 크게 할인할 수 없습니다." 내용 출력
 * 
 * 2. public void dye(String color) : 모자 색상을 입력된 color 로 염색하여 색상을 변경
 * 
 * 3. public int sell(int amount) : amount 만큼 판매(재고를 줄임). 원래 수량보다 많이 판매 불가
 * 
 * 4. public int buy(int amount) : amount 만큼 구매(재고를 늘림)
 * 
 * 5. 각 필드에 대한 접근자/수정자 정의
 * 
 * 6. hatId 기준으로 equals(), hashCode() 재정의
 * 
 * 7. toString() 재정의
 * 
 * ===================================================================
 * 
 * @author Taim
 *
 */
public class Hat {
/*
 *  멤버변수 : 
 * hatId : String : 모자제품의 일련 번호(ht001로 일련번호를 줄 용도) 
 * type : String : 모자의 종류(스포츠캡, 페도라, 중절모, 썬캡, 베레모, 후드, 카우보이 등)
 * material : String : 모자의 소재(가죽, 플라스틱, 천, 라탄 등) 
 * size : double : 모자 둘레 길이(단위 :cm) 
 * color : String : 모자의 색상 
 * price : double : 모자의 가격 
 * quantity : int : 재고 수량
 * gender : char : 사용성별 (M:남성, F:여성, U:공용 으로 설정)
 */
	// 멤버변수 선언
	private String hatId;
	private String type;
	private String material;
	private double size;
	private String color;
	private double price;
	private int quantity;
	private char gender;
	
	// 기본 생성자 , 중복정의
	public Hat() {
		
	}

	public Hat(String hatId) {
		this();
		this.hatId = hatId;
	}
	public Hat(String hatId,String type) {
		this(hatId);
		this.type = type;
	}
	public Hat(String hatId,String type,String material) {
		this(hatId,type);
		this.material = material;
	}
	public Hat(String hatId,String type,String material, double size) {
		this(hatId,type,material);
		this.size = size;
	}
	public Hat(String hatId,String type,String material, double size,String color) {
		this(hatId,type,material,size);
		this.color = color;
	}
	public Hat(String hatId,String type,String material, double size,String color,double price) {
		this(hatId,type,material,size,color);
		this.price = price;
	}
	public Hat(String hatId,String type,String material, double size,String color,double price,int quantity) {
		this(hatId,type,material,size,color,price);
		this.quantity = quantity;
	}
	public Hat(String hatId,String type,String material, double size, String color, double price
			 , int quantity, char gender) {
		this(hatId, type, material, size, color, price, quantity);
		this.gender = gender;
	}
	
	/*
	 * 메소드
	 * 
	 * 1. public double discount(int amount) : amount 만큼 할인한 가격을 리턴. 원래 가격보다 큰 값 할인은
	 * 불가능하도록 설정. 할인가가 원래 제품가격보다 크면 "제품 가격보다 크게 할인할 수 없습니다." 내용 출력
	 * 
	 * 2. public void dye(String color) : 모자 색상을 입력된 color 로 염색하여 색상을 변경
	 * 
	 * 3. public int sell(int amount) : amount 만큼 판매(재고를 줄임). 원래 수량보다 많이 판매 불가
	 * 
	 * 4. public int buy(int amount) : amount 만큼 구매(재고를 늘림)
	 * 
 	 * 5. 각 필드에 대한 접근자/수정자 정의
 	 * 
	 * 6. hatId 기준으로 equals(), hashCode() 재정의
	 * 
	 * 7. toString() 재정의
	 */
	
	/**
	 * 메소드 명 discount
	 * @param amount : int 타입의 변수
	 * @return amount 할인 된 가격
	 */
	public double discount(int amount) { // 메소드 헤드
		Hat hat = new Hat();
		double discount = 0; // 할인 된 가격
		
		if (hat.getPrice() - amount >= 0) {
			discount = hat.getPrice() - amount;
			
		} else {
			System.out.println("제품 가격보다 크게 할인할 수 없습니다.");
		}
		
		return discount;
		
	}
	/**
	 * 
	 * @param color : String 타입의 변수
	 */
	public void dye(String color) {

		this.color= color;
	}
	/**
	 * 
	 * @param amount : int 타입의 변수
	 * @return amount :팔린 수량
	 */
	public int sell(int amount) {

		
		if (amount > this.quantity) {
			System.out.println("판매가 불가능합니다.");
			
		} else {
			this.quantity -= amount;
		}
		
		return this.quantity;
	}
	/**
	 * 
	 * @param amount : int 타입의 변수
	 * @return amount : 구매 한 재고
	 */
	public int buy(int amount) {
		this.quantity += amount;
		
		return this.quantity;
		
	}

	
	// 각 필드에 대한 접근자/수정자 정의
	public String getHatId() {
		return hatId;
	}

	public void setHatId(String hatId) {
		this.hatId = hatId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// hatId 기준으로 equals(), hashCode() 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hatId == null) ? 0 : hatId.hashCode());
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
		Hat other = (Hat) obj;
		if (hatId == null) {
			if (other.hatId != null)
				return false;
		} else if (!hatId.equals(other.hatId))
			return false;
		return true;
	}
	
	//toString() 재정의

	@Override
	public String toString() {
		return "Hat [hatId=" + hatId + ", type=" + type + ", material=" + material + ", size=" + size + ", color="
				+ color + ", price=" + price + ", quantity=" + quantity + ", gender=" + gender + "]";
	}
	
	
	

	
	
	
}
