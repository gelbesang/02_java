package book.vo;

/**
 * 가격 검색에 사용 되는
 * 최저가, 최고가를 멤버변수로 갖는 클래스
 * 
 * @author Taim
 *
 */
public class Price {

		private int min;
		private int max;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + max;
			result = prime * result + min;
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
			Price other = (Price) obj;
			if (max != other.max)
				return false;
			if (min != other.min)
				return false;
			return true;
		}
		
		public int getMin() {
			return min;
		}
		public void setMin(int min) {
			this.min = min;
		}
		public int getMax() {
			return max;
		}
		public void setMax(int max) {
			this.max = max;
		}
		public Price(int min, int max) {
			super();
			this.min = min;
			this.max = max;
		}
		
		
}
