package nLayered;

import java.time.LocalDate;

import nLayered.adapters.MernsiServicAdapter;
import nLayered.business.concretes.NeroCustomerManager;
import nLayered.business.concretes.StarbucksCustomerManager;
import nLayered.dataAccess.abstracts.BaseCustomerManager;
import nLayered.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManger=new NeroCustomerManager(new MernsiServicAdapter());
		Customer customer =new Customer(1,"Merve","Ak",LocalDate.of(1997, 01, 19),"570");
		customerManger.Save(customer);

	}

}
