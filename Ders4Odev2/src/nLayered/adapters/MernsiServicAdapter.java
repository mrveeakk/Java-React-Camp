package nLayered.adapters;

import java.rmi.RemoteException;

import MernisServiceReference.KPSPublicSoapProxy;
import nLayered.business.abstracts.CustomerCheckService;
import nLayered.entities.concretes.Customer;
public class MernsiServicAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		MernisServiceReference.KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		Long nationality=Long.parseLong(customer.getNationalityID());
		boolean result=true;
		try {		
		result= client.TCKimlikNoDogrula(nationality,customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOFBirth().getYear());
		}
		catch(RemoteException  e) {
			e.printStackTrace();
		}
		return result;
	}

}
