package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	// AA-101
	public void m1() {
		System.out.println("Hello Gaurav");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int a = 10;
		int b = 20;
		int age=12;
		if(age == 12)
		{
			System.out.println("");
		}
	}

	public void m2() {
		int a =10;
		int b=20;
		System.out.println("M2");
	}
	
}
