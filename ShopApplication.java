package com.debbie.shop;

import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		//프로젝트를 실행할 때 main 메서드 먼저 작동
		SpringApplication.run(ShopApplication.class, args);

		final String lover = "김말자";
		final int husbandCount = 1;
		System.out.println(husbandCount);

		Test test = new Test();
		System.out.println(test.name);
		test.hello();

		var myfriend=new Friend("Cheol");
		System.out.println(myfriend.name);

		var object= new myObject();
		System.out.println(object.getMyName());
		System.out.println(object.getMyAge());

		object.setMyAge(12);
		int ageHere=object.getMyAge();
		System.out.println(ageHere);
	}

}

class Test{
	String name="kim";
	void hello(){
		System.out.println("안녕");
	}
}

class Friend{
	String name="kim";
	int age=20;
	//constructor 즉 생성자
	Friend(String name){
		this.name=name;
	}
}

class myObject{
	private String myName="김단비";
	@Setter
	private Integer myAge=25;
	public Integer plusOneAge(){
		myAge++;
		return myAge;
	}

	public String getMyName() {
		return myName;
	}
	public Integer getMyAge() {
		return myAge;
	}
}