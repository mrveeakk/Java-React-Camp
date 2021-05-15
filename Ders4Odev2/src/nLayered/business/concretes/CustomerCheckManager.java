package nLayered.business.concretes;

import nLayered.business.abstracts.CustomerCheckService;
import nLayered.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {		
		
		return true;

		
	}

}
