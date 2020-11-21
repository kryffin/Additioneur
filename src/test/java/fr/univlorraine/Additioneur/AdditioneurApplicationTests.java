package fr.univlorraine.Additioneur;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class AdditioneurApplicationTests {

	@Test
	public void return_null_when_no_num() {
		when().get("/adder/current").then().body(equalTo("0"));
	}

	@Test
	public void return_num_when_adding_num() {
		given().queryParam("num", "10").get("/adder/add").then().body(equalTo("10"));
	}

	@Test
	public void return_num_when_substracting_num() {
		given().queryParam("num", "10").get("/adder/sub").then().body(equalTo("-10"));
	}

	@Test
	public void return_zero_when_multiplying_num() {
		given().queryParam("num", "1000").get("/adder/time").then().body(equalTo("0"));
	}

	@Test
	public void return_one_when_dividing_zero() {
		given().queryParam("num", "0").get("/adder/sub").then().body(equalTo("0"));
	}

}
