package myJava;

public class EqualsTest {
	
	public static class Car {
		private String name;
		private int number;
		
		public Car() {
			
		}
		
		public Car(String name, int number) {
			this.name = name;
			this.number = number;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getNumber() {
			return number;
		}
		
		public void setNumber(int number) {
			this.number = number;
		}
		
		// equals 재정의 해주어야 함 
		@Override
		public boolean equals(Object object) {
			
			if (this == object) return true; // 같은 주소에 있는 동일한 객체 
			
			if (object instanceof Car) {
				Car obj = (Car)object; // Car 객체로 아예 변환시키기 
				return this.getName().equals(obj.getName()) &&
						this.getNumber() == obj.getNumber();
			} 
			else return false;
		}
	}
	
	public static void main(String[] args) {
		Car car01 = new Car("Avante", 1234);
		// Car car02 = new Car("Genesis", 2345);
		Car car03 = new Car("Avante", 1234);
		
		int hashCode01 = car01.hashCode();
		// int hashCode02 = car02.hashCode();
		int hashCode03 = car03.hashCode();
		
		System.out.println(car01.equals(car03)); // 새로 재정의한 equals 메소드는 내용이 같으면 true 
		System.out.println(hashCode01 == hashCode03);
	}
}