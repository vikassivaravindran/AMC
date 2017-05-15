package com.accenture.amc;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	public HashMap<Long,String> hm = new HashMap<Long,String>();
	
@RequestMapping(value="/customer/get/{customerId}", method = RequestMethod.GET)
public String getByCustomerId(@PathVariable Long customerId){
	
	hm.put((long) 1,"Vineeth");
	hm.put((long) 2, "Vikas");
	return  (String) hm.get(customerId);
	
}

@RequestMapping(value="/customer/post" , method=RequestMethod.POST)
public @ResponseBody Customer insertCustomers(@RequestBody Customer customer){
	
	hm.put(customer.getCustomerId(),customer.getCustomerName());
	return customer;
}


}
