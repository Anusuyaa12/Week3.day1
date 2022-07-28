package Week3.day1;

public class Automation extends MultipleLangauge{


	public void Selenium() {
		System.out.println("selenium");

	}

	public void Java() {
		System.out.println("java");

	}

	public void python() {
		System.out.println("python");

	}

	public static void main(String[] args) {

		Automation a=new Automation();
		a.Java();
		a.Selenium();
		a.python();
		a.ruby();
	}
}