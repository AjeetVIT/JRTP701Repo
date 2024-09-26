package in.wipro.ajeet.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.wipro.ajeet.model.Customer;

@RestController
public class CustomerOperationsController {
	@GetMapping("/show")
	public ResponseEntity<Customer>showCustomerData(){
		Customer cust=new Customer(101,"Rajesh","hyd",990.50);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
		
	}

}
