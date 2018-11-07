package aopannotation;

public class TestBean {
	private String testSrt="testStr";

	public String getTestSrt() {
		return testSrt;
	}

	public void setTestSrt(String testSrt) {
		this.testSrt = testSrt;
	}
	
	public void test(){
		System.out.println("test");
		System.out.println("test2");
	}
}