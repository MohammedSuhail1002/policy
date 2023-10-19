package com.staragile.insurance.policy;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

	@RequestMapping("hello")
	public String doSomething(){
		return "Hello World!!!";
	}
	
	@RequestMapping("/policy")
	public List<Policy> getCompanies(){
		return Arrays.asList(
				new Policy("1", "Tousif", "Tousif address", "123456789"),
				new Policy("2", "Yashwant", "Yashwant address", "234567891"),
				new Policy("3", "Krishna", "Krishna address", "345678912")
		);
	}
}
	
  