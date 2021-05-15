package nLayered.business.concretes;

import nLayered.business.abstracts.CustomerCheckService;
import nLayered.dataAccess.abstracts.BaseCustomerManager;
import nLayered.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckSrvice;
	
	public NeroCustomerManager(CustomerCheckService customerCheckSrvice) {
		this.customerCheckSrvice = customerCheckSrvice;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckSrvice.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {

			System.out.println("Not a valid person");
		}

	}

}
