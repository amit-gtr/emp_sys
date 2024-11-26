package in.ems.emp_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmpSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpSysApplication.class, args);
		
		
	}
	@GetMapping("/")
	public String wellc() {
		return "hey Buddy";
	}

}
