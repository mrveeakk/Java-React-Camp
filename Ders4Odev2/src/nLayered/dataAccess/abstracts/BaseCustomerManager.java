package nLayered.dataAccess.abstracts;

import nLayered.business.abstracts.CustomerService;
import nLayered.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to db "+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
