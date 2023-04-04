package week1.day1;

public class Mobile {
	
	public void sendSms(String mobileModel, float mobileWeight)
	{
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void makeCall(boolean fullyCharged, int mobileCost)
	{
		System.out.println(fullyCharged);
		System.out.println(mobileCost);
	}

	public static void main(String[] args) {
		
		Mobile mb=new Mobile();
		mb.sendSms("RM000123", 177.5f);
		mb.makeCall(true, 22000);
	}

}
