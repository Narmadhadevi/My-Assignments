package week3.assignment1w3;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.python();
		obj.Java();
		obj.Ruby();
		obj.Selenium();
	}

	public void Java() {
		System.out.println("java");

	}

	public void Selenium() {
		System.out.println("selenium");

	}

	@Override
	public void Ruby() {
		System.out.println("ruby");

	}

}
