interface olaCustomer{
	void bookCab();
	void findARide();
	void rentCab();
	void rateDriver();
	void scheduleCab();
	void addMoneytoWallet();
	void raiseTicket();
	void signup();
	void signIn();
}
interface olaDriver{
	void acceptBooking();
	void getCustomerLocation();
	void setAvailableStatus();
	void getMyCommission();
	void raiseMoneyTransferRequest();
	void callCustomer();
	void setUpYourVehicle();
	void customerFeedback();
}
interface olaOwner{
	void getDriveRecords();
	void getReportByDriverID();
	void getReportByRegion();
	void getTotalRevenue();
	void getCustomersFeedback();
	void addDriver();
	void removeDriver();
	void changeDriverStatus();
}
public class L7C1 implements olaOwner,olaDriver,olaCustomer {
	public static void main(String[] args) {
		olaCustomer cust = new L7C1();
		olaDriver manoj = new L7C1();
		manoj.acceptBooking();//This is how you practice abstraction
	}
	@Override
	public void bookCab() {
		// TODO Auto-generated method stub
	}
	@Override
	public void findARide() {
		// TODO Auto-generated method stub
	}
	@Override
	public void rentCab() {
		// TODO Auto-generated method stub
	}
	@Override
	public void rateDriver() {
		// TODO Auto-generated method stub
	}
	@Override
	public void scheduleCab() {
		// TODO Auto-generated method stub
	}
	@Override
	public void addMoneytoWallet() {
		// TODO Auto-generated method stub
	}
	@Override
	public void raiseTicket() {
		// TODO Auto-generated method stub
	}
	@Override
	public void signup() {
		// TODO Auto-generated method stub
	}
	@Override
	public void signIn() {
		// TODO Auto-generated method stub
	}
	@Override
	public void acceptBooking() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getCustomerLocation() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setAvailableStatus() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getMyCommission() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void raiseMoneyTransferRequest() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void callCustomer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setUpYourVehicle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void customerFeedback() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getDriveRecords() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getReportByDriverID() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getReportByRegion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getTotalRevenue() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getCustomersFeedback() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addDriver() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeDriver() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changeDriverStatus() {
		// TODO Auto-generated method stub
		
	}
}