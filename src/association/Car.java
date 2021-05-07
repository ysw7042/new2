package association;

//자동차 정보(모델명, 생산년도, 엔진)를 저장하기 위한 클래스
public class Car {
	private String modelName;
	private int productionYear;
	//엔진정보(Engine 인스턴스)를 저장하기 위한 참조 필드 (Association) - 연관 관계,포함 관계
	// => 포함관계가 성립되기 위해서는 생성자 또는 Setter 메소드를 이용하여 필드에 인스턴스 저장
	private Engine carEngine; 
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String modelName, int productionYear, Engine carengine) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.carEngine= carengine;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	
	public void carDisplay() {
		System.out.println("모델명 = "+modelName);
		System.out.println("생산년도 = "+productionYear);
		//System.out.println("엔진정보 = "+carengine);
		
		//참조필드에 저장된 인스턴스로 메소드 호출 
		// => 참조필드에 인스턴스가 저장되어 있지 않은 상태에서 메소드 호출시 NullPointException 발생
		// NullPointException : 참조변수에 NULL이 저장된 상태에서 메소드를 호출할 경우 발생되는 예외
		/*
		System.out.println("연료타입 = "+carEngine.getFualType());
		System.out.println("배기량 = "+carEngine.getDisplacement());
		*/
		carEngine.enginedisplay();
		System.out.println("==============================================================");
	}
	
}
